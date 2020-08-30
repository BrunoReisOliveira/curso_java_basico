package com.bruno.cursojava.aula34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer01_Contador_use {

	public static void main(String[] args) {

		int retornoretornaContador = 0, 
		retornozerarContador = 0, escolha = 0;
		String resp = "";

		Scanner scan = new Scanner(System.in);

		do {
			
			try {
				
				System.out.println("1-Incrementar\n2-Retornar Contador\n3-Zerar Contador");
				escolha = scan.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas números!");
				main (args);
			}
			
			switch (escolha) {

			case 1:

				Exer01_Contador.incrementarContador();
				break;
			case 2:

				retornoretornaContador = Exer01_Contador.retornaContador();
				System.out.println("Retorno do Contador: "+retornoretornaContador);
				break;
			case 3:

				retornozerarContador = Exer01_Contador.zerarContador();
				System.out.println("Retorno do Contador: "+retornozerarContador);
				break;
			}

			System.out.println("Deseja continuar?");
			resp = scan.next();

		} while (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("SIM"));

	}

}
