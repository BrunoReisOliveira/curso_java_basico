package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio33 {

public static void main(String[] args) {
/*
* Faça um programa que mostre os n termos da série a seguir:
s = 1/1 + 2/3 +3/5 +4/7 +5/9 +... +n/m.
Imprimir a soma da série
*/

	Scanner scan = new Scanner (System.in);
	
	double soma=0,result=0,i=0,j=0,n=0;
	try {

		System.out.println("Digite o termo n:");
			n=scan.nextInt();
				
			for (i=1, j=1;i<=n; i++,j+=2) {
					
				System.out.print(i + "/"+ j +" + ");
				result +=i/j;
				}
			
			System.out.println("\nSoma = "+ result);
			
		}catch (InputMismatchException e ) {
				System.out.println("Digite apenas números sem vírgula!");
		}		main (args);

}

}

