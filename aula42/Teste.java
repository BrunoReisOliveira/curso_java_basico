package com.bruno.cursojava.aula42;
/* Curso de Java 42: Orientação a Objetos: 
 * Palavra chave final
 */
public class Teste {

	public static void main(String[] args) {
		
		//não é possível devido a abstração da classe
		Pessoa pessoa = new Pessoa();		
		//Pessoa aluno = new Aluno();		
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();		
		Professor professor = new Professor();
		
		//exemplo 2
		System.out.println(Constantes.URl_BLOG);
		//Constantes.URl_BLOG = "rerererere";
		System.out.println(Constantes.URl_BLOG);
		
		final int TOTAL = 1;
		
		//total = total=1;
		System.out.println(TOTAL);

	}

}
