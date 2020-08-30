package com.bruno.cursojava.aula20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Modifique o programa anterior de maneira a guardar os compromissos de todo o
		 * ano, organizados por mês, dia e hora (só 8 horas por dia)
		 */

		Scanner scan = new Scanner(System.in);

		String[][][] agenda = new String[365][365][365];

		String compromisso = "", resp = "", compromisso2 = "";

		int i = 0, j = 0, k = 0, mes = 0, dia = 0, hora = 0, escolha = 0, menu = 0;

		do {

			try {

				System.out.println(
						"1-incluir um compromisso\n2-alterar um compromisso\n3-consultar um compromisso\n4-sair (sua agenda será apagada)");
				escolha = scan.nextInt();

				if (escolha > 4 || escolha < 1) {
					System.out.println("Escolha errada!");
					main(args);
				}

				if (escolha == 4) {
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Digite apenas números!");
				main(args);
			}
			if (escolha == 1) {

				do {

					System.out.println("Digite seu compromisso:");
					compromisso = scan.next();

					try {

						do {
							System.out.println("Digite o mês (1-12):");
							mes = scan.nextInt();
						} while (mes > 12 || mes < 1);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					try {

						do {
							System.out.println("Digite o dia (1-31):");
							dia = scan.nextInt();
						} while (dia > 31 || dia < 1);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}
					try {
						do {
							System.out.println("Digite a hora (1-8h):");
							hora = scan.nextInt();
						} while (hora > 8 || hora < 0);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					for (i = 0; i < agenda.length; i++) {
						for (j = 0; j < agenda.length; j++) {
							for (k = 0; k < agenda.length; k++) {
								agenda[dia][hora][mes] = compromisso;
							}
						}
					}
					System.out.println("Deseja continuar incluindo compromisso?");
					resp = scan.next();
				} while (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("SIM"));

				if (resp.equalsIgnoreCase("N") || resp.equalsIgnoreCase("NÃO") || resp != "") {
					menu = 1;
				}
			}
			if (escolha == 2) {
				do {

					System.out.println("Digite o novo compromisso");
					compromisso = scan.next();

					try {

						do {
							System.out.println("Digite o novo mês (1-12):");
							mes = scan.nextInt();

						} while (mes > 12 || mes < 1);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					try {
						do {
							System.out.println("Digite o novo dia:");
							dia = scan.nextInt();
						} while (dia > 31 || dia < 1);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					try {

						do {
							System.out.println("Digite a nova hora (1-8h):");
							hora = scan.nextInt();
						} while (hora > 8 || hora < 0);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}
					for (i = 0; i < agenda.length; i++) {
						for (j = 0; j < agenda.length; j++) {
							for (k = 0; k < agenda.length; k++) {
								agenda[dia][hora][mes] = compromisso;
							}
						}
					}

					System.out.println("Deseja continuar alterando seus compromissos?");
					resp = scan.next();

				} while (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("SIM"));

				if (resp.equalsIgnoreCase("N") || resp.equalsIgnoreCase("NÃO") || resp != "") {

					menu = 1;
				}

			}

			if (escolha == 3) {

				do {

					try {

						do {
							System.out.println("Digite o mês:");
							mes = scan.nextInt();
						} while (mes > 12 || mes < 1);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					try {
						do {
							System.out.println("Digite o dia:");
							dia = scan.nextInt();
						} while (dia > 31 || dia < 1);
					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}
					
					try {
						do {
							System.out.println("Digite a hora (1-8h):");
							hora = scan.nextInt();
						} while (hora > 8 || hora < 0);
						
					}catch(InputMismatchException e ) {
						System.out.println("Digite apenas números!");
						main(args);
					}					

					for (i = 0; i < agenda.length; i++) {
						for (j = 0; j < agenda.length; j++) {
							for (k = 0; k < agenda.length; k++) {
								compromisso2 = agenda[dia][hora][mes] == null ? "sem agendamento": agenda[dia][hora][mes];
							}

						}
					}
					System.out.println("Compromisso para o mês " + mes + ", dia " + dia + " e hora " + hora + "\n("
							+ compromisso2 + ")");

					System.out.println("Deseja continuar consultando seus compromissos?");
					resp = scan.next();

				} while (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("SIM"));

				if (resp.equalsIgnoreCase("N") || resp.equalsIgnoreCase("NÃO") || resp != "") {
					menu = 1;
				}
			}

		} while (menu == 1);

	}

}
