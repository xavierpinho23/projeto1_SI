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
	
	String[][] table1 = new String[8][22]; //matrix of level 1
	String[][] table2 = new String[9][25]; //matrix of level 2
	
	if (level==1)
	{
		int k=4; int k1=k;  // k1 new line position
		int l=12; int l1=l; // l1 new column position
		
		int xx1=1; int xx2=3; int xx3=4; int xx4=6; //turned B and X positions into variables, so that we can change them.
		int yy1=9; int yy2=18; int yy3=3; int yy4=12;
		
		int bb1=3; int bb2=3; int bb3=4; int bb4=5;
		int BB1=9; int BB2=15; int BB3=9; int BB4=12;
		
		int score;
		
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
				//posições das caixas, trabalhador e locais de armazenamento do nível 1
				table1[xx1][yy1] = "X";
				table1[bb1][BB1] = "B";
				table1[bb2][BB2] = "B";
				table1[xx2][yy2] = "X";
				table1[xx3][yy3] = "X";
				table1[bb3][BB3] = "B";
				table1[k][l] = "M";
				table1[bb4][BB4] = "B";
				table1[xx4][yy4] = "X";
				
				System.out.print(table1[i][j] + " ");
			}
			System.out.println();
		}
		//enquanto as posições X não tiverem todas uma caixa B o jogo não acaba
		while (!table1[xx1][yy1].equals("B") || !table1[xx2][yy2].equals("B") || !table1[xx3][yy3].equals("B") || !table1[xx4][yy4].equals("B")) 
		{
			score = 0;
			System.out.println("Prima W,A,S e D para se mover: ");
			String tecla = scan.nextLine();
			table1[k][l]=" ";
			k1=k;
			l1=l;

			if (tecla.equals("a"))
			{
				l1--;	
			}
			if (tecla.equals("s")) 
			{
				k1++;
			}
			if (tecla.equals("d")) 
			{
				l1++;
			}
			if (tecla.equals("w"))
			{
				k1--;
			}
			if (tecla.equals("q"))
			{
				return;
			}
			if (tecla.equals("x"))
			{
				System.exit(0);
			}
			
			if (k1==bb1 && l1==BB1)
			{
				//Se a futura posição de B estiver ocupada por "*"/"B", o sistema não evolui
				if (table1[bb1+(k1-k)][BB1+(l1-l)].equals("*") || table1[bb1+(k1-k)][BB1+(l1-l)].equals("B") ) 
				{
					k1=k;
					l1=l;
				}
				else
				{
					table1[bb1][BB1]=" ";
					table1[bb1+(k1-k)][BB1+(l1-l)]="B";
				
					bb1=bb1+(k1-k);
					BB1=BB1+(l1-l);
				}
			}
			if (k1==bb2 && l1==BB2)
			{
				//Se a futura posição de B estiver ocupada por "*"/"B", o sistema não evolui
				if (table1[bb2+(k1-k)][BB2+(l1-l)].equals("*") || table1[bb2+(k1-k)][BB2+(l1-l)].equals("B") )
				{
					k1=k;
					l1=l;
				}
				else
				{
					table1[bb2][BB2]=" ";
					table1[bb2+(k1-k)][BB2+(l1-l)]="B";
				
					bb2=bb2+(k1-k);
					BB2=BB2+(l1-l);
				}
			}
			if (k1==bb3 && l1==BB3)
			{
				//Se a futura posição de B estiver ocupada por "*"/"B", o sistema não evolui
				if (table1[bb3+(k1-k)][BB3+(l1-l)].equals("*") || table1[bb3+(k1-k)][BB3+(l1-l)].equals("B") )
				{
					k1=k;
					l1=l;
				}
				else
				{
					table1[bb3][BB3]=" ";
					table1[bb3+(k1-k)][BB3+(l1-l)]="B";
				
					bb3=bb3+(k1-k);
					BB3=BB3+(l1-l);
				}
			}
			if (k1==bb4 && l1==BB4)
			{
				//Se a futura posição de B estiver ocupada por "*"/"B", o sistema não evolui
				if (table1[bb4+(k1-k)][BB4+(l1-l)].equals("*") || table1[bb4+(k1-k)][BB4+(l1-l)].equals("B") )
				{
					k1=k;
					l1=l;
				}
				else
				{
					table1[bb4][BB4]=" ";
					table1[bb4+(k1-k)][BB4+(l1-l)]="B";
				
					bb4=bb4+(k1-k);
					BB4=BB4+(l1-l);
				}
			}

			
			table1[k1][l1]="M"; //nova posição do trabalhador M
			k=k1;
			l=l1;
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
		int k=2; int k1=k;  // k1 new line position
		int l=7; int l1=l; // l1 new column position
		
		int xx1=3; int xx2=4; int xx3=5;  //turned B and X positions into variables, so that we can change them.
		int yy1=22; int yy2=22; int yy3=22;
		
		int bb1=2; int bb2=3; int bb3=3; 
		int BB1=6; int BB2=6; int BB3=7;
				
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
			table2[xx1][yy1] = "X";
			table2[bb1][BB1] = "B";
			table2[bb2][BB2] = "B";
			table2[xx2][yy2] = "X";
			table2[xx3][yy3] = "X";
			table2[bb3][BB3] = "B";
			table2[k][l] = "M";
			
			System.out.print(table2[i][j] + " ");
		}
		System.out.println();
	}
		//enquanto as posições X não tiverem todas uma caixa B o jogo não acaba
		while (!table2[xx1][yy1].equals("B") || !table2[xx2][yy2].equals("B")  || !table2[xx3][yy3].equals("B")) 
		{
			System.out.println("Prima W,A,S e D para se mover: ");
			String tecla = scan.nextLine();
			table2[k][l]=" ";
			k1=k;
			l1=l;

			if (tecla.equals("a")) 
			{
				l1--;
				
			}
			if (tecla.equals("s")) 
			{
				k1++;
			}
			if (tecla.equals("d")) 
			{
				l1++;
			}
			if (tecla.equals("w"))
			{
				k1--;
			}
			if (tecla.equals("q"))
			{
				return;
			}
			if (tecla.equals("x"))
			{
				System.exit(0);

			}
			
			if (k1==bb1 && l1==BB1)
			{
				//Se a futura posição de B estiver ocupada por "*"/"B", o sistema não evolui
				if (table2[bb1+(k1-k)][BB1+(l1-l)].equals("*") || table2[bb1+(k1-k)][BB1+(l1-l)].equals("B") ) 
				{
					k1=k;
					l1=l;
				}
				else
				{
					table2[bb1][BB1]=" ";
					table2[bb1+(k1-k)][BB1+(l1-l)]="B";
				
					bb1=bb1+(k1-k);
					BB1=BB1+(l1-l);
				}
			}
			if (k1==bb2 && l1==BB2)
			{
				//Se a futura posição de B estiver ocupada por "*"/"B", o sistema não evolui
				if (table2[bb2+(k1-k)][BB2+(l1-l)].equals("*") || table2[bb2+(k1-k)][BB2+(l1-l)].equals("B") )
				{
					k1=k;
					l1=l;
				}
				else
				{
					table2[bb2][BB2]=" ";
					table2[bb2+(k1-k)][BB2+(l1-l)]="B";
				
					bb2=bb2+(k1-k);
					BB2=BB2+(l1-l);
				}
			}
			if (k1==bb3 && l1==BB3)
			{
				//Se a futura posição de B estiver ocupada por "*"/"B", o sistema não evolui
				if (table2[bb3+(k1-k)][BB3+(l1-l)].equals("*") || table2[bb3+(k1-k)][BB3+(l1-l)].equals("B") )
				{
					k1=k;
					l1=l;
				}
				else
				{
					table2[bb3][BB3]=" ";
					table2[bb3+(k1-k)][BB3+(l1-l)]="B";
				
					bb3=bb3+(k1-k);
					BB3=BB3+(l1-l);
				}
			}
			
			
			table2[k1][l1]="M"; //nova posição do trabalhador M
			k=k1;
			l=l1;
			
			

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
