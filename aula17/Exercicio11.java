package com.bruno.cursojava.aula17;
import java.util.Scanner;

public class Exercicio11 {
	


		public static void main(String[] args) {
			/*
			FAÇA UM PROGRAMA QUE RECEBA DOIS NÚMEROS
			INTEIROS E GERE OS NÚMEROS INTEIROS QUE ESTÃO
			NO INTERVALO COMPREENDIDO POR ELES
			--------------------
			ALTERE O PROGRAMA ANTERIOR PARA MOSTRAR
			NO FINAL A SOMA DOS NÚMEROS.
			 */
			Scanner scan=new Scanner (System.in);
			
			try {
				
			System.out.println("Digite dois números inteiros e saiba o intervalo compreendido e a soma entre eles.");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			int i=0,soma=0;
			
			for (i=n1;i<=n2;i++) {							
				soma +=i;				
			}
			
			System.out.println("A soma do intervalo compreendido entre " +n1+" e "+n2+" é "+soma);
			
			}catch(java.util.InputMismatchException e) {
			System.out.println("Digite apenas números sem vírgula!");
			main (args);	
			
		}		
			
	}
		
}



