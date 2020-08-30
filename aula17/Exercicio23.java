package com.bruno.cursojava.aula17;

public class Exercicio23 {

	public static void main(String[] args) {
		/*
		 * você foi contratado para desenvolver o programa
		   que monta esta tabela de preços, que conterá
		   os preços de 1 até 50 produtos, conforme o exemplo abaixo:

			Lojas Quase Dois - Tabela de preços

		 	*1- R$ 1.99
		 	*2- R$ 3.98
		 	*...
		 	*50- R$ 99.50
		 */
		int i=0;
		double basepreco =1.99;
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		
		for(i=1; i<=50; i++) {
			
			System.out.println(i+"-R$"+basepreco);
			basepreco +=1.99;
		}
		
		
	}

}
