package com.bruno.cursojava.aula19;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros.
			Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos
			elementos em A e B, ou seja: C[i]= A[i]*B[i]
		 */
		
		int [] a = new int [10];
		int [] b = new int [10];
		int [] c = new int [10];
		int i=0,value=1;
		
		for (i=0;i<a.length;i++) {
			a[i] = value;
			value +=1;
		}
		
		for (i=0; i<a.length; i++) {
			System.out.println("Valor do vetor A no índice "+(i+1)+ " é "+ a[i]);
		}
		
		for (i=0; i<b.length; i++) {
			b[i] = value;
			value +=1;
		}
		
		for (i=0;i<b.length; i++) {
			System.out.println("Valor do vetor B no índice "+(i+1)+" é "+b[i]);
		}
		
		for (i=0;i<c.length;i++) {
			c[i]=a[i]*b[i];
		}
		
		for (i=0;i<c.length;i++) {
			System.out.println("Vetor A*B="+a[i]+"*"+b[i]+"="+c[i]);
		}

	}

}
