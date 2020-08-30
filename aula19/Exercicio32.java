package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio32 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 5 elementos inteiros. 
		 * Escreva um programa que imprima
		  a tabuada de cada um dos elementos do vetor A
		 */
		
		Scanner scan = new Scanner (System.in);
		
		int [] num = new int [5];
		int i=0,j=0,ini=0, fim=0,multi=0;
		
		System.out.println("Digite 5 números inteiros e obtenha a tabuada:");
		
		try {
			
			for (i=0; i<num.length;i++) {
				System.out.println("Digite o números "+(i+1));
				num[i]=scan.nextInt();
			}
			
			System.out.println("Digite o início da tabuada:");
			ini=scan.nextInt();
			
			System.out.println("Digite o final da tabuada:");
			fim= scan.nextInt();
		
			
			for (i=0;i<num.length;i++) {
				multi = num[i];
				for (j=ini;j<=fim;j++) {
					System.out.println(multi+"x"+j+"="+multi*j);
				}
				
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros!");
			main(args);
		}	
		

	}

}
