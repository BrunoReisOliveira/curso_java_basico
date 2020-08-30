package com.bruno.cursojava.aula43;

public class Exercicio03_animal {
	
	private String nome;
	private String comprimento;
	private String patas;
	private String cor;
	private String ambiente;
	private String velocidade;	
	
	//contrutores
	public Exercicio03_animal() {
		super();
		
	}
	public Exercicio03_animal(String nome, String comprimento, String patas, String cor, String ambiente,
			String velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public String getPatas() {
		return patas;
	}
	public void setPatas(String patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		return "Exercicio03_animal [\n Animal=" + nome + "\n Comprimento=" + comprimento + "\n Patas=" + patas + "\n Cor=" + cor
				+ "\n Ambiente=" + ambiente + "\n Velocidade=" + velocidade + "]";
	}
	
	

}
