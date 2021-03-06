package com.bruno.cursojava.aula45;
//Curso de Java 45: Orientação a Objetos: Casting e instaceof
public class Aluno extends Pessoa {

	//Curso de Java 45: Orientação a Objetos: Casting e instaceof
	
	
	private String curso;
	private double [] notas;	
	
	//construtor com a palavra super
	public Aluno() {
		super();
		
	}	
		
	public Aluno(String nome, String endereco, String telefone,String curso) {
		super(nome, endereco, telefone);
		this.curso=curso;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		
		super.setCpf("32165498711");
		this.setCpf("32165498711"
				+ "");
	}
	
	
	public String obterEtiquetaEndereco(){
		
		String s = "Endereço do Aluno: ";
		s += super.getEndereco();
		return s;
		
	}
}
