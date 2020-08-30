package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		/*faça um programa que leia 5 números 
		 * e informa a soma
		e a média dos números		  
		  */
		Scanner scan = new Scanner (System.in);
		int i=0;
		double soma=0,media,num1,num2,num3,num4,num5;
		do {  
			System.out.println("Digite 5 números: ");
			num1 = scan.nextDouble();
			i=i+1;
			num2 = scan.nextDouble();
			i=i+1;
			num3 = scan.nextDouble();
			i=i+1;
			num4 = scan.nextDouble();
			i=i+1;
			num5 = scan.nextDouble();
			i=i+1;
					
		}while (i!=5);
		
		soma = num1+num2+num3+num4+num5;
		media = soma /i;
		System.out.println("Você digitou: "+num1+","+num2+","+num3+","+num4+" e "+num5);
		System.out.println("A soma de "+num1+","+num2+","+num3+","+num4+" e "+num5+" é:"+soma);
		System.out.println("A média de "+soma+" divido por "+i+" é "+media);
		

	}

}
