package com.bruno.cursojava.aula52_labs;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		
		return "Agenda já está cheia";
	}

}
