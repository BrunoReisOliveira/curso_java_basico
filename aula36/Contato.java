package com.bruno.cursojava.aula36;

public class Contato {
	/*Curso de Java 36 - Orientação a Objetos: Relacionamento 
	 * entre Classes (tem um e tem muitos)*/
	
	private String nome;
	
	//chamada da classe do tipo endereço
	private Endereco endereco;
	
	//chamda da classe do tipo telefone
	//declaração de muitos telefones com array
	private Telefone [] telefones;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


}

	
