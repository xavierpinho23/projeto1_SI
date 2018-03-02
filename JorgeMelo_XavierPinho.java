package firstproject;

import java.util.Scanner;

public class JorgeMelo_XavierPinho
{
public static void main(String[] args)
{
	//SOKOBAN
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Que nível pretende jogar? (1/2)");
	int nivel = input.nextInt();
	
	//espaços em branco de diferentes tamanhos
	String dois = new String(new char[2]);
	String tres = new String(new char[3]);
	String cinco = new String(new char[5]);
	String seis = new String(new char[6]);	
	String nove = new String(new char[9]);
	
	if (nivel == 1) 
	{
		
			
//cenário do nível 1
		System.out.println(seis + "*******");
		System.out.println(seis + "*" + cinco + "*");
		System.out.println(seis + "*" + cinco + "**********");
		System.out.println("*******" +nove + cinco + "*");
		System.out.println("*" + nove + cinco + "*******");
		System.out.println("*********" + seis + "*");
		System.out.println(nove + "*" + cinco + "*");
		System.out.println(nove + "*******");

	}
	
	else if (nivel == 2)
	{
		//cenário do nível 2
		System.out.println("*************");
		System.out.println("*" + cinco + seis + "*");
		System.out.println("*" + cinco + seis + "*");
		System.out.println("*" + cinco + seis + "*" + cinco + "*******");
		System.out.println("*" + cinco + seis + "*" + cinco + "*" + cinco + "*");
		System.out.println("*******" + cinco + "*******" + cinco + "*");
		System.out.println(tres + "***" + seis + seis + seis + "*");
		System.out.println(tres + "*" + cinco + seis + "****" + cinco + "*");
		System.out.println(tres + "*" + cinco + seis + "*" + dois + "*******");
		System.out.println(tres + "*************");
	}
	
	else
	{
		System.out.println("Erro na escolha do nível!");
	}
	
	input.close();
	
}



}
