package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio22 {

	public static void main(String[] args) {
		/*Faça um programa que calcule o valor total investido
			por um colecionador em sua coleção de cd's e o valor
			médio gasto em cada um deles. O usuário deverá informar
			a quantidade de cd's e o valor para em cada um
			* 
		 */		
		Scanner scan = new Scanner (System.in);
		
		double somavalcd=0,valmedio=0,valcd=0;
		int i=1, qtdcd=0;

		
		System.out.println("Digite a quantidade de CD's");
		qtdcd = scan.nextInt();	
		
		do {			
			System.out.println("Digite o valor para o cd "+i);
			valcd = scan.nextDouble();
			somavalcd +=valcd;		
			i++;
			
		}while (i<=qtdcd);
		
		System.out.println("O valor total gasto é: "+somavalcd);
		System.out.println("O valor médio gasto em cada cd é "+somavalcd / qtdcd);
}

}
