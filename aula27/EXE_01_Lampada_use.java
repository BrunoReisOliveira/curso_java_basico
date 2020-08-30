package com.bruno.cursojava.aula27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXE_01_Lampada_use {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		EXE_01_Lampada status = new EXE_01_Lampada();
		int escolha = 0;
		String resp = "";

		status.mostrarStatus();
		try {

			System.out.println("Lâmpada: digite 1 para ligar e 2 para manter desligada");
			escolha = scan.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Escolha errada!");
			main(args);
		}

		switch (escolha) {

		case 1:
			status.ligarLampada();

			do {			

					System.out.println("Gostaria de desligar sua lâmpada?");
					resp = scan.next();

					if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("SIM")) {
						status.desligarLampada();
						resp = "";
					} else {
						status.ligarLampada();

						do {

							System.out.println("Gostaria de desligar sua lâmpada?");
							resp = scan.next();

							if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("SIM")) {
								status.desligarLampada();
								main(args);
							}

						} while (resp != "S" || resp != "SIM");
					}				

					if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("SIM")) {
						status.desligarLampada();
						main(args);
					}

			} while (resp != "S" || resp != "SIM");

			break;
		case 2:
			status.desligarLampada();
			main(args);
			break;
		default:
			System.out.println("Opção errada!");

		}

	}

}
