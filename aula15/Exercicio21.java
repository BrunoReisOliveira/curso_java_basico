package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio21 {

	
	public static void main(String[] args) {
		/*um posto está vendendo combustíveis
		 * com a seguinte tabela de descontos:
		 * 
		 * Álcool:
		 * a. até 20 litros, desconto de 3% por litro
		 * b. acima de 20 litros, descontos de 5% por litro
		 * 
		 * Gasolina:
		 * c. até 20 litros, desconto de 4% por litro
		 * d. acima de 20 litros, desconto de 6% por litro.
		 * escreva um algoritmo que leia o número
		 * de litros vendidos, o tipo de combustível 
		 * (codigicado da seguinte forma: A-álcool, G-gasolina),
		 * calcule e imprima o valor a ser pago pelo cliente
		 */
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Escolha o tipo de combustível: A-álcool ou G-gasolina");
		String escolha = scan.next();
		
		if (escolha.equalsIgnoreCase("A")||escolha.equalsIgnoreCase("G")) {
		
		System.out.println("Digite a quantidade de litros vendido:");
		double litros = scan.nextDouble();
		double precoa = 1.90;
		double precog = 2.50;
		double desconto =0;
		
		if (escolha.equalsIgnoreCase("A")&& litros <=20) {
			
			desconto = (1.90*3)/100;
			precoa = (precoa-desconto)*litros;
			System.out.println(precoa);
			System.out.println("Você pagará R$"+precoa+"0. "+"Equivalene a 3% de desconto.");
			
		}else if (escolha.equalsIgnoreCase("A")&& litros >20) {
			desconto = (1.90*5)/100;
			precoa = (precoa-desconto)*litros;
			System.out.println(precoa);
			System.out.println("Você pagará R$"+precoa+"0. "+"Equivalene a 5% de desconto.");
		} 
		
		else if (escolha.equalsIgnoreCase("G")&& litros <=20) {
			desconto = (2.50*4)/100;
			precog = (precog-desconto)*litros;
			System.out.println(precog);
			System.out.println("Você pagará R$"+precog+"0. "+"Equivalene a 4% de desconto.");
		
		}else if (escolha.equalsIgnoreCase("G")&& litros >20) {
			desconto = (2.50*6)/100;
			precog = (precog-desconto)*litros;
			System.out.println(precog);
			System.out.println("Você pagará R$"+precog+"0. "+"Equivalene a 6% de desconto.");
		
		}else {
			System.out.println("Escolha incorreta!");
			return;
		}

}
}
}


