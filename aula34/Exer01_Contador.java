package com.bruno.cursojava.aula34;

public class Exer01_Contador {
	
	/*Escreva uma classe chamada Contador, que tem um
	atributo estático que é incrementado sempre que a
	classe for instanciada.
	Crie métodos para zerar, incrementar e retornar o 
	valor do contador.Desenvolva um	programa para testar essa classe.*/
	
	static int incrementa=0;
	
	public static int incrementarContador(){
		
		return incrementa+=1;
	}
	
	public static int retornaContador() {
		return incrementa;
	}
	
	public static int zerarContador() {
		return incrementa=0;
	}

}
