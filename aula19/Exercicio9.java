package com.bruno.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros.
			Construir um vetor C, onde cada elemento de C é a divisão dos respectivos elementos
			em A e B, ou seja:
			c[i] = a[i]/ float (b[i])
		 */		
		double [] a = new double [10];
		double [] b = new double [10];
		double [] c = new double [10];
		int i=0,value =1;
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		for (i=0; i<a.length; i++) {
			a[i] = value;
			value+=1;
		}
		
		for (i=0; i<b.length; i++) {
			b[i] = value;
			value +=1;
		}
		
		for (i=0; i<c.length; i++) {
			c[i] = a[i] /b[i];
		}
		
		for(i=0;i<c.length;i++) {
			System.out.println("Vetor A / B é igual= "+a[i]+"/"+b[i]+" = "+df.format(c[i]));
		}
	}	
	

}
