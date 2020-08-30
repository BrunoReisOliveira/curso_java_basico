package com.bruno.cursojava.aula35;

public class Exer01_Fibonacci {
	/*a série de Fibonacci é formada pela sequência
	1,1,2,3,5,8,13,21,34,55,...
	faça um programa capaz de gerar a série
	até o n-ésimo termo.				
	*/	
	public static int fibonacci(int num) {
			if (num<2) {
				
				return 1;				
			}			
			return fibonacci (num-1)+fibonacci(num-2);
	}		
		
}










