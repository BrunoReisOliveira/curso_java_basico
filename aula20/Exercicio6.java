package com.bruno.cursojava.aula20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para jogar o jogo da velha. O programa deve permitir que
		 * dois jogadores façam uma partida do jogo da velha, usando o computador para o
		 * tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja
		 * colocar a sua peça ("O" ou "X"). O programa deve impedir jogadas inválidas e
		 * determinar automaticamente quando o jogo terminou e quem foi o vencedor
		 * (Jogador 1 ou 2). A cada nova jogada, o programa deve atualizar a situação do
		 * tabuleiro na tela.
		 */
		Scanner scan = new Scanner(System.in);
		String[][] tabuleiro = new String[3][3];
		String j1 = "", j2 = "", j1peca = "", j2peca = "", tvazio = "";
		int i = 0, j = 0, plinha = 0, pcoluna = 0, peca = 0, jtemp = 0, 
		l1j1peca = 0, l2j1peca = 0, l3j1peca = 0,l1j2peca = 0, l2j2peca = 0, l3j2peca = 0;

		System.out.println("Jogo da Velha");

		System.out.println("Digite o nome do jogador 1:");
		j1 = scan.next();

		do {

			try {

				System.out.println("Escolha a peça (1-O ou 2-X) " + j1);
				peca = scan.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Digite apena números!");
				main(args);
			}

		} while (peca > 2 || peca < 1);

		if (peca == 1) {
			j1peca = "O";
			j2peca = "X";
		} else {
			j1peca = "X";
			j2peca = "O";
		}

		System.out.println("Digite o nome do jogador 2:");
		j2 = scan.next();

		do {
			//alterna entre jogadores
			if (jtemp % 2 == 0) {
				System.out.println("Jogador " + j1 + " é sua vez");
				try {
					do {
						System.out.println("Escolha a linha (0,1 ou 2):");
						plinha = scan.nextInt();
					} while (plinha > 2 || plinha < 0);

				} catch (InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main(args);
				}

				try {
					do {
						System.out.println("Escolha a coluna (0,1 ou 2)");
						pcoluna = scan.nextInt();
					} while (pcoluna > 2 || pcoluna < 0);

				} catch (InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main(args);
				}

				for (i = 0; i < tabuleiro.length; i++) {

					for (j = 0; j < tabuleiro.length; j++) {
						tvazio = tabuleiro[plinha][pcoluna] == null ? j1peca : "";//só insere a peça se o campo estiver vazio
						if (tvazio == j1peca) {
							tabuleiro[plinha][pcoluna] = j1peca;
						}
					}
				}

				for (i = 0; i < tabuleiro.length; i++) {
					for (j = 0; j < tabuleiro.length; j++) {
						System.out.print(tabuleiro[i][j] == null ? "-" : tabuleiro[i][j]);//caso não tenha valor no campo será mostrado -
					}
					System.out.println();
				}

			} else {
				System.out.println("Jogador " + j2 + " é sua vez");

				try {
					do {
						System.out.println("Escolha a linha (0,1 ou 2):");
						plinha = scan.nextInt();
					} while (plinha > 2 || plinha < 0);

				} catch (InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main(args);
				}

				try {
					do {
						System.out.println("Escolha a coluna (0,1 ou 2)");
						pcoluna = scan.nextInt();
					} while (pcoluna > 2 || pcoluna < 0);

				} catch (InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main(args);
				}

				for (i = 0; i < tabuleiro.length; i++) {

					for (j = 0; j < tabuleiro.length; j++) {
						tvazio = tabuleiro[plinha][pcoluna] == null ? j2peca : "";//só insere a peça se o campo estiver vazio
						if (tvazio == j2peca) {
							tabuleiro[plinha][pcoluna] = j2peca;
						}
					}
				}

				for (i = 0; i < tabuleiro.length; i++) {
					for (j = 0; j < tabuleiro.length; j++) {
						System.out.print(tabuleiro[i][j] == null ? "-" : tabuleiro[i][j]);
					}
					System.out.println();
				}
			}

			jtemp++;

		} while (jtemp < 9);

		// validação jogador ganhador
		for (i = 0; i < 1; i++) {
			for (j = 0; j < 1; j++) {

				if (tabuleiro[0][0] == j1peca) {

					l1j1peca = 1;

				} else if (tabuleiro[0][0] == j2peca) {

					l1j2peca = 1;
				}

			}
		}

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {

				if (tabuleiro[0][1] == j1peca) {

					l1j1peca = 2;

				} else if (tabuleiro[0][1] == j2peca) {

					l1j2peca = 2;
				}

			}
		}
		// se l1j1peca=3 significa que a primeira linha foi completada com três
		// sequências iguais pelo jogador1
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				if (tabuleiro[0][2] == j1peca) {

					l1j1peca = 3;

				} else if (tabuleiro[0][2] == j2peca) {

					l1j2peca = 3;
				}

			}
		}

		for (i = 1; i < 2; i++) {
			for (j = 0; j < 1; j++) {

				if (tabuleiro[1][0] == j1peca) {

					l2j1peca = 1;

				} else if (tabuleiro[1][0] == j2peca) {

					l2j2peca = 1;
				}

			}
		}

		for (i = 1; i < 2; i++) {
			for (j = 0; j < 2; j++) {

				if (tabuleiro[1][1] == j1peca) {

					l2j1peca = 2;

				} else if (tabuleiro[1][1] == j2peca) {

					l2j2peca = 2;
				}

			}
		}
		// se l2j1peca=3 significa que a segunda linha foi completada com três
		// sequências iguais pelo jogador1
		for (i = 1; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				if (tabuleiro[1][2] == j1peca) {

					l2j1peca = 3;

				} else if (tabuleiro[1][2] == j2peca) {

					l2j2peca = 3;
				}

			}
		}

		for (i = 2; i < 3; i++) {
			for (j = 0; j < 1; j++) {

				if (tabuleiro[2][0] == j1peca) {

					l3j1peca = 1;

				} else if (tabuleiro[2][0] == j2peca) {

					l3j2peca = 1;
				}

			}
		}

		for (i = 2; i < 3; i++) {
			for (j = 1; j < 2; j++) {

				if (tabuleiro[2][1] == j1peca) {

					l3j1peca = 2;

				} else if (tabuleiro[2][1] == j2peca) {

					l3j2peca = 2;
				}

			}
		}
		// se l3j1peca=3 significa que a terceira linha foi completada com três
		// sequências iguais pelo jogador1
		for (i = 2; i < 3; i++) {
			for (j = 2; j < 3; j++) {

				if (tabuleiro[2][2] == j1peca) {

					l3j1peca = 3;

				} else if (tabuleiro[2][2] == j2peca) {

					l3j2peca = 3;
				}

			}
		}

		//caso uma das condições seja verdadeira imprimi o vencedor e sai da execução
		for (i=0;i<=6;i++) {
			
			// impressão do vencedor 1
			if (l1j1peca == 3 || l2j1peca == 3 || l3j1peca == 3) {

				System.out.println("O jogador " + j1 + " é o vencedor!");
				break;
				
			} if (l1j1peca == 1 && l2j1peca == 1 && l3j1peca == 1) {

				System.out.println("O jogador " + j1 + " é o vencedor!");
				break;

			} if (l1j1peca == 2 && l2j1peca == 2 && l3j1peca == 2) {

				System.out.println("O jogador " + j1 + " é o vencedor!");
				break;

			} if (l1j1peca == 3 && l2j1peca == 3 && l3j1peca == 3) {

				System.out.println("O jogador " + j1 + " é o vencedor!");
				break;
				
			} if (l1j1peca == 1 && l2j1peca == 2 && l3j1peca == 3) {

				System.out.println("O jogador " + j1 + " é o vencedor!");
				break;
				

			} if (l1j1peca == 3 && l2j1peca == 2 && l3j1peca == 1) {

				System.out.println("O jogador " + j1 + " é o vencedor!");
				break;
				

			}
			// impressão do vencedor 2
			if (l1j2peca == 3 || l2j2peca == 3 || l3j2peca == 3) {

				System.out.println("O jogador " + j2 + " é o vencedor!");
				break;				

			} if (l1j2peca == 1 && l2j2peca == 1 && l3j2peca == 1) {

				System.out.println("O jogador " + j2 + " é o vencedor!");
				break;				

			} if (l1j2peca == 2 && l2j2peca == 2 && l3j2peca == 2) {

				System.out.println("O jogador " + j2 + " é o vencedor!");
				break;				

			} if (l1j2peca == 3 && l2j2peca == 3 && l3j2peca == 3) {

				System.out.println("O jogador " + j2 + " é o vencedor!");
				break;				

			} if (l1j2peca == 1 && l2j2peca == 2 && l3j2peca == 3) {

				System.out.println("O jogador " + j2 + " é o vencedor!");
				break;				

			} if (l1j2peca == 3 && l2j2peca == 2 && l3j2peca == 1) {

				System.out.println("O jogador " + j2 + " é o vencedor!");
				break;
				
			}
			
		}
		

	}

}
