package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio12 {


	public static void main(String[] args) {
		/*
		DESENVOLVA UM GERADOR DE TABUADA, CAPAZ DE GERAR
		A TABUADA DE QUALQUER NÚMERO INTEIRO ENTRE 1 A 10.
		O USUÁRIO DEVE INFORMAR DE QUAL NÚMERO ELE DESEJA VER 
		A TABUADA. A SAÍDA DEVE SER CONFORME O EXEMPLO
		ABAIXO:
		Tabuada de 5:
		5 x 1 = 5
		5 x 2 = 10
		.
		.
		.
		5x10=50
		 */
		int tabuada=0,resultado=0,i=0;
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("Digite um número para gerar a tabuada:");
			tabuada = scan.nextInt();
			System.out.println("Tabuada do "+tabuada);			
			
			for (i=1;i<=10;i++) {
				
				System.out.println(tabuada+" X "+i+" = "+tabuada*i);			
			}			
			
		}catch( java.util.InputMismatchException e) {
			System.out.println("Digite apenas números sem vírgula!");
		}	
		

	}

}
