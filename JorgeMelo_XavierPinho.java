package firstproject;

import java.util.Scanner;

public class JorgeMelo_XavierPinho
{
public static void main(String[] args)
{	
	//SOKOBAN
				
	System.out.println("WELCOME TO SOKOBAN!");

//Display of level 1
	System.out.println("LEVEL 1");
	System.out.println("      *******");
	System.out.println("      *     *");
	System.out.println("      *     **********");
	System.out.println("*******              *");
	System.out.println("*              *******");
	System.out.println("*********      *");
	System.out.println("        *      *");
	System.out.println("        ********");

//Display of level 2
	System.out.println("LEVEL 2");
	System.out.println("*************");
	System.out.println("*           *");
	System.out.println("*           *");
	System.out.println("*           *     *******");
	System.out.println("*           *     *     *");
	System.out.println("*******     *******     *");
	System.out.println("   ****                 *");
	System.out.println("   *           ****     *");
	System.out.println("   *           *  *******");
	System.out.println("   *************");
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Choose a level!");
	int level = scan.nextInt();
	scan.nextLine();
	
	String[][] table1 = new String[8][22];  //matrix of level 1
	String[][] table2 = new String[9][25];  //matrix of level 2
		
	if (level==1)
	{
		int yM = 4;    //original row of M
		int xM = 12;   //original column of M
		int y1M = yM;  //new row of M
		int x1M = xM;  //new column of M
		
		int yX1=1; int yX2=3; int yX3=4; int yX4=6; //turned B and X positions into variables, so we can change them
		int xX1=9; int xX2=18; int xX3=3; int xX4=12;
		
		int yB1=3; int yB2=3; int yB3=4; int yB4=5;
		int xB1=9; int xB2=15; int xB3=9; int xB4=12;
		
		for (int i=0;i<table1.length;i++) //i goes from 0 to 7
		{ 
		for (int j=0;j<table1[0].length;j++)  //j goes from 0 to 21
		{
			table1[i][j] = " ";
		}
		}
		for (int i=0;i<table1.length;i++) //i goes from 0 to 7
			{ 
			for (int j=0;j<table1[0].length;j++)  //j goes from 0 to 21
			{
				if (i==0)
				{
					if (j>5 && j<13) 
					{
						table1[i][j]="*";
					}
				}
				else if (i==1) 
				{
					if (j==6 || j==12) 
					{
						table1[i][j]="*";
					}
				}
				else if (i==2)
				{
					if (j==6 || j>11) 
					{
						table1[i][j]="*";
					}
				}
				else if (i==3) 
				{
					if (j<7 || j==21) 
					{
						table1[i][j]="*";
					}
				}
				else if (i==4) 
				{
					if (j==0 || j>14) 
					{
						table1[i][j]="*";
					}
				}
				else if (i==5)
				{
					if (j<10 || j==15) 
					{
						table1[i][j]="*";
					}
				}
				else if (i==6) 
				{
					if (j==9 || j==15)
					{
						table1[i][j]="*";
					}
				}
				else if (i==7) 
				{
					if (j>8 && j<16) 
					{
						table1[i][j]="*";
					}
				}
				// positions of boxes B, worker M and storage locations X of level 1
				table1[yX1][xX1] = "X"; 
				table1[yB1][xB1] = "B";
				table1[yB2][xB2] = "B";
				table1[yX2][xX2] = "X";
				table1[yX3][xX3] = "X";
				table1[yB3][xB3] = "B";
				table1[yM][xM] = "M";
				table1[yB4][xB4] = "B";
				table1[yX4][xX4] = "X";
				
				System.out.print(table1[i][j] + " ");
			}
			System.out.println();
		}
		//while the boxes B are not in the storage location X, the level is not finished
		while (!table1[yX1][xX1].equals("B") || !table1[yX2][xX2].equals("B") || !table1[yX3][xX3].equals("B") || !table1[yX4][xX4].equals("B")) 
		{
			System.out.println("Use W,A,S e D to move: ");
			String tecla = scan.nextLine();
			table1[yM][xM]=" ";
			y1M=yM;
			x1M=xM;

			if (tecla.equals("a"))
			{
				x1M--;	
			}
			else if (tecla.equals("s")) 
			{
				y1M++;
			}
			else if (tecla.equals("d")) 
			{
				x1M++;
			}
			else if (tecla.equals("w"))
			{
				y1M--;
			}
			else if (tecla.equals("q"))
			{
				
			}
			else if (tecla.equals("x"))
			{
				System.exit(0);
			}
			if (table1[y1M][x1M].equals("*")) //If the future position of worker M is occupied by "*" the system doesn't evolves
			{
				y1M=yM;
				x1M=xM;
			}
			if (y1M==yB1 && x1M==xB1)
			{
				//If the future position of B is occupied by "*" or "B" the system doesn't evolves
				if (table1[yB1+(y1M-yM)][xB1+(x1M-xM)].equals("*") || table1[yB1+(y1M-yM)][xB1+(x1M-xM)].equals("B") ) 
				{
					y1M=yM;
					x1M=xM;
				}
				else
				{
					table1[yB1][xB1]=" ";
					table1[yB1+(y1M-yM)][xB1+(x1M-xM)]="B";
				
					yB1=yB1+(y1M-yM);
					xB1=xB1+(x1M-xM);
				}
			}
			else if (y1M==yB2 && x1M==xB2)
			{
				//If the future position of B is occupied by "*" or "B" the system don't evolves
				if (table1[yB2+(y1M-yM)][xB2+(x1M-xM)].equals("*") || table1[yB2+(y1M-yM)][xB2+(x1M-xM)].equals("B") )
				{
					y1M=yM;
					x1M=xM;
				}
				else
				{
					table1[yB2][xB2]=" ";
					table1[yB2+(y1M-yM)][xB2+(x1M-xM)]="B";
				
					yB2=yB2+(y1M-yM);
					xB2=xB2+(x1M-xM);
				}
			}
			else if (y1M==yB3 && x1M==xB3)
			{
				//If the future position of B is occupied by "*" or "B" the system don't evolves
				if (table1[yB3+(y1M-yM)][xB3+(x1M-xM)].equals("*") || table1[yB3+(y1M-yM)][xB3+(x1M-xM)].equals("B") )
				{
					y1M=yM;
					x1M=xM;
				}
				else
				{
					table1[yB3][xB3]=" ";
					table1[yB3+(y1M-yM)][xB3+(x1M-xM)]="B";
				
					yB3=yB3+(y1M-yM);
					xB3=xB3+(x1M-xM);
				}
			}
			else if (y1M==yB4 && x1M==xB4)
			{
				//If the future position of B is occupied by "*" or "B" the system don't evolves
				if (table1[yB4+(y1M-yM)][xB4+(x1M-xM)].equals("*") || table1[yB4+(y1M-yM)][xB4+(x1M-xM)].equals("B") )
				{
					y1M=yM;
					x1M=xM;
				}
				else
				{
					table1[yB4][xB4]=" ";
					table1[yB4+(y1M-yM)][xB4+(x1M-xM)]="B";
				
					yB4=yB4+(y1M-yM);
					xB4=xB4+(x1M-xM);
				}
			}
			
			if (!(y1M==yX1 && x1M==xX1) && !(xB1==yX1 && yB1==xX1) && !(xB2==yX1 && yB2==xX1) && !(xB3==yX1 && yB3==xX1) && !(xB4==yX1 && yB4==xX1)) 
				//if nothing is in X1 position X will appear
			{
				table1[yX1][xX1]="X";
			}
			if (!(y1M==yX2 && x1M==xX2) && !(xB1==yX2 && yB1==xX2) && !(xB2==yX2 && yB2==xX2) && !(xB3==yX2 && yB3==xX2) && !(xB4==yX2 && yB4==xX2)) 
				//if nothing is in X2 position X will appear
			{
				table1[yX2][xX2]="X";
			}
			if (!(y1M==yX3 && x1M==xX3) && !(xB1==yX3 && yB1==xX3) && !(xB2==yX3 && yB2==xX3) && !(xB3==yX3 && yB3==xX3) && !(xB4==yX3 && yB4==xX3))  
				//if nothing is in X3 position X will appear
			{
				table1[yX3][xX3]="X";
			}
			if (!(y1M==yX4 && x1M==xX4) && !(xB1==yX4 && yB1==xX4) && !(xB2==yX4 && yB2==xX4) && !(xB3==yX4 && yB3==xX4) && !(xB4==yX4 && yB4==xX4))  
				//if nothing is in X4 position X will appear
			{
				table1[yX4][xX4]="X";
			}
			
			//This guarantee that M and B will appear if they are in X positions

			table1[yB1][xB1] = "B";
			table1[yB2][xB2] = "B";
			table1[yB3][xB3] = "B";
			table1[y1M][x1M] = "M";
			table1[yB4][xB4] = "B";
			
			yM=y1M;
			xM=x1M;
			
			for (int i=0;i<table1.length;i++) 
			{
				for (int j=0;j<table1[0].length;j++) 
				{
					System.out.print(table1[i][j]+ " ");
				}
				System.out.println();
			}
		}
		//this guarantee that if level 1 is completed it goes to level 2
		level = 2;
		System.out.println("Congratulations! You're now going to level 2, Good Luck!");

		
	}			
	//if instead of else if allows to go level 1 -> level 2
	if (level == 2)
	{		
		int yM=2;  // original row of M
		int xM=7;  // original column of M
		int y1M=yM; // new row of M
		int x1M=xM; // new column of M
		
		int yX1=3; int yX2=4; int yX3=5;  //turned B and X positions into variables, so we can change them
		int xX1=22; int xX2=22; int xX3=22;
		
		int yB1=2; int yB2=3; int yB3=3; 
		int xB1=6; int xB2=6; int xB3=7;
		
		for (int i=0;i<table2.length;i++) //i goes from 0 to 7
		{ 
		for (int j=0;j<table2[0].length;j++)  //j goes from 0 to 21
		{
			table2[i][j] = " "; //fill the matrix with empty spaces
		}
		}
				
		for (int i=0;i<table2.length;i++) // i goes from 0 to 8
			{ 
			for (int j=0;j<table2[0].length;j++)  //j goes from 0 to 24
			{			
				if (i==0)
				{
					if (j<13) 
					{
						table2[i][j]="*";
					}
				}
				else if (i==1) 
				{
					if (j==0 || j==12) 
					{
						table2[i][j]="*";
					}
				}
				else if (i==2)
				{
					if (j==0 || j==12 || j>17) 
					{
						table2[i][j]="*";
					}
				}
				else if (i==3) 
				{
					if (j==0 || j==12 || j==18 || j==24) 
					{
						table2[i][j]="*";
					}
				}
				else if (i==4) 
				{
					if (j<7 || j>11 && j<19 || j==24) 
					{
						table2[i][j]="*";
					}
				}
				else if (i==5)
				{
					if ((j>2 && j<7) || j==24) 
					{
						table2[i][j]="*";
					}
				}
				else if (i==6) 
				{
					if (j==3 || (j>14 && j<19) || j==24)
					{
						table2[i][j]="*";
					}
				}
				else if (i==7) 
				{
					if (j==3 || j==15 || j>17) 
					{
						table2[i][j]="*";
					}
				}
				else if (i==8)
				{
					if (j>2 && j<16)
					{
						table2[i][j] = "*";
					}
				}
			
			// positions of boxes B, worker M and storage locations X of level 2
			table2[yX1][xX1] = "X";
			table2[yB1][xB1] = "B";
			table2[yB2][xB2] = "B";
			table2[yX2][xX2] = "X";
			table2[yX3][xX3] = "X";
			table2[yB3][xB3] = "B";
			table2[yM][xM] = "M";
			
			System.out.print(table2[i][j] + " ");
		}
		System.out.println();
	}
		//while the boxes B are not in the storage location X, the level is not finished
		while (!table2[yX1][xX1].equals("B") || !table2[yX2][xX2].equals("B")  || !table2[yX3][xX3].equals("B")) 
		{
			System.out.println("Use W,A,S e D to move: ");
			String tecla = scan.nextLine();
			table2[yM][xM]=" ";
			y1M=yM;
			x1M=xM;

			if (tecla.equals("a")) 
			{
				x1M--;
				
			}
			if (tecla.equals("s")) 
			{
				y1M++;
			}
			if (tecla.equals("d")) 
			{
				x1M++;
			}
			if (tecla.equals("w"))
			{
				y1M--;
			}
			if (tecla.equals("q"))
			{
				return;
			}
			if (tecla.equals("x"))
			{
				System.exit(0);

			}
			if (table2[y1M][x1M].equals("*")) //If the future position of worker M is occupied by "*" the system doesn't evolves
			{
				y1M=yM;
				x1M=xM;
			}
			if (y1M==yB1 && x1M==xB1)
			{
				//If the future position of B is occupied by "*" or "B" the system don't evolves
				if (table2[yB1+(y1M-yM)][xB1+(x1M-xM)].equals("*") || table2[yB1+(y1M-yM)][xB1+(x1M-xM)].equals("B") ) 
				{
					y1M=yM;
					x1M=xM;
				}
				else
				{
					table2[yB1][xB1]=" ";
					table2[yB1+(y1M-yM)][xB1+(x1M-xM)]="B";
				
					yB1=yB1+(y1M-yM);
					xB1=xB1+(x1M-xM);
				}
			}
			if (y1M==yB2 && x1M==xB2)
			{
				//If the future position of B is occupied by "*" or "B" the system don't evolves
				if (table2[yB2+(y1M-yM)][xB2+(x1M-xM)].equals("*") || table2[yB2+(y1M-yM)][xB2+(x1M-xM)].equals("B") )
				{
					y1M=yM;
					x1M=xM;
				}
				else
				{
					table2[yB2][xB2]=" ";
					table2[yB2+(y1M-yM)][xB2+(x1M-xM)]="B";
				
					yB2=yB2+(y1M-yM);
					xB2=xB2+(x1M-xM);
				}
			}
			if (y1M==yB3 && x1M==xB3)
			{
				//If the future position of B is occupied by "*" or "B" the system don't evolves
				if (table2[yB3+(y1M-yM)][xB3+(x1M-xM)].equals("*") || table2[yB3+(y1M-yM)][xB3+(x1M-xM)].equals("B") )
				{
					y1M=yM;
					x1M=xM;
				}
				else
				{
					table2[yB3][xB3]=" ";
					table2[yB3+(y1M-yM)][xB3+(x1M-xM)]="B";
				
					yB3=yB3+(y1M-yM);
					xB3=xB3+(x1M-xM);
				}
			}
			if (!(y1M==yX1 && x1M==xX1) && !(yB1==yX1 && xB1==xX1) && !(yB2==yX1 && xB2==xX1) && !(yB3==yX1 && xB3==xX1)) 
				//if nothing is in X1 position X will appear
			{
				table2[yX1][xX1]="X";
			}
			if (!(y1M==yX2 && x1M==xX2) && !(yB1==yX2 && xB1==xX2) && !(yB2==yX2 && xB2==xX2) && !(yB3==yX2 && xB3==xX2)) 
				//if nothing is in X2 position X will appear
			{
				table2[yX2][xX2]="X";
			}
			if (!(y1M==yX3 && x1M==xX3) && !(yB1==yX3 && xB1==xX3) && !(yB2==yX3 && xB2==xX3) && !(yB3==yX3 && xB3==xX3))  
				//if nothing is in X3 position X will appear
			{
				table2[yX3][xX3]="X";
			}
			
			table2[y1M][x1M] = "M"; //This guarantee that M and B will appear if they are in X positions
			table2[yB1][xB1] = "B";
			table2[yB2][xB2] = "B";
			table2[yB3][xB3] = "B";
			yM=y1M;
			xM=x1M;	

			for (int i=0;i<table2.length;i++) 
			{
				for (int j=0;j<table2[0].length;j++) 
				{
					System.out.print(table2[i][j] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("Congratulations! You have completed the game!");

	}
	else 
	{
		System.out.println("Error choosing level!");
	}
	scan.close();
}
}