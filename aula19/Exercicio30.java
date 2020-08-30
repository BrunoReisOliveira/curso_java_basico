package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio30 {

	public static void main(String[] args) {
		/*
		 * Ler um vetor A com 20 elementos. 
		 * Construir dois
		 * vetores B e C,sendo que nos vetores B e C 
		 * serão armazenados 
		o valores pares e ímpares de A,respectivamente.
		 */
		Scanner scan = new Scanner (System.in);
		int [] A = new int [20];
		int [] B = new int [A.length];
		int [] C = new int [A.length];
		int i=0,posB=0,posC=0;
		
		System.out.println("Digite 20 números inteiros e saibam quais os pares e ímpares");
		
		try {
			
			for (i=0; i<A.length;i++) {
				System.out.println("Digite o número "+(i+1));
				A[i] = scan.nextInt();			
				
			}
			
			for (i=0; i<A.length;i++) {
				
				if (A[i] %2 ==0) {
					B[posB]=A[i];
					posB++;
				}else {
					C[posC] =A[i];
					posC++;
				}
			}
			
			System.out.print("Vetor A = ");
			for (i=0;i<A.length;i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for (i=0;i<posB;i++) {
				System.out.print(B[i]+" ");
			}
			System.out.println();
			
			System.out.print("Vetor C = ");
			for (i=0;i<posC;i++) {
				System.out.print(C[i]+" ");
			}
			System.out.println();
						
		}catch( InputMismatchException e){
			System.out.println("Digite apenas números inteiros!");
			main (args);
		}

	}

}
