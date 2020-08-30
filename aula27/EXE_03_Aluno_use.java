package com.bruno.cursojava.aula27;

import java.util.Scanner;

public class EXE_03_Aluno_use {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String disciplina[] = new String[3];
		String nomeAluno, matricula, curso, retonoVericarNotas, disciplinaAtual;
		EXE_03_Aluno aluno = new EXE_03_Aluno();
		int i = 0;

		System.out.println("Digite o nome do aluno:");
		nomeAluno = scan.next();

		System.out.println("Digite o nome da matrícula do aluno:");
		matricula = scan.next();

		System.out.println("Digite o nome do curso do aluno:");
		curso = scan.next();

		for (i = 0; i < disciplina.length; i++) {
			System.out.println("Digite o curso " + (i + 1));
			disciplina[i] = scan.next();
			disciplinaAtual = disciplina[i];
			retonoVericarNotas = aluno.verificarNotas(disciplinaAtual);
			System.out.println("Disciplina "+disciplinaAtual+"\n"+retonoVericarNotas);
		}
				
		 System.out.println("Nome do aluno: "+nomeAluno);
		 System.out.println("Matrícula do aluno: "+matricula);		 
		 
		 for (i=0;i<=disciplina.length;i++) { 
			 
			 System.out.println(disciplina[i]); 
		}
		 

	}

}
