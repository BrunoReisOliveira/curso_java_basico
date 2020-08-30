package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio25 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. 
		 * Construir um vetor B de mesmo
			tipo e tamanho, obedecendo as seguintes 
			regras de formação:
			A)Bi deverá receber 1 quando Ai for par;
			B)Bi deverá receber 0 quando Aifor ímpar;
		 */
		
		Scanner scan = new Scanner (System.in);
		
		int [] A = new int [10];
		int [] B = new int [10];
		int i=0,restodiv=0;
		
		for (i=0;i<A.length;i++) {
			
			try {
				System.out.println("Digite o número "+(i+1));
				A[i]=scan.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas número sem vírgula!");
				main(args);
			}			
		
		}		
			for (i=0;i<B.length;i++) {
		
				restodiv = A[i]%2;
				if(restodiv==0) {
					B[i]=1;
				}else {
					B[i]=0;
				}			
			}			
			for (i=0;i<B.length;i++) {
				System.out.println(B[i]);
			}			
			
		}

	}


