package com.bruno.cursojava.aula35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer01_Fibonacci_use {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;

		try {
			System.out.println("Digite um número inteiro:");
			num = scan.nextInt();
						
			for (int i=0;i<=num;i++) {
				System.out.print(Exer01_Fibonacci.fibonacci(i)+",");
			}			

		} catch (InputMismatchException e) {
			System.out.println("Valor inválido! O programa será reiniciado.");
			main(args);
		}

	}

}
