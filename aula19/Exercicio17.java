package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		/*Ler um vetor A com 10 elementos inteiros 
		 * correspondentes as idades
		  de um grupo de pessoas. Escreva um 
		  programa que determine e 
		  escreva a quantidade de pessoas que 
		  possuem idade superior a 35 anos
		 */		
		Scanner scan = new Scanner (System.in);
		
		int [] idade = new int [10];
		int i=0,qtdidade=0;
		
			System.out.println("Digite 10 idades e saiba quantidade maior que 35 anos!");
		try {
			
			for (i=0;i<idade.length; i++) {
					System.out.println("Digite a idade "+(i+1));
					idade [i] = scan.nextInt();
					
					if (idade [i] >35) {
						qtdidade +=1;
					}
			}
			
			System.out.println("A quantidade de idade maior que 35 anos é: "+qtdidade);
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números sem vírgula!");
			main (args);
		}
	}

}
