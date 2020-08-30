package com.bruno.cursojava.aula34;

public class TesteCalculadora {
	static int retornoSoma=0;
	public static void main(String[] args) {
		
		
		//sem o método estático
		/*Minhacalculadora calc = new Minhacalculadora();

		calc.soma(1, 2);
		calc.soma(1.0, 2.2);
		calc.soma(1, 2, 3);*/
		
		//com o métodos estático
		
		retornoSoma=Minhacalculadora.soma(1, 2);
		System.out.println(retornoSoma);
		
		
		retornoSoma=soma2Valores(5, 5);
		System.out.println(retornoSoma);
		

	}

	static int soma2Valores (int num1, int num2) {
		return Minhacalculadora.soma(num1, num2);
	}
}
