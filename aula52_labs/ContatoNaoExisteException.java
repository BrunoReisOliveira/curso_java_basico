package com.bruno.cursojava.aula52_labs;

public class ContatoNaoExisteException extends Exception {
	
	private String nomeContato;
	
	//construtor	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
		
	}
	
	@Override
	public String getMessage() {
		return "Contato "+nomeContato +" não existe na agenda!";
	}

}
