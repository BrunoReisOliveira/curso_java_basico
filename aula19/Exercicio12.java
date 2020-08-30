package com.bruno.cursojava.aula19;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * criar um vetor A com 10 elementos inteiros
			implementar um programa que defina e escreva 
			a soma de todos	os elementos armazenados neste vetor.
		 */
		
		int [] num = new int [10];
		int i=0,value=1;
		double soma=0;
		
		for (i=0; i<num.length;i++) {
			num[i]= value;
			value+=1;
			soma +=num[i];
		}
		
		for (i=0; i<num.length;i++) {
			System.out.println("O valor do Vetor A:"+num[i]);
		}
		
		System.out.println("Soma do vetor A é:"+soma);
		
			
		
	}

}
