package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio31 {

	public static void main(String[] args) {
		/*
		 * Ler um vetor A com 20 elementos. Separar os 
		 * elementos pares e ímpares
			de A utilizando apenas um vetor extra B.
			Sugestão: no início do vetor B armazene os 
			elementos pares de A e nas posições
			restantes do vetor B armazene os elementos de 
			A que são ímpares.
		 */
		Scanner scan = new Scanner (System.in);
		
		int [] A = new int [20];
		int [] B = new int [20];
		int i=0,restodiv=0,ib=0;
		
		System.out.println("Digite 20 números inteiros e saiba os pares e ímpares");
		
		try {
			
			for (i=0;i<A.length;i++) {
				System.out.println("Digite o número "+(i+1));
				A[i]=scan.nextInt();
			}
			
			for (i=0;i<A.length;i++) {
				
				restodiv = A[i]%2;
				
				if (restodiv ==0) {
					
				B[ib] = A[i];				
				ib+=1;
				}				
			}
			
			for (i=0;i<A.length;i++) {
							
					restodiv = A[i]%2;
							
					if (restodiv !=0) {
								
					B[ib] = A[i];				
					ib+=1;
				}				
			}
			
			System.out.print("Vetor A =");
			for (i=0;i<A.length;i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
			
			System.out.print("Vetor B =");
			for (i=0;i<B.length;i++) {
				System.out.print(B[i]+" ");
			}
			System.out.println();
						
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros!");
			main (args);
			
		}
		

	}

}
