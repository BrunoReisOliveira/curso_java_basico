package com.bruno.cursojava.aula17;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*faça um programa que leia
		 * um nome de usuário e a senha
		 * e não aceite a senha igual ao nome
		 * do usuário, mostrando uma 
		 * mensagem de erro e voltando
		 *  a pedir as informações
		 */		
		Scanner scan = new Scanner (System.in);	
		String user="";
		String senha="";
		do {
			
			System.out.println("Digite o nome de usuário:");
			user = scan.next();

			System.out.println("Digite uma senha:");
			senha = scan.next();
			
			if (user.equalsIgnoreCase(senha)) {
				System.out.println("Senha digitada deve ser diferente do nome de usuário!");
			}

		}while (user.equalsIgnoreCase(senha));
		
		System.out.println("Você digitou o usuário "+user+" e a senha "+senha);
	}
}


