package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio27 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. 
		 * Construir um vetor
			B de mesmo tipo e tamanho, obedecendo 
			as seguintes regras de formação:
			A)bi deverá receber 'a' quando Ai for menor que 7;
			B)bi deverá receber 'b' quando Ai for igual a 7;
			C)bi deverá receber 'c' quando Ai for maior que 7 
			e menor que 10;
			D)bi deverá receber 'd' quando Ai for igual a 10;
			E)bi deverá receber 'e' quando Ai for maior que 10.
			Sugestão:char B[10];
		 */
		int [] A = new int [10];
		char [] B = new char [10];
		int i=0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite 10 números inteiros:");
		try {
			
			for (i=0;i<A.length; i++) {
				System.out.println("Digite o número "+(i+1));
				A[i] = scan.nextInt();
			}
			
			for (i=0;i<B.length;i++) {
				
				if (A[i]<7) {
					B[i]='a';
				}else if (A[i]==7) {
					B[i] ='b';
				}else if (A[i]>7&&A[i]<10) {
					B[i] ='c';
				}else if (A[i]==10) {
					B[i] ='d';
				}else if(A[i]>10) {
					B[i] ='e';
				}
			}
			
			for (i=0;i<B.length;i++) {
				System.out.println(B[i]);
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros!");
			main(args);
		}
		
		
		
		

	}

}
