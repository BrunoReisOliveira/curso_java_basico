package com.bruno.cursojava.aula43;

public class Exercicio02_contribuinte_PJ extends Exercicio02_contribuinte {
	
	public double calcularImposto(double rendaBruta) {
		
		double desconto=((rendaBruta*10)/100);
		double result = rendaBruta-desconto;
		
		return result;
	}

}
