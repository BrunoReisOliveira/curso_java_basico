package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio29 {

	public static void main(String[] args) {
		/*
		 * Ler dois vetores A e B com 10 elementos cada. 
			Construir um vetor C, sendo este a junção dos 
			dois vetores.
			Os primeiros 10 elementos de C deverão receber 
			os elementos de A e os últimos 
			elementos C deverão receber os elementos de B. 
			Desta forma, C deverá ter o dobro de elementos 
			de A e B ou seja, 20 elementos.
		 */
		Scanner scan = new Scanner(System.in);
		int [] A = new int [10];
		int [] B = new int [10];
		int [] C = new int [20];
		int i=0,ic=10;
		
		try {
			
			for(i=0; i<A.length; i++) {
				System.out.println("Digite 10 números para o vetor A:"+(i+1));
				A[i] = scan.nextInt();
			}
			
			for(i=0; i<B.length; i++) {
				System.out.println("Digite 10 números para o vetor B:"+(i+1));
				B[i] = scan.nextInt();
			}			
			
			for (i=0; i<=9; i++) {
				C[i] = A[i];
			}
			
			for (i=0; i<=9; i++) {
				C[ic] = B[i];
				ic++;
			}
			
			for (i=0; i<C.length; i++) {
				System.out.println(C[i]);
			}			
			
		}catch (InputMismatchException e) {
			System.out.println("Digite apenas números inteiros");
			main (args);
		}
		

	}

}
