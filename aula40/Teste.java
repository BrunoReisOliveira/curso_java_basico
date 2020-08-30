package com.bruno.cursojava.aula40;
/* Curso de Java 40: Orientação a Objetos: Herança e 
 * Polimorfismo: sobrecarga de métodos
 */
public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1,num 1");
		aluno.setEndereco("Rua 2,num 2");
		professor.setEndereco("Rua 3,num 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}

}
