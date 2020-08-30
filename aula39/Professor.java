package com.bruno.cursojava.aula39;
/*
 * Orientação a Objetos: Herança: 
 * modificadores de acesso + protected
 * 
 */
public class Professor extends Pessoa{
	

	private double salario;
	private String nomeCurso;
	
	//validando os acessos 
	public void verificarAcesso(){
		
		this.nomeVisibilidade = "Bruno Reis";
		super.nomeVisibilidade = "Bruno Reis";
		this.setNomeVisibilidade("Bruno Reis");
	}
	
	
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
}
