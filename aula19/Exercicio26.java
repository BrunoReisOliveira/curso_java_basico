package com.bruno.cursojava.aula19;

import java.util.Scanner;
public class Exercicio26 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 
		 * elementos inteiros.
			Construir um vetor C de mesmo tipo e tamanho, 
			obedecendo as seguintes
			regras de formação:
			
			A)Ci deverá receber 1 quando Ai for maior que Bi;
			B)Ci deverá receber 0 quando Ai for igual a Bi;
			C) Ci deverá receber -1 quando Ai for menor que Bi;
		 */
		int [] A = new int[10];
		int [] B = new int [10];
		int [] C = new int [10];
		
		int i=0;
		
		Scanner scan = new Scanner (System.in);
		
			System.out.println("Digite 10 números inteiros para o vetor A:");
			for (i=0;i<A.length;i++) {
				System.out.println("Digite o número "+(i+1));
				A[i] = scan.nextInt();
			}
			
			System.out.println("Digite 10 números inteiros para o vetor B:");
			for (i=0;i<B.length;i++) {
				System.out.println("Digite o número "+(i+1));
				B[i] = scan.nextInt();
			}
			
			for (i=0;i<C.length;i++) {
				
				if (A[i]>B[i]) {
					C[i]=1;
				}else if (A[i]==B[i]) {
					C[i]=0;
				}else if (A[i] <B[i]) {
					C[i]=-1;
				}				
			}
			
			for (i=0;i<C.length;i++) {
				System.out.println(C[i]);
			}


	}

}
