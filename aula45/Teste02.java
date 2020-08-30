package com.bruno.cursojava.aula45;
//Curso de Java 45: Orientação a Objetos: Casting e instaceof
public class Teste02 {

	public static void main(String[] args) {
		
		Object objt1 = obterString();
		//dowcasting
		String s1 = (String) objt1;
		//upcasting
		Object objt2 = "Minha String"; 
		//dowcasting
		String s2 = (String)objt2;
		
		Object objt3 = new Object();
		//dowcasting
		String s3= (String) objt3;
		
		Object objt4 = obterInteiro();
		//dowcasting
		String s4 = (String)objt4;
		
	}
	
	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
