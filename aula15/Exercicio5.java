package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		/*faça um programa para a leitura de duas notas
		  parciais de um aluno.
		  O programa deve calcular a média alcançada por aluno
		  e apresentar:
		  - a mensagem "aprovado", se a média alcançada for
		  maior ou igual a sete;
		  - a mensagem "reprovado", se a média for menor do que
		  sete;
		  - a mensagem "aprovado com distinção", se a média for igual
		  a dez		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite duas notas:");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double media = (n1+n2)/2;
		
		if (media >=7 && media <=9.99) {
			System.out.println("Aprovado!");
		}
		
		else if (media <7) {
			System.out.println("Reprovado!");
			
		}		
		
		else if  (media ==10) {
			System.out.println("Aprovado com distinção!");
		}	
		
		
		
	}
}


