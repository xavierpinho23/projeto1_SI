import java.util.Scanner;
public class First
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Escolher n�vel: ");
	int level = scan.nextInt();
	scan.nextLine();
	String[][] table1 = new String[8][22];
	String[][] table2 = new String[9][25];
	if (level==1);
		int k=4; int k1=k;
		int l=12; int l1=l;
		int xx1=1; int xx2=3; int xx3=4; int xx4=6;
		int yy1=9; int yy2=18; int yy3=3; int yy4=12;
		int bb1=3; int bb2=3; int bb3=4; int bb4=5;
		int BB1=9; int BB2=15; int BB3=9; int BB4=12;
		
		for (int i=0;i<table1.length;i++) {
			for (int j=0;j<table1[0].length;j++) {
				if (i==0) {
					if (j>5 && j<13) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				else if (i==1) {
					if (j==6 || j==12) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				else if (i==2) {
					if (j==6 || j>11) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				else if (i==3) {
					if ((j>=0 && j<7) || j==21) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				else if (i==4) {
					if (j==0 || j>14) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				else if (i==5) {
					if ((j>=0 && j<10) || j==15) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				else if (i==6) {
					if (j==9 || j==15) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				else if (i==7) {
					if (j>8 && j<16) {
						table1[i][j]="*";
						
					}
					else {
						table1[i][j]=" ";
					}
				}
				table1[xx1][yy1]="X";
				table1[bb1][BB1]="B";
				table1[bb2][BB2]="B";
				table1[xx2][yy2]="X";
				table1[xx3][yy3]="X";
				table1[bb3][BB3]="B";
				table1[k][l]="M";
				table1[bb4][BB4]="B";
				table1[xx4][yy4]="X";
				
				System.out.print(table1[i][j] + " ");
			}
			System.out.println();
		}
		
		while (table1[1][9].equals("X") || table1[3][18].equals("X") || table1[4][3].equals("X") || table1[6][12].equals("X")) {
			System.out.println("Premir a, s, d ou w: ");
			String tecla = scan.nextLine();
			table1[k][l]=" ";
			k1=k;
			l1=l;
			if (tecla.equals("a")) {
				l1--;	
			}
			if (tecla.equals("s")) {
				k1++;
			}
			if (tecla.equals("d")) {
				l1++;
			}
			if (tecla.equals("w")) {
				k1--;
	
			}
			if (k1==bb1 && l1==BB1) {
				table1[bb1][BB1]=" ";
				table1[bb1+(k1-k)][BB1+(l1-l)]="B";
				bb1=bb1+(k1-k);
				BB1=BB1+(l1-l);
			}
			if (k1==bb2 && l1==BB2) {
				table1[bb2][BB2]=" ";
				table1[bb2+(k1-k)][BB2+(l1-l)]="B";
				bb2=bb2+(k1-k);
				BB2=BB2+(l1-l);
			}
			if (k1==bb3 && l1==BB3) {
				table1[bb3][BB3]=" ";
				table1[bb3+(k1-k)][BB3+(l1-l)]="B";
				bb3=bb3+(k1-k);
				BB3=BB3+(l1-l);
			}
			if (k1==bb4 && l1==BB4) {
				table1[bb4][BB4]=" ";
				table1[bb4+(k1-k)][BB4+(l1-l)]="B";
				bb4=bb4+(k1-k);
				BB4=BB4+(l1-l);
			}
			table1[k1][l1]="M";
			k=k1;
			l=l1;
			for (int i=0;i<table1.length;i++) {
				for (int j=0;j<table1[0].length;j++) {
					System.out.print(table1[i][j] + " ");
				}
				System.out.println();
			}
					
			
		}
		System.out.println("CONGRATULATIONS!!!");

}
}