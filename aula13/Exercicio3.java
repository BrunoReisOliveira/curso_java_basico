package com.bruno.cursojava.aula13;


import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//faça um programa que peça dois números
		//e imprima a soma
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite dois números");
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int soma = n1 + n2;
		
		System.out.println ("A soma de "+ n1+" "+ "+ "+n2 +" é: " +soma);
		
		
		

	}

}
