package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio35 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. 
		 * Escreva um programa que 
		imprima cada elemento do vetor A e a relação de 
		todos os divisores do respectivo elemento.
		 */
		Scanner scan = new Scanner (System.in);
		
		int [] num = new int [10];
		int i=0,j=0,restdiv=0,numtemp=0;
		
		try {
			
			for (i=0;i<num.length;i++) {
				System.out.println("Digite o número "+(i+1));
				num[i]=scan.nextInt();
			}
			
			for(i=0;i<num.length;i++) {
				numtemp = num[i];
				
				System.out.println("Relação de números divisíveis por "+numtemp);
				for (j=1;j<=numtemp;j++) {
					restdiv = numtemp %j;
					
					if (restdiv==0) {						
						System.out.println("O número "+j+" é divisível por "+numtemp);
					}
				}
				
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros!");
			main(args);
		}

	}

}
