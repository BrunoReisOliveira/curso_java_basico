package com.bruno.cursojava.aula33;
import java.util.Scanner;
public class Exer03_aluno_use {

	public static void main(String[] args) {
	/*3)Escreva uma classe para representar uma aluno. Adicione atributos
	relacionados às características de um aluno, como nome, matrícula,curso que 
	está matriculado, nome de 3 disciplinas que está cursando e as notas
	dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
	aprovado (nota maior ou igual a 7) em uma determinada disciplina.
	Escreva um programa para testar essa classe, que pede as informações
	do aluno ao usuário e ao final informa o nome das disciplinas,mostra 
	as notas e mostra se aluno foi aprovado ou não.*/
	
		Exer03_aluno aluno = new Exer03_aluno();
		String nomeAluno, matriculaAluno,cursoMatriculado;
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o nome do aluno:");
		nomeAluno = scan.next();		
		aluno.setNomeAluno(nomeAluno);
		System.out.println("Digite a matrícula do aluno:");
		matriculaAluno = scan.next();
		aluno.setMatriculaAluno(matriculaAluno);
		System.out.println("Digite o curso do aluno:");
		cursoMatriculado= scan.next();
		aluno.setCursoMatriculado(cursoMatriculado);
		aluno.informarDisciplina();
		aluno.informarNota();
		
		System.out.println("Nome do Aluno:"+aluno.getNomeAluno());
		System.out.println("Matrícula do Aluno:"+aluno.getMatriculaAluno());
		System.out.println("Curso do Aluno:"+aluno.getCursoMatriculado());
		
		aluno.verificarAprovacao();
		
		
	}

}
