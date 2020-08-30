package com.bruno.cursojava.aula19;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor
		B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser
		o quadrado do respectivo elemento de A , ou seja
		B[i] = A[i]* A[i]
		 * 
		 */
		
		int [] a = new int [15];
		int [] b = new int [15];
		int i=0,value=1;
		
		for (i=0; i<a.length; i++) {
			
			a[i] = value;
			value+=1;
			
		}
		
		for (i=0; i<a.length; i++) {
			
			System.out.println("O valor do vetor A por índice "+ (i+1)+" é "+a[i]);
		}
		
		for (i=0; i<b.length; i++) {
			
			b[i] = a[i]*a[i];
		}
		
		for (i=0; i<b.length;i++) {
			
			System.out.println("O quadrado do vetor A por índice "+(i+1)+" é "+b[i]);
			
		}
	}

}
