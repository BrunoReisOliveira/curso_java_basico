package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio24 {

	public static void main(String[] args) {
		/*você foi contratado para desenvolver o programa
		que monta a tabela de preços de pães, de 1 até 50, a partir
		do preço do pão informado pelo usuário, conforme o 
		exemplo abaixo:

		Preço do pão:R$0.18
		Panificadora Pão de Ontem - Tabela de preços

		*1- R$ 0.18
		*2- R$ 0.36
		* ...
		*50- R$ 9.00
		*/
		
		Scanner scan = new Scanner (System.in);
		int i=0;
		double precopao=0,total=0;
		
		System.out.println("Digite o preço do pão:");
		precopao = scan.nextDouble();
		
		System.out.println("Preço do pão:R$"+precopao);
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		for (i=1; i<=50; i++) {
			
			total +=precopao;
			System.out.println(i+"-R$"+total);
		
		}
		

	}

}
