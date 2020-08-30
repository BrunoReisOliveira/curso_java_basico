package com.bruno.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor
			B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser
			a raiz quadrada do respectivo elemento de A , ou seja
			B[i] = sqrt(A[i])
		 */
		
		double [] a = new double [15];
		double [] b = new double [15];
		int i=0,value=1;
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		for (i=0;i<a.length;i++) {
			
			a[i] = value;
			value +=1;			
		}
		
		for (i=0;i<a.length;i++) {
			System.out.println("Valor do vetor A "+a[i]);
		}
		
		for (i=0;i<b.length;i++) {
			
			b[i] = Math.sqrt(a[i]);
		}
		
		for (i=0;i<b.length;i++) {
			System.out.println("Valor do índice "+(i+1)+" no vetor A "+df.format(a[i])	+".Raiz quadrada aplicada no vetor B "+df.format(b[i]));
		}

	}

}
