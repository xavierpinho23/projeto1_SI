package firstproject;

import java.util.Scanner;

public class JorgeMelo_XavierPinho
{
public static void main(String[] args)
{
	//SOKOBAN
				
//cenário do nível 1
	System.out.println("NÍVEL 1");
	System.out.println("      *******");
	System.out.println("      *     *");
	System.out.println("      *     **********");
	System.out.println("*******              *");
	System.out.println("*              *******");
	System.out.println("*********      *");
	System.out.println("        *      *");
	System.out.println("        ********");


//cenário do nível 2
	System.out.println("NÍVEL 2");
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
	System.out.println("Escolher nível: ");
	int level = scan.nextInt();
	scan.nextLine();
	
	String[][] table1 = new String[8][22]; //matriz do nivel 1
	String[][] table2 = new String[9][25]; //matriz do nivel 2
	
	if (level==1)
	{
		int k=4;
		int l=12;
		for (int i=0;i<table1.length;i++) // i vai de 0 até 7
			{ 
			for (int j=0;j<table1[0].length;j++)  //j vai de 0 até 21
			{
				if (i==0)
				{
					if (j>5 && j<13) 
					{
						table1[i][j]="*";
					}
					else
					{
						table1[i][j]=" ";
					}
				}
				else if (i==1) 
				{
					if (j==6 || j==12) 
					{
						table1[i][j]="*";
					}
					else 
					{
						table1[i][j]=" ";
					}
				}
				else if (i==2)
				{
					if (j==6 || j>11) 
					{
						table1[i][j]="*";
					}
					else 
					{
						table1[i][j]=" ";
					}
				}
				else if (i==3) 
				{
					if (j<7 || j==21) 
					{
						table1[i][j]="*";
					}
					else 
					{
						table1[i][j]=" ";
					}
				}
				else if (i==4) 
				{
					if (j==0 || j>14) 
					{
						table1[i][j]="*";
					}
					else 
					{
						table1[i][j]=" ";
					}
				}
				else if (i==5)
				{
					if (j<10 || j==15) 
					{
						table1[i][j]="*";
					}
					else 
					{
						table1[i][j]=" ";
					}
				}
				else if (i==6) 
				{
					if (j==9 || j==15)
					{
						table1[i][j]="*";
					}
					else
					{
						table1[i][j]=" ";
					}
				}
				else if (i==7) 
				{
					if (j>8 && j<16) 
					{
						table1[i][j]="*";
					}
					else
					{
						table1[i][j]=" ";
					}
				}
				//posições das caixas, trabalhador e locais de armazenamento
				table1[1][9] = "X";
				table1[3][9] = "B";
				table1[3][15] = "B";
				table1[3][18] = "X";
				table1[4][3] = "X";
				table1[4][9] = "B";
				table1[k][l] = "M";
				table1[5][12] = "B";
				table1[6][12] = "X";
				
				System.out.print(table1[i][j] + " ");
			}
			System.out.println();
		}
		
		while (table1[1][9].equals("X") && table1[3][18].equals("X") && table1[4][3].equals("X") && table1[6][12].equals("X")) 
		{
			System.out.println("Prima W,A,S e D para se mover: ");
			String tecla = scan.nextLine();
			table1[k][l]=" ";

			if (tecla.equals("a"))
			{
				l--;	
			}
			if (tecla.equals("s")) 
			{
				k++;
			}
			if (tecla.equals("d")) 
			{
				l++;
			}
			if (tecla.equals("w"))
			{
				k--;
			}
			table1[k][l]="M"; //nova posição do trabalhador M

			for (int i=0;i<table1.length;i++) 
			{
				for (int j=0;j<table1[0].length;j++) 
				{
					System.out.print(table1[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	else if (level == 2)
	{
		int k=2;
		int l=7;
		for (int i=0;i<table2.length;i++) // i vai de 0 até 8
			{ 
			for (int j=0;j<table2[0].length;j++)  //j vai de 0 até 24
			{
				if (i==0)
				{
					if (j<13) 
					{
						table2[i][j]="*";
					}
					else
					{
						table2[i][j]= " ";
					}
				}
				else if (i==1) 
				{
					if (j==0 || j==12) 
					{
						table2[i][j]="*";
					}
					else 
					{
						table2[i][j]=" ";
					}
				}
				else if (i==2)
				{
					if (j==0 || j==12 || j>17) 
					{
						table2[i][j]="*";
					}
					else 
					{
						table2[i][j]=" ";
					}
				}
				else if (i==3) 
				{
					if (j==0 || j==12 || j==18 || j==24) 
					{
						table2[i][j]="*";
					}
					else 
					{
						table2[i][j]=" ";
					}
				}
				else if (i==4) 
				{
					if (j<7 || j>11 && j<19 || j==24) 
					{
						table2[i][j]="*";
					}
					else 
					{
						table2[i][j]=" ";
					}
				}
				else if (i==5)
				{
					if ((j>2 && j<7) || j==24) 
					{
						table2[i][j]="*";
					}
					else 
					{
						table2[i][j]=" ";
					}
				}
				else if (i==6) 
				{
					if (j==3 || (j>14 && j<19) || j==24)
					{
						table2[i][j]="*";
					}
					else
					{
						table2[i][j]=" ";
					}
				}
				else if (i==7) 
				{
					if (j==3 || j==15 || j>17) 
					{
						table2[i][j]="*";
					}
					else
					{
						table2[i][j]=" ";
					}
				}
				else if (i==8)
				{
					if (j>2 && j<16)
					{
						table2[i][j] = "*";
					}
					else
					{
						table2[i][j] = " ";
					}
				}
			
			//posições das caixas, trabalhador e locais de armazenamento
			table2[3][22] = "X";
			table2[2][6] = "B";
			table2[3][6] = "B";
			table2[5][22] = "X";
			table2[6][22] = "X";
			table2[3][7] = "B";
			table2[k][l] = "M";
			
			System.out.print(table2[i][j] + " ");
		}
		System.out.println();
	}
		while (table2[3][22].equals("X") && table2[5][22].equals("X")  && table2[6][22].equals("X")) 
		{
			System.out.println("Prima W,A,S e D para se mover: ");
			String tecla = scan.nextLine();
			table2[k][l]=" ";

			if (tecla.equals("a")) 
			{
				l--;	
			}
			if (tecla.equals("s")) 
			{
				k++;
			}
			if (tecla.equals("d")) 
			{
				l++;
			}
			if (tecla.equals("w"))
			{
				k--;
			}
			table2[k][l]="M"; //nova posição do trabalhador M

			for (int i=0;i<table2.length;i++) 
			{
				for (int j=0;j<table2[0].length;j++) 
				{
					System.out.print(table2[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	else 
	{
		System.out.println("Erro na escolha do nível!");
	}
		
	scan.close();
}
}
