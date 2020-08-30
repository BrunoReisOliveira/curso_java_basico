package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio36 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 11 elementos, 
		 * indexados de 0 até 10.
			Sendo cada elemento do vetor A formado pela 
			potência de base 2 elevado ao expoente igual 
			a posição do respectivo elemento, ou seja:
			A[i] = 2^i. Sugestão int A[11].
		 */
		
		Scanner scan = new Scanner (System.in);
		
		double [] num = new double [11];
		int i=0;
		
		try {
			
			for (i=0;i<num.length;i++) {
				System.out.println("Digite o número "+(i+1));
				num[i]=scan.nextInt();
			}
			
			for (i=0;i<num.length;i++) {
				num[i]= Math.pow(2,i);
			}
			
			for (i=0;i<num.length;i++) {
				System.out.println(num[i]);
			}
			
		}catch(InputMismatchException e ) {
			System.out.println("Digite apenas números inteiros!");
			main(args);
		}

	}

}
