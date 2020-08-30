package com.bruno.cursojava.aula43;

public class Exercicio03_peixe extends Exercicio03_animal{
	
	private String caracteristica;

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}	
	//construtores
	public Exercicio03_peixe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exercicio03_peixe(String caracteristica) {
		super();
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		s += " "+super.toString();
		s += " \n Caracteristica: "+caracteristica;
		s += "]";		
		return s;
	}	

}
