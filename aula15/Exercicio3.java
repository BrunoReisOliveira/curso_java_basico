package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		/* faça um programa que verifique
		se uma letra digitada é "F" ou "M".
		Conforme a letra escrecer: F- Feminino, M - Masculino, 
		Sexo inválido*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite F ou M para o tipo de sexo");
		
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("Sexo feminino");
						
		}else if(letra.equalsIgnoreCase("m")){
			System.out.println("Sexo masculino");
		
		}else {
			System.out.println("Sexo inválido");
		}
	
	}
}



