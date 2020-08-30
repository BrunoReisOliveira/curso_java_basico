package com.bruno.cursojava.aula36labs;
import java.util.Scanner;
public class Exer02 {

	public static void main(String []args) {
		
	Scanner scan = new Scanner (System.in);
		
	System.out.println("Digite o nome do curso");
	String nomeCurso = scan.nextLine();
	
	System.out.println("Digite o horário do curso");
	String horarioCurso = scan.nextLine();
	
	System.out.println("Digite o nome do professor");
	String nomeProf = scan.nextLine();
	
	System.out.println("Digite o nome do departamento do professor");
	String DepProf = scan.nextLine();
	
	System.out.println("Digite o e-mail  do professor");
	String emailProf = scan.nextLine();
	
	//intância da classe
	Curso curso = new Curso();
	curso.setNome(nomeCurso);
	curso.setHorario(horarioCurso);
	
	//intância da classe	
	Professor professor = new Professor();
	professor.setNome(nomeProf);
	professor.setDepartamento(DepProf);
	professor.setEmail(emailProf);
	
	//seatar o professor na classe curso
	curso.setProfessor(professor);
	
	System.out.println("---Alunos---");
	
	//instancia da classe aluno
	Aluno[] alunos = new Aluno[5];
	
	for (int i =0;i<5;i++) {
		
		scan.nextLine();
		
		System.out.println("Digite o nome do aluno: "+(i+1));
		String nomeAluno = scan.nextLine();
		
		System.out.println("Digite a matrícula do aluno:");
		String matricula = scan.nextLine();
		
		double [] notas = new double [4];
		
		for (int j=0;j<4;j++) {
			System.out.println("Digite a nota "+(j+1));
			notas[j]=scan.nextDouble();
		}
		
		//chamada da classe Aluno
		Aluno aluno = new Aluno ();
		aluno.setNome(nomeAluno);
		aluno.setMatricula(matricula);
		aluno.setNotas(notas);
		
		alunos [i] = aluno;
		
		
	}		
		//setar na classe curso os "alunos"
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
	
	}
	
}
