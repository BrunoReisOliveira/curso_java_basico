package com.bruno.cursojava.aula19;

import java.util.Random;
public class Exercicio15 {

	public static void main(String[] args) {
		/* criar um vetor A com 10 elementos inteiros
		   implementar um programa que defina o percentual de
		   elementos pares e ímpares respectivamente, 
		   armazenados neste vetorim 
		 */		
		int [] num = new int [10];
		int i=0;
		Random gerador = new Random();
		double pares=0,impares=0;
		
		for (i=0; i<num.length;i++) {
			num[i] = ((gerador.nextInt(50)%100)+1);
		
		
		if (num[i]%2==0) {
			pares++;
		}
		else {
			impares ++;
		}
		
		}
		
		for (i=0;i<num.length;i++) {
			System.out.println("Valores do vetor A "+num[i]);
		}
		
		System.out.println("% de números pares:"+pares+"\n% de números ímpares:"+impares);

	}

}
