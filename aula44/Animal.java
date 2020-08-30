package com.bruno.cursojava.aula44;
//Curso de Java 44: Orientação a Objetos: Interfaces
public abstract class Animal {
	
	private String nome;
	
	public abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
