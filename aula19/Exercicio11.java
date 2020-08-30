package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * criar um vetor A com 10 elementos inteiros
			implementar um programa que defina e escreva a quantidade de 
			elementos armazenadas neste vetor que são pares.
		 */
		Scanner scan = new Scanner (System.in);
		
		int [] num = new int [10];
		int i=0,restodiv=0,count=0;		
		
		try {
			System.out.println("Digite 10 números inteiros e saiba a quantidade de números pares");
			
			for (i=0; i<num.length;i++) {
				System.out.println("Digite o número: "+(i+1));
				num[i] = scan.nextInt();
				
			}
			
			for (i=0; i<num.length;i++) {
				restodiv = num[i]%2;
				
				switch (restodiv) {
						
				case 0:System.out.println("O número "+num[i]+" é par");
				count +=1;					  
				break;
				default: System.out.println("O número "+num[i]+" é ímpar");
				break;
				
				}
			}
			
			System.out.println("Você digitou "+count+ " número (s) par (es)");
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números sem vírgula!");
			main (args);
		}
		
		
	}

}
