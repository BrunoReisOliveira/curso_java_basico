package com.bruno.cursojava.aula35;

public class Calculadora_use {

	public static void main(String[] args) {
	
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		
		System.out.println("Fatorial não recursivo: "+fatorialNR);
		
		int fatorialR = Calculadora.fatorial(5);
	
		System.out.println("Fatorial recursivo: "+fatorialR);
	
	}
	
	
	
	

}
