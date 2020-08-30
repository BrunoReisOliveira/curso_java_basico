package com.bruno.cursojava.aula19;

import java.util.Random;
public class Exercicio23 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. 
		 * Desenvolver um programa
			que verifique se "todos" os elementos do 
			vetor A são pares.
			Se pelo menos um elemento do vetor não for par 
			o processo de repetição
			para percorrer os elementos do vetor deve ser 
			encerrado, como sugestão:
			utilize uma variável do tipo flag para atingir 
			este propósito.					
		 */		
		double [] num = new double [10];
		int i=0;
		Random gerador = new Random();
		boolean impar =false;		
		double result=0;
		
		for(i=0;i<num.length;i++) {
			num[i] = gerador.nextInt(1000);			
		}		
		for (i=0;i<num.length;i++) {
			result = num[i]%2;			
			if (result ==0) {
				System.out.println("O número "+num[i]+" é par");
				continue;
			}			
			else if (result >0) {
				System.out.println("O número "+num[i]+" é ímpar");
				break;
			}
		}					

	}

}
