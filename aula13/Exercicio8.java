package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio8 {

		public static void main(String[] args) {
		//faça um programa que pergunte quanto você
		//ganha por hora e o número de horas trabalhadas
		//no mês. Calcule e mostre o total do seu 
		//salário no referido mês
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor ganhado por hora e a quantidade de horas trabalhadas no mês:");
		
		double vhora = scan.nextDouble();
		double qtdhora = scan.nextDouble();
		double salario = vhora * qtdhora;
		
		System.out.println("Seu salário no mês é:"+"R$"+salario);
		

	}

}
