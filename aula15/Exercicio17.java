package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		/*faça um programa que peça um número
		 * correspondente a um determinado ano
		 * e em seguida informe se este ano é ou não
		 * bissexto
		 */		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o ano:");
		long ano = scan.nextLong();
		
		if ((ano % 400 == 0)|| (ano % 4==0 && ano % 100 !=0)) {
			System.out.println("O ano "+ ano+" é bissexto!");
		}else {
			System.out.println("O ano "+ ano+" não é bissexto!");
		}

	}
	
}
