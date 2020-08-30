package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		/*
		FAÇA UM PROGRAMA QUE RECEBA DOIS NÚMEROS
		INTEIROS E GERE OS NÚMEROS INTEIROS QUE ESTÃO
		NO INTERVALO COMPREENDIDO POR ELES
		 */
		Scanner scan=new Scanner (System.in);
		
		try {
			
		System.out.println("Digite dois números inteiros e saiba o intervalo compreendido entre eles.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int i=0;
		
		for (i=n1;i<=n2;i++) {
			
			System.out.println(i);
			
		}
		
		}catch(java.util.InputMismatchException e) {
		System.out.println("Digite apenas números sem vírgula!");
		main (args);	
		
		
	}	
		
		
	
		
	}
	
}
