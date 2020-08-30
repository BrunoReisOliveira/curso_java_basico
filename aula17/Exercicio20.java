package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio20 {


public static void main(String[] args) {
/*faça um programa que peça para n pessoas a sua idade,
ao final, o programa deverá verificar se a média de idade
da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
*
*/
	String resp="";
	int idade=0,qtdidade=0,somaidade=0;
	double media=0;
	
	Scanner scan=new Scanner (System.in);
	
	try {
	
	do {
	
		System.out.println("Digite uma idade:");
		idade = scan.nextInt();
		somaidade +=idade;
		qtdidade +=1;
	
		System.out.println("Deseja digitar outra idade?");
		resp=scan.next();
	
	}while (resp.equalsIgnoreCase("S")||resp.equalsIgnoreCase("SIM"));
	
	media = somaidade /qtdidade;
	
	System.out.println("A média de idade é "+media);
	
		if (media >= 0 && media <=25) {
			System.out.println("Jovem (ns)!");
		}else if (media>=26 && media <=60) {
			System.out.println("Adulto (s)!");
		}else if (media >60) {
			System.out.println("Idoso (s)!");
		}
		
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas número sem vírgula!");
		main (args);
	}

}

}
