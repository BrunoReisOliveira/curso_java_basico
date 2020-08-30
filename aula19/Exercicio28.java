package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio28 {

	public static void main(String[] args) {
		/*
		 * Ler um vetor A com 10 elementos e construir 
		 * um vetor B de mesmo
			tipo e tamanho e com os mesmo elementos de A, 
			sendo que estes deverão	estar invertidos, ou seja, 
			o primeiro elemento de A passa ser o último de B, 
			segundo elemento de	A passa a ser o penúltimo de B 
			e assim por diante.
		 */
		Scanner scan = new Scanner (System.in);
		int [ ] A = new int [10];
		int [ ] B = new int  [10];
		int i=0,i2=9;
		
		System.out.println("Digite 10 números inteiros");
		
		try {
			
			for (i =0; i<A.length;i++) {
				System.out.println("Digite o número "+(i+1));
				A[i] = scan.nextInt();
			}
			
			for (i=0;i<B.length;i++) {
				
				if (i>=0) {
					B[i]=A[i2];
					i2--;
				}else if (i<0) {
					break;
				}				
			}
			
			System.out.println("Valores do vetor A");
			for(i=0;i<A.length;i++) {
				System.out.println(A[i]);
			}
			
			System.out.println("Valores do vetor B");
			for(i=0;i<B.length;i++) {
				System.out.println(B[i]);
			}
			
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros!");
			main(args);
		}
		

	}

}
