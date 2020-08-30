package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		/*a série de Fibonacci é formada pela sequência
		1,1,2,3,5,8,13,21,34,55,...
		faça um programa capaz de gerar a série
		até o n-ésimo termo.				
		*/
		int i=0, num, termo1=0,termo2=1, sum=0;				
		try {
			
			Scanner scan = new Scanner (System.in);
			
			 System.out.println("Digite um número inteiro:");
			 num =scan.nextInt();
			 
			 for (i=0;i<=num;i++) {
				 
				 sum=termo1+termo2;
//( 0+1 sum=1, 1+1 sum=2, 1+2 sum=3, 2+3 sum=5, 3+5 sum=8, 5+8 sum=13, 8+13 sum=21, 13+21 sum =34, 21+34 sum =55)
				 termo1=termo2;
//(1,1,2,3,5,8,13,21,34				 
				 termo2=sum;			 
//(1,2,3,5,8,13,21,34,55					 
				 System.out.println(termo1);//(1,1,2,3,5,8,13,21,34			 
			 }			
			
		}catch(java.util.InputMismatchException e ) {
			System.out.println("Digite apenas números inteiros!");
			main (args);
	}
}
}




