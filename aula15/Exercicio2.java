package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// faça um programa que peça um valor e mostre
		//na tela se o valor é positivo ou negativo
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um valor");
		
		double valor = scan.nextDouble();
		
		if (valor < 0){
			System.out.println(valor+ " é negativo");
			
		}else if (valor >-1) {
			System.out.println(valor+ " é positivo");
		}
	

	}

}
