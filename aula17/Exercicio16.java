package com.bruno.cursojava.aula17;

public class Exercicio16 {

	public static void main(String[] args) {
		/*a série de Fibonacci é formada
		 * pela sequência 
		 * 0,1,1,2,3,5,8,13,21,34,55...
		 * faça um programa que gere a série
		 * até que o valor seja maior que 500 
		 * 
		 */		
		int primeiro=1,segundo=1,proximo=0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
			while (proximo <=500){
				 
				proximo = primeiro + segundo;
				primeiro = segundo;
				segundo = proximo;
				 
			System.out.println(proximo);
		}			 
			
	}

}
