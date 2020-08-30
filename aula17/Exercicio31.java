package com.bruno.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		/*Um funcionário de uma empresa recebe aumento salarial
		anualmente:
		Sabe-se que:
		-Esse funcionário foi contratado em 1995, com salário
		inicial de R$1.000,00;
		-Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
		-A partir de 1997 (inclusive), os aumentos salariais
		sempre correspondem ao dobro do percentual do ano
		anterior. Faça um programa que determine
		o salário atual desse funcionário. Após concluir
		isto, altere o programa permitindo que o usuário digite o
		salário inicial do funcionário.*/
		
		double salario=1000, aumento=1.5;
		int i=0;
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for (i=1997; i<=2020; i++) {
						
			aumento *=2;	
			//novosalario = ((salario * aumento)/100)+salario;
			salario +=(salario/100)*aumento;
			System.out.println(i+"="+format.format(salario)+" - "+aumento);
					
			
	}

}
}
