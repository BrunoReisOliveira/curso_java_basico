package com.bruno.cursojava.aula35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer02_somatoria_use {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0,returnSoma=0;

		try {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			
			for (int i=1;i<=num;i++) {
				returnSoma=Exer02_somatoria.somarN(i);
			}
			System.out.print("Somatória:"+returnSoma+",");
			
				
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido!O programa será reiniciado.");
			main(args);
		}

	}

}
