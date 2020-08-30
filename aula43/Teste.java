package com.bruno.cursojava.aula43;
/*
 * Curso de Java 43: Orientação a Objetos: Classe Object
 */
public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double [] notas = {10,9,8,7};
		aluno.setNotas(notas);		
		System.out.println(aluno);
		
		String s1="dsdadadasdas";
		String s2="dsdadadasdas";
		
		System.out.println(s1.equals(s2));
				
		Aluno aluno2 = new Aluno();		
		aluno2.setCurso("Ciência da Computação");
		double [] notas2 = {5,3,6,7.1};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
	}

}
