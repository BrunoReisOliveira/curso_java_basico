package com.bruno.cursojava.aula40;
/*3:56 / 12:47
Curso de Java 40: Orientação a Objetos: 
Herança e Polimorfismo: 
sobrecarga de métodos
 * 
 */
public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelula;
	
	
	
	//construtor vazio
	public Pessoa() {}
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
	
	public String obterEtiquetaEndereco(){
		
		return endereco;
		
	}
	
	
}
