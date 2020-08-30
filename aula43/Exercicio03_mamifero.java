package com.bruno.cursojava.aula43;

public class Exercicio03_mamifero extends Exercicio03_animal{

	private String alimento;

	public String getAlimento() {
		return alimento="";
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		
		String s="";
		s += " "+super.toString();
		s += "\n Alimento: "+alimento;
		s += "]";		
		return s;
		 
	}
	
	
	
	
	
}
