package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		/* faça um programa que leia um número
		 * e exiba o dia correspondente da 
		 * semana (1-Domingo,2-Segunda,etc).
		 * Se digitar outro valor deve aparecer
		 * valor inválido
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o número correspondente ao dia da semana:");
		int dia = scan.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("1-Domingo");break;
		case 2:
			System.out.println("2-Segunda");break;
		case 3:
			System.out.println("3-Terça");break;
		case 4:
			System.out.println("4-Quarta");break;
		case 5:
			System.out.println("5-Quinta");break;
		case 6:
			System.out.println("6-Sexta");break;
		case 7:
			System.out.println("7-Sábado");break;
			
		default: System.out.println("Valor inválido!");
		}
		}

}
