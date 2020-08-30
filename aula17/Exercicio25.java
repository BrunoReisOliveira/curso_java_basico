package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio25 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que implemente uma caixa registradora
			dudimentar. O programa deverá receber um número
			desconhecido de valores referentes aos preços das
			mercadorias. Um valor zero deve ser informado pelo
			operador para indicar o final da compra. O programa deve
			então mostrar o total da compra e perguntar o valor em dinheiro
			que o cliente forneceu, para então calcular e mostrar o valor
			do troco. Após esta operação, o programa deverá voltar ao ponto
			inicial, para registrar a próxima compra. A saída deve 
			ser conforme o exemplo abaixo:
			
			Lojas Tabajara
			Produto 1: R$ 2.20
			Produto 2: R$ 5.80
			Produto 3: R$ 0
			Total: 	R$ 9.00
			Dinheiro: R$20.00
			Troco: 	R$ 11.00 
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lojas Tabajara");
		
		double produto=0, total=0, dinheiro=0,troco=0;
		boolean fim = false;
		int i=1;
			try {
				
					do {					
					
					produto = scan.nextDouble();
					System.out.println("Produto "+i+": R$"+produto);
					total +=produto;
					i++;
					
					if (produto==0) {
						fim=true;				
					}
					
				}while (fim==false);
			
			}catch(InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main (args);
			}				
				
			System.out.println("Total: R$"+total);
			
			do {
				System.out.println("Digite o valor em dinheiro fornecido pelo cliente:");
				dinheiro=scan.nextDouble();
				
				if (dinheiro < total) {
					
					System.out.println("O valor informado é menor que o valor total!");
				}
				
			}while ( dinheiro < total);				
			
			System.out.println("Dinheiro: R$"+dinheiro);
			
			troco = dinheiro - total;
			
			System.out.println("Troco: R$"+troco);
			main (args);

	}

}
