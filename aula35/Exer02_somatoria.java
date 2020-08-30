package com.bruno.cursojava.aula35;

public class Exer02_somatoria {
	/*escreva um método recursivo e etático que receba um número
	inteiro positivo N e calcule o somatório dos números de 1 a N*/
	
	public static int somarN(int num) {
				
		if (num==1) {
			return 1;
		}		
		return num +somarN (num-1);
	}	
	
	
}
