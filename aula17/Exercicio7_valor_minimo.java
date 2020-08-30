package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio7_valor_minimo {

	public static void main(String[] args) {
		/*
		 * faça um programa que leia 5 números 
		 * e informe o maior número
		 */
		try {
		Scanner scan =new Scanner (System.in);
			
		double i=0,num=0,maior= Double.MIN_VALUE;
		
		System.out.println("Digite 5 números e saiba o menor");
		for (i=0; i<5; i++) {
			
			System.out.println("Entre com um número "+(i+1));
			num = scan.nextDouble();
			
			if (num>maior) {
				
				maior = num;
			}			
			
}
		
		System.out.println("O maior número digitado foi "+ maior);
		
		}catch(java.util.InputMismatchException e){
			System.out.println("Digite apena números!");
			main (args);
		}
	}
}


