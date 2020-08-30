package com.bruno.cursojava.aula20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para armazenar em uma matriz os compromissos de uma agenda
		 * pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24
		 * horas, podemos associar uma tarefa específica (compromisso agendado). O
		 * programa deve ter um menu onde o usuário indica o dia do mês que deseja
		 * alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário
		 * pode também consultar a agenda, fornecendo o dia e a hora para obter o
		 * compromisso armazenado.
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		String[][] agenda = new String[31][31];

		String compromisso = "", resp = "", compromisso2 = "";

		int i = 0, j = 0, dia = 0, hora = 0, escolha = 0, menu = 0;

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
					System.out.println("Digite seu compromisso");
					compromisso = scan.next();

					try {

						do {							
							System.out.println("Digite o dia:");
							dia = scan.nextInt();							
						} while (dia>31||dia<1);	

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					try {

						do {
							System.out.println("Digite a hora (formato 24h):");
							hora = scan.nextInt();
						} while (hora > 24 || hora < 0);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					for (i = 0; i < agenda.length; i++) {
						for (j = 0; j < agenda.length; j++) {
							agenda[dia][hora] = compromisso;
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
							System.out.println("Digite o dia:");
							dia = scan.nextInt();							
						} while (dia>31||dia<1);	

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					try {

						do {
							System.out.println("Digite a hora (formato 24h):");
							hora = scan.nextInt();
						} while (hora > 24 || hora < 0);

					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						main(args);
					}

					for (i = 0; i < agenda.length; i++) {
						for (j = 0; j < agenda.length; j++) {
							agenda[dia][hora] = compromisso;
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
							System.out.println("Digite o dia:");
							dia = scan.nextInt();							
						} while (dia>31||dia<1);	
					}catch(InputMismatchException e ) {
						System.out.println("Digite apenas números!");
						main(args);
					}					

					do {
						System.out.println("Digite a hora (formato 24h):");
						hora = scan.nextInt();
					} while (hora > 24 || hora < 0);

					for (i = 0; i < agenda.length; i++) {
						for (j = 0; j < agenda.length; j++) {
							compromisso2 = agenda[dia][hora] == null ? "sem agendamento" : agenda[dia][hora];
						}
					}

					System.out.println("Compromisso para o dia " + dia + " e hora " + hora + " " + compromisso2);

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
