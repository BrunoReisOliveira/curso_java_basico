package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
			/*faça um programa que mostre os n termos da série a seguir:
			S= 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + n/m
			imprima no final a soma da série*/		
		
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


