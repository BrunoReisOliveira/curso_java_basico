package com.bruno.cursojava.aula13;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//faça um programa que peça um número e então 
		//mostre a mensagem O número informado foi [número]		
		Scanner scan = new Scanner (System.in);
				
		System.out.println("Digite um número inteiro");
		
		int num = scan.nextInt();
		
		System.out.println("O número informado é: " + num);

	}

}
