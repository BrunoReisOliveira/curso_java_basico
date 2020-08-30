package com.bruno.cursojava.aula19;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Criar um vetor A com 8 elementos inteiros. Construir um vetor
			B de mesmo tipo e tamanho e com elementos do vetor 
			A multiplicados por 2, ou seja
			B[i] = A[i]*2 
		 */		
		int [] a = new int [8];
		int [] b = new int [8];
		
		int i=0,value=1;
		
		for (i=0; i< a.length;i++) {
			
			a [i] = value;
			value +=1;			
		}
		
		for (i=0;i<a.length; i++) {
			
			System.out.println("O valor do índice "+(i+1)+" é "+a[i]);
		}
		
		for (i=0; i<b.length;i++) {
			
			b[i] = a[i]*2;
		}
		
		for (i=0;i< b.length;i++) {
			
			System.out.println("O dobro do valor do vetor A por índice "+(i+1)+" no vetor B"+" é "+b[i]);
		}

	}

}
