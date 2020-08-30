package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		/*faça um programa que pergunte quanto
		você ganha por hora e o número de horas
		trabalhadas no mês.
		
		Calcule e mostre o total
		do seu salário no referido mês, 
		sabendo-se que são descontados 
		11% para o IR, 
		8% para o INSS e 
		5% para
		o sindicato. 
		
		Faça um programa que nos dê:
		
		a. salário bruto
		b. quanto pagou ao INSS
		c. quanto pagou ao sindicato
		d. o salário líquido
		e. calcule os descontos e salário líquido, conforme
		a tabela abaixo:*/
		
		/*+ Salário Bruto: R$ - IR (11%) : R$ - INSS (8%) : R$ 
		- Sindicato (5%) : R$ = Salário Líquido : R$*/
		//OBS: Salário Bruto - Descontos = Salário Líquido
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o valor ganho por hora e a quantidade de horas trabalhadas no mês");
		double salariohora = scan.nextDouble();
		int qtdhorasmes = scan.nextInt();
		double sbruto = salariohora * qtdhorasmes;
		double ir = (sbruto *11)/100;
		double inss = (sbruto*8)/100;
		double sindicato = (sbruto*5)/100;
		double sdescontos = (sbruto* 24)/100;
		double sliquido = sbruto - sdescontos;
		
		System.out.println("O salário bruto por mês é R$"+sbruto);
		System.out.println("O valor pago de IR é R$"+ir+" correspondente a 11% de R$"+sbruto);
		System.out.println("O valor pago de INSS é R$"+inss+ " correspondente a 8% de R$"+sbruto);
		System.out.println("O valor pago de sindicato é R$"+sindicato+ " correspondente a 5% de R$"+sbruto);
		System.out.println("O salário líquido é R$"+sliquido+ " correspondente a R$" + sdescontos+" de descontos sobre o salário R$ "+sbruto);

	}

}
