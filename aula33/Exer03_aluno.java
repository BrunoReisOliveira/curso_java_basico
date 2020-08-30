package com.bruno.cursojava.aula33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer03_aluno {
	/*
	 * Reescreva os seguintes exercícios, criando todos os atributos do tipo
	 * privado, métodos getters e setters e construtores. Os métodos que serão
	 * utilizados pela classe de teste devem ser públicos. Se ncessário, crie
	 * métodos privados como auxiliares para organizar melhor o código fonte também.
	 * 
	 * 3)Escreva uma classe para representar uma aluno. Adicione atributos
	 * relacionados às características de um aluno, como nome, matrícula,curso que
	 * está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3
	 * disciplinas. Desenvolva um método para verificar se o aluno está aprovado
	 * (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa
	 * para testar essa classe, que pede as informações do aluno ao usuário e ao
	 * final informa o nome das disciplinas,mostra as notas e mostra se aluno foi
	 * aprovado ou não.
	 */

	private String nomeAluno, matriculaAluno, cursoMatriculado;
	private String[] disciplina;
	private double[] notas;
	int i = 0, aprovado = 0;
	// construtor vazio
	public Exer03_aluno() {
		disciplina = new String[3];
		notas = new double[3];
	};
	public Exer03_aluno(String nomeAluno, String matriculaAluno, 
			String cursoMatriculado, String[] disciplina,
			double[] notas) {
		
		this.nomeAluno = nomeAluno;
		this.matriculaAluno = matriculaAluno;
		this.cursoMatriculado = cursoMatriculado;
		this.disciplina = disciplina;
		this.notas = notas;
		this.disciplina = new String[3];
		this.notas = new double[3];
	}



	Scanner scan = new Scanner(System.in);

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(String cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}

	public void informarDisciplina() {
		for (i = 0; i < disciplina.length; i++) {
			System.out.println("Digite a disciplina " + (i + 1));
			disciplina[i] = scan.next();
		}
	}

	public void informarNota() {
		for (i = 0; i < notas.length; i++) {
			try {
				System.out.println("Digite a nota " + (i + 1));
				notas[i] = scan.nextDouble();		
				
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas números!");
				break;
			}
			
		}
	}

	// melhorar o método
	public void verificarAprovacao() {
		
		for (i=0;i<disciplina.length;i++) {
			System.out.println("Disciplina "+disciplina[i]);		
			
			}
		
		for (i=0;i<notas.length;i++) {
			System.out.println("Nota "+notas[i]);
			if (notas[i]>=7) {
				aprovado+=1;
			}			
		
		}	
		
		System.out.println("O aluno "+nomeAluno+" foi aprovado em:"+aprovado+" matéria(s)");
	}
	
	
	
	
}
