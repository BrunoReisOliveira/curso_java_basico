package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio26_recursividade {

	/*
	 * faça um programa que calcule o fatotial de um número
		inteiro fornecido pelo usuário. Ex.:5!=5.4.3.2.1=120.
		A saída deve ser conforme o exemplo abaixo:
		Fatorial de: 5
		5! = 5 . 4 . 3 . 2 . 1 = 120
	 */		
	//método estático e inteiro para cálculo do fatorial
	public static int fatorial (int valor) {
		if (valor == 1 || valor ==0){
			
			System.out.print("1");
			return (1);
		}
		System.out.print(valor+".");
		return fatorial (valor-1)*valor;		
}
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		int i=0,num=0,fatorial=0;
		
		try {
			
			System.out.println("Digite um número inteiro para cálculo do fatorial");
			num = scan.nextInt();			
			
				fatorial=0;
				System.out.print(num+"!=");
				fatorial = fatorial (num);
				System.out.println("="+fatorial);		
			
		}catch (InputMismatchException e){
			System.out.println("Digite apenas números sem vírugula!");
			main (args);			
		}				

	}

}
