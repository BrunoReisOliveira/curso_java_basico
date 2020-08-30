package com.bruno.cursojava.aula27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXE_03_Aluno {

	/*
	 * Escreva uma class para representar um aluno. Adicione atributos relacionados
	 * às cracterísticas de um aluno, como nome, matrícula, curso que está
	 * matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3
	 * disciplinas. Desenvolva um método para verificar se o aluno está
	 * aprovado(nota maior ou igual a 7) em uma determinada disciplina. Escreva um
	 * programa para testar essa classe, que pede as informações do alunno ao
	 * usuário e ao final informa o nome das disciplinas, mostra as notas e mostra
	 * se o aluno foi aprovado ou não.
	 */

	String aprovado;
	double nota = 0;
	int i = 0;
	Scanner scan = new Scanner(System.in);

	String verificarNotas(String disciplinaAtual) {

		try {

			System.out.println("Digite a nota");
			nota = scan.nextDouble();

			if (nota >= 7) {
				aprovado = "Aprovado!";
			} else {
				aprovado = "Reprovado!";
			}

		} catch (InputMismatchException e) {
			System.out.println("Digite apenas números!");

		}

		return aprovado;

	}

}
