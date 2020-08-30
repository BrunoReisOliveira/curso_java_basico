package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio21 {

public static void main(String[] args) {
/*
  faça um programa que calcule o número médio de alunos por turma
para isto, peça a quantidade de turmas e a quantidade de alunos
para cada turma. As turmas não podem ter mais de 40 alunos*/

Scanner scan=new Scanner (System.in);

int i=1,qtdturma=0,qtdalunos=0,somaaluno=0;
double media=0;

try {
	System.out.println("Digite a quantidade de turmas:");
	qtdturma = scan.nextInt();
	do {
	
		System.out.println("Digite a quantidade de alunos para sala "+i);
		qtdalunos = scan.nextInt();
		somaaluno +=qtdalunos;
		i++;
	
	}while (i<=qtdturma);

		media = somaaluno / qtdturma;
		
			if (media >40) {		
					System.out.println("Capacidade máxima de alunos por sala atingida!Valor máximo permitido 40. Valor atingido "+media);
					main (args);
			}else {
				System.out.println("A média de alunos por turma é:" +media);
		}	

}catch (InputMismatchException e) {
	System.out.println("Digite apenas números sem vírgula!");
	main (args);
}

}

}

