package com.bruno.cursojava.aula39;

public class Pessoa {
	
	/*Orientação a Objetos: Herança: 
	modificadores de acesso + protected*/
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelula;
	
	//atributo de teste com modificador padrão Java
	//String nomeVisibilidade;
	//public String nomeVisibilidade;
	//visível somente dentro da própria classe
	//private String nomeVisibilidade;
	
	protected String nomeVisibilidade;
	
	//construtor vazio
	public Pessoa() {
		nomeVisibilidade = "Bruno Reis";
	}
	
	public void setNomeVisibilidade(String nomeVisibilidade) {
		this.nomeVisibilidade = nomeVisibilidade;
	}

	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getTelefoneCelula() {
		return telefoneCelula;
	}
	public void setTelefoneCelula(String telefoneCelula) {
		this.telefoneCelula = telefoneCelula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
