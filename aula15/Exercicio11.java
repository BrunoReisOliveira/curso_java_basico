package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		/* faça um programa que recebe o salário de um colaborador
		e o reajuste segundo o seguinte critério,baseado no salário atual:
		
		*salários até R$ 280,00 (incluindo) : aumento de 20%
		*salários entre R$ 280,00 e R$ 700,00: aumento de 15%
		*salários entre R$ 700,00 e R$ 1.500,00: aumento de 10%
		*salários entre R$ 1.500,00 em diante: aumento de 5%
		*Após o aumento ser realizado, informe na tela:
		
		*o salário antes do reajuste;
		*o percentual de aumento aplicado;
		*o valor do aumento;
		*o novo salário. após o aumento;
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de seu salário:");
		
		double salario = scan.nextDouble();
		double percaumento;
		double valoraumento;
		double salarionovo;
		
		if (salario <=280) {
		valoraumento = (salario * 20)/100;
		salarionovo = salario + valoraumento;
		percaumento = ((salarionovo / salario)*100)-100;
		
		System.out.println("Salário antes do reajuste:"+" R$"+salario);
		System.out.println("Percentual de aumento:"+" %"+percaumento);
		System.out.println("Valor do aumento:"+" R$"+valoraumento);
		System.out.println("Novo salário:"+" R$"+salarionovo);		

		}else if (salario >280 && salario <=700) {
		valoraumento = (salario * 15)/100;
		salarionovo = salario + valoraumento;
		percaumento = ((salarionovo / salario)*100)-100;
		
		System.out.println("Salário antes do reajuste:"+" R$"+salario);
		System.out.println("Percentual de aumento:"+" %"+percaumento);
		System.out.println("Valor do aumento:"+" R$"+valoraumento);
		System.out.println("Novo salário:"+" R$"+salarionovo);		

		}else if (salario >700 && salario <=1500) {
		valoraumento = (salario * 10)/100;
		salarionovo = salario + valoraumento;
		percaumento = ((salarionovo / salario)*100)-100;
		
		System.out.println("Salário antes do reajuste:"+" R$"+salario);
		System.out.println("Percentual de aumento:"+" %"+percaumento);
		System.out.println("Valor do aumento:"+" R$"+valoraumento);
		System.out.println("Novo salário:"+" R$"+salarionovo);		

		}else if (salario >1500) {
		valoraumento = (salario * 5)/100;
		salarionovo = salario + valoraumento;
		percaumento = ((salarionovo / salario)*100)-100;			
		System.out.println("Salário antes do reajuste:"+" R$"+salario);
		System.out.println("Percentual de aumento:"+" %"+percaumento);
		System.out.println("Valor do aumento:"+" R$"+valoraumento);
		System.out.println("Novo salário:"+" R$"+salarionovo);		

}
}
}
