package com.bruno.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		//ler uma linha inteira
		
		/*System.out.println ("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println ("Seu nome completo é: " + nomeCompleto);

		//ler um tipo de dado específico
		
		System.out.println ("Digite seu primeito nome:");
		String primeiroNome = scan.next();
		System.out.println ("Seu primeiro nome é: " + primeiroNome);
		
		//ler um dado do tipo inteiro
		
		System.out.println ("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println ("Sua idade é: " + idade);
		
		
		//ler um dado do tipo double ou float		
		System.out.println ("Digite sua altura:");
		double altura =scan.nextDouble();
		System.out.println ("A sua altura é: " + altura);*/
		
		//ler vários tipos ao mesmo tempo
		System.out.println("Digite o seu primeiro nome,idade,quantidade de filhos,altura e se tem bichinho de estimação:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " +idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " +altura);
		System.out.println("Tem bichinho de estimação? " + temPet);
	
	}	

}
