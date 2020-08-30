package com.bruno.cursojava.aula34;

public class Exer03_Calculadora_fatorial {
	
	public static double somar(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(double num1, double num2) {
		
		double result=0;
		try {
			
			 result=num1 / num2;
			
		}catch(ArithmeticException e) {
			System.out.println("Não foi possível efetuar a divisão!");
			
		}
		
		
		return result ;
	}

	public static double potencia(double base, double exp) {

		int i = 0;
		double result=0,temp=0,resulttemp=0;
		temp=base;	
		for (i = 1; i < exp; i++) {
			
			result = temp*base;
			resulttemp=result;
			temp=result;
		}
		
		return resulttemp;

	}
	
	public static int fatorial (int valor) {
		if (valor == 1 || valor ==0){
			
			System.out.print("1");
			return (1);
			
		}
		System.out.print(valor+".");
		
		return fatorial (valor-1)*valor;		
}


}
