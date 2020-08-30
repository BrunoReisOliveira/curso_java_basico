package com.bruno.cursojava.aula19;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. 
		 * Construir um vetor
		B de mesmo tipo e tamanho, sendo que cada elemento 
		do vetor B deverá ser
		o respectivo elemento de A multiplicado por sua 
		posição (ou índice), ou seja
		B[i] = A [i]*i*/
		
		int [] a = new int [10];
		int [] b = new int [10];
		int i=0,value=1;
		
		for (i=0; i<a.length; i++) {
			
			a[i]= value;
			value+=1;
		}
		
		for (i=0; i<a.length;i++) {
			System.out.println("Valor do índice "+(i+1)+" no vetor A é "+a[i]);
		}
		
		for (i=0; i<b.length;i++) {
			
			b[i] = a[i]*i;
		}
		
		for (i=0;i<b.length;i++) {
			System.out.println("Valor do índice "+(i+1)+" no vetor A é "+a[i]+".Multiplicado pelo valor do índice "+(i+1)+" no vetor\nB é "+b[i]);
		}

	}

}
