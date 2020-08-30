package com.bruno.cursojava.aula19;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * criar um vetor A com 10 elementos inteiros. 
		 * Construir um vetor B de
			mesmo tipo e tamanho, sendo que cada 
			elemento do vetor B deverá
			ser o resto da divisão do respectivo 
			elemento de A por 2(dois), 
			ou seja: B[i] = A[i]%2.
		 */
		int [] a = new int[10];
		int [] b = new int [10];
		int i=0,value=1;
		
		for (i=0; i<a.length;i++) {
			a[i]=value;
			value +=1;
		}
		
		for (i=0;i<b.length;i++) {
			b[i] = a[i]%2;
		}
		
		for (i=0;i<b.length;i++) {
			System.out.println("O resto da divisão do índice "+(i+1)+" no vetor A="+a[i]+" por 2 é="+b[i]);
		}
	}	
	

}
