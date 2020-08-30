package com.bruno.cursojava.aula52;

public class DivisaoNaoExata extends Exception {
	
	private int num;
	private int denom;
	
	//construtor
	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "Resultado de "+num+"/"+denom+" não é um inteiro! ";
	}
	
	
	

}
