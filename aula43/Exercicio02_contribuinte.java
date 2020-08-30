package com.bruno.cursojava.aula43;
//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
public class Exercicio02_contribuinte {
	
	private String nome;
	
	//método toString
	@Override
	public String toString() {
		return "Exercicio02_contribuinte [nome=" + nome + "]";
	}
	
	//get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//construtores	
	public Exercicio02_contribuinte(String nome) {
		super();
		this.nome = nome;
	}
	public Exercicio02_contribuinte() {
		super();
		
	}

}
