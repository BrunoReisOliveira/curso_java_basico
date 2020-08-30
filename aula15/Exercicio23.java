package com.bruno.cursojava.aula15;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio23 {

	public static void main(String[] args) {
		/* o hipermercado tabajara está com uma 
		 * promoção de carnes que é 
		 * imperdível. Confira:
		 * 
		 * até 5kg
		 * File Duplo R$4,90 por kg
		 * Alcatra R$5,90 por kg
		 * Picanha R$ 6,90 por kg
		 * 
		 * acima de 5kg
		 * File Duplo R$5,80 por kg
		 * Alcatra R$6,80 por kg
		 * Picanha R$ 7,80 por kg
		 * 
		 * Para atender a todos os clientes,
		 * cada cliente poderá levar
		 * apenas um dos tipos de carne da promoção,
		 * porém não há limites para a quantidade de carne
		 * por cliente. Se a compra for feita no cartão
		 * Tabajara, o cliente receberá ainda um desconto
		 * de 5% sobre o total da compra. Escreva um
		 * programa que peça o tipo e a quantidade
		 * de carne comprada pelo usuário e gere um cupom
		 * fiscal, contendo as informações da compra:
		 * tipo e quantidade de carne, preço total,
		 * tipo de pagamento, valor do desconto e valor a 
		 * pagar.
		 */
		Scanner scan = new Scanner(System.in);
		String tipoc;
		double qtdcarne=0;
		double precototal=0;
		double desconto=0;
		double valorapagar=0;
		int tipopag=0;		
		double fileduplo=0;
		double alcatra=0;
		double picanha=0;	
		
		System.out.println("Digite o tipo de carne:File Duplo, Alcatra ou Picanha.");
		tipoc=scan.nextLine();
		
		if (tipoc.equalsIgnoreCase("File Duplo")||tipoc.equalsIgnoreCase("Alcatra")||tipoc.equalsIgnoreCase("Picanha")) {;
			try {
			System.out.println("Digite a quantidade em Kg");
			qtdcarne = scan.nextDouble();
			
			}catch (InputMismatchException e) {
				System.out.println("Digite apenas número!");
				return;
			}
			try {
			System.out.println("Escolha a forma de pagamento:1-Cartão Tabajara ou 2-Outros(cartões, dinheiro etc");
				tipopag= scan.nextInt();
				if(tipopag >2) {
					System.out.println("Forma de pagamento inválida!");
					return;
				}
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas números!");
			}
			
			if (qtdcarne <=5 && tipopag==1) {
				
				fileduplo=4.90;
				alcatra=5.90;
				picanha=6.90;
				
				if (tipoc.equalsIgnoreCase("File Duplo")) {
					desconto = ((fileduplo * qtdcarne)*5)/100;
					precototal = (fileduplo * qtdcarne);
					valorapagar = precototal-desconto;
					System.out.println("-------------------Cupom Fiscal--------------------");
					System.out.println("---------------------------------------------------");
					System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+fileduplo);
					System.out.println("Quantidade de carne em KG:"+qtdcarne);
					System.out.println("Tipo de pagamento:Cartão Tabajara");
					System.out.println("Preço total:R$"+precototal);
					System.out.println("Valor do desconto:R$"+desconto+" 5%.");
					System.out.println("Valor a pagar:R$"+valorapagar);
					
				}else if (tipoc.equalsIgnoreCase("Alcatra")) {
					desconto = ((alcatra * qtdcarne)*5)/100;
					precototal = (alcatra * qtdcarne);
					valorapagar = precototal-desconto;
					System.out.println("-------------------Cupom Fiscal--------------------");
					System.out.println("---------------------------------------------------");
					System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+alcatra);
					System.out.println("Quantidade de carne em KG:"+qtdcarne);
					System.out.println("Tipo de pagamento:Cartão Tabajara");
					System.out.println("Preço total:R$"+precototal);
					System.out.println("Valor do desconto:R$"+desconto+" 5%.");
					System.out.println("Valor a pagar:R$"+valorapagar);
					
				}else if (tipoc.equalsIgnoreCase("Picanha")) {
					desconto = ((picanha * qtdcarne)*5)/100;
					precototal = (picanha * qtdcarne);
					valorapagar = precototal-desconto;
					System.out.println("-------------------Cupom Fiscal--------------------");
					System.out.println("---------------------------------------------------");
					System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+picanha);
					System.out.println("Quantidade de carne em KG:"+qtdcarne);
					System.out.println("Tipo de pagamento:Cartão Tabajara");
					System.out.println("Preço total:R$"+precototal);
					System.out.println("Valor do desconto:R$"+desconto+" 5%.");
					System.out.println("Valor a pagar:R$"+valorapagar);
					
				}
			}
			 			if (qtdcarne >5 && tipopag==1) {
							
							fileduplo=5.80;
							alcatra=6.80;
							picanha=7.80;
							
							if (tipoc.equalsIgnoreCase("File Duplo")) {
								desconto = ((fileduplo * qtdcarne)*5)/100;
								precototal = (fileduplo * qtdcarne);
								valorapagar = precototal-desconto;
								System.out.println("-------------------Cupom Fiscal--------------------");
								System.out.println("---------------------------------------------------");
								System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+fileduplo);
								System.out.println("Quantidade de carne em KG:"+qtdcarne);
								System.out.println("Tipo de pagamento:Cartão Tabajara");
								System.out.println("Preço total:R$"+precototal);
								System.out.println("Valor do desconto:R$"+desconto+" 5%.");
								System.out.println("Valor a pagar:R$"+valorapagar);
								
							}else if (tipoc.equalsIgnoreCase("Alcatra")) {
								desconto = ((alcatra * qtdcarne)*5)/100;
								precototal = (alcatra * qtdcarne);
								valorapagar = precototal-desconto;
								System.out.println("-------------------Cupom Fiscal--------------------");
								System.out.println("---------------------------------------------------");
								System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+alcatra);
								System.out.println("Quantidade de carne em KG:"+qtdcarne);
								System.out.println("Tipo de pagamento:Cartão Tabajara");
								System.out.println("Preço total:R$"+precototal);
								System.out.println("Valor do desconto:R$"+desconto+" 5%.");
								System.out.println("Valor a pagar:R$"+valorapagar);
								
							}else if (tipoc.equalsIgnoreCase("Picanha")) {
								desconto = ((picanha * qtdcarne)*5)/100;
								precototal = (picanha * qtdcarne);
								valorapagar = precototal-desconto;
								System.out.println("-------------------Cupom Fiscal--------------------");
								System.out.println("---------------------------------------------------");
								System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+picanha);
								System.out.println("Quantidade de carne em KG:"+qtdcarne);
								System.out.println("Tipo de pagamento:Cartão Tabajara");
								System.out.println("Preço total:R$"+precototal);
								System.out.println("Valor do desconto:R$"+desconto+" 5%.");
								System.out.println("Valor a pagar:R$"+valorapagar);
								
							}
						}
			 				
			 			if (qtdcarne <=5 && tipopag==2) {
							
							fileduplo=4.90;
							alcatra=5.90;
							picanha=6.90;
							
							if (tipoc.equalsIgnoreCase("File Duplo")) {
								desconto = 0.00;
								precototal = (fileduplo * qtdcarne);
								valorapagar = precototal-desconto;
								System.out.println("-------------------Cupom Fiscal--------------------");
								System.out.println("---------------------------------------------------");
								System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+fileduplo);
								System.out.println("Quantidade de carne em KG:"+qtdcarne);
								System.out.println("Tipo de pagamento:Outros(cartões, dinheiro etc)");
								System.out.println("Preço total:R$"+precototal);
								System.out.println("Valor do desconto:R$"+desconto+" 0%.");
								System.out.println("Valor a pagar:R$"+valorapagar);
								
							}else if (tipoc.equalsIgnoreCase("Alcatra")) {
								desconto = 0.00;
								precototal = (alcatra * qtdcarne);
								valorapagar = precototal-desconto;
								System.out.println("-------------------Cupom Fiscal--------------------");
								System.out.println("---------------------------------------------------");
								System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+alcatra);
								System.out.println("Quantidade de carne em KG:"+qtdcarne);
								System.out.println("Tipo de pagamento:Outros(cartões, dinheiro etc)");
								System.out.println("Preço total:R$"+precototal);
								System.out.println("Valor do desconto:R$"+desconto+" 0%.");
								System.out.println("Valor a pagar:R$"+valorapagar);
								
							}else if (tipoc.equalsIgnoreCase("Picanha")) {
								desconto = 0.00;
								precototal = (picanha * qtdcarne);
								valorapagar = precototal-desconto;
								System.out.println("-------------------Cupom Fiscal--------------------");
								System.out.println("---------------------------------------------------");
								System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+picanha);
								System.out.println("Quantidade de carne em KG:"+qtdcarne);
								System.out.println("Tipo de pagamento:Outros(cartões, dinheiro etc)");
								System.out.println("Preço total:R$"+precototal);
								System.out.println("Valor do desconto:R$"+desconto+" 0%.");
								System.out.println("Valor a pagar:R$"+valorapagar);
								
							}
						}
						 			if (qtdcarne >5 && tipopag==2) {
										
										fileduplo=5.80;
										alcatra=6.80;
										picanha=7.80;
										
										if (tipoc.equalsIgnoreCase("File Duplo")) {
											desconto = 0.00;
											precototal = (fileduplo * qtdcarne);
											valorapagar = precototal-desconto;
											System.out.println("-------------------Cupom Fiscal--------------------");
											System.out.println("---------------------------------------------------");
											System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+fileduplo);
											System.out.println("Quantidade de carne em KG:"+qtdcarne);
											System.out.println("Tipo de pagamento:Outros(cartões, dinheiro etc)");
											System.out.println("Preço total:R$"+precototal);
											System.out.println("Valor do desconto:R$"+desconto+" 0%.");
											System.out.println("Valor a pagar:R$"+valorapagar);
											
										}else if (tipoc.equalsIgnoreCase("Alcatra")) {
											desconto = 0.00;
											precototal = (alcatra * qtdcarne);
											valorapagar = precototal-desconto;
											System.out.println("-------------------Cupom Fiscal--------------------");
											System.out.println("---------------------------------------------------");
											System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+alcatra);
											System.out.println("Quantidade de carne em KG:"+qtdcarne);
											System.out.println("Tipo de pagamento:Outros(cartões, dinheiro etc)");
											System.out.println("Preço total:R$"+precototal);
											System.out.println("Valor do desconto:R$"+desconto+" 0%.");
											System.out.println("Valor a pagar:R$"+valorapagar);
											
										}else if (tipoc.equalsIgnoreCase("Picanha")) {
											desconto = 0.00;
											precototal = (picanha * qtdcarne);
											valorapagar = precototal-desconto;
											System.out.println("-------------------Cupom Fiscal--------------------");
											System.out.println("---------------------------------------------------");
											System.out.println("Tipo de carne:"+tipoc+".Preço por KG R$"+picanha);
											System.out.println("Quantidade de carne em KG:"+qtdcarne);
											System.out.println("Tipo de pagamento:Outros(cartões, dinheiro etc)");
											System.out.println("Preço total:R$"+precototal);
											System.out.println("Valor do desconto:R$"+desconto+" 0%.");
											System.out.println("Valor a pagar:R$"+valorapagar);
											
										}
									}					
			
			}else {
				System.out.println("Escolha incorreta!");
			return;
		}
}
}

