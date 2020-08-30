package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		/*Faça um programa que pergunte em que turno
		 você estuda.Peça para digitar M-matutino ou V-vespertino
		 ou N-noturno.Imprima a mensagem "Bom dia!",
		 "Boa tarde!" ou "Boa noite" ou "Valor Inválido!", conforme
		  o caso.
		 */
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escolha o turno que você estuda:M-matutino,V-vespertino	ou N-noturno.");
		
		String turno = scan.next();
		
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}
		
		else if(turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		}	
		else if(turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		}		
		else {
			
			System.out.println("Opção inválida!");
		}

	}

}


