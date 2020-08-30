package com.bruno.cursojava.aula39_teste;
/* Orientação a Objetos: Herança: modificadores 
 * de acesso + protected
 */
import com.bruno.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa {

	/*Orientação a Objetos: Herança: 
	modificadores de acesso + protected*/
	
	
	private String curso;
	private double [] notas;	
	
	//validando os acessos 
	public void verificarAcesso(){
		
		this.nomeVisibilidade = "Bruno Reis";
		super.nomeVisibilidade = "Bruno Reis";
		
		super.setNomeVisibilidade("Bruno Reis");
	}
	
	
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
}
