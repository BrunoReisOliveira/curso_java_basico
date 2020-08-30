package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		/*
		 * Ler as duas notas bimestrais para um conjunto de 
		 * 10 alunos.
			Armazenar as notas informadas em dois vetores 
			N1 e N2	do tipo real. 
			Escreva um programa que calcule 
			a média aritmética
			simples das notas informadas armazedando 
			o resultado em um vetor
			Result de mesmo tipo e tamanho. 
			Ao mostrar os resultados exibir a 
			situação de cada aluno. 
			Se a média calculada 
			for superior ou igual a 7
			o aluno estará "aprovado", 
			caso contrário, 
			a situação do aluno será
			"reprovado".
		 */
		Scanner scan = new Scanner (System.in);
		double [] notas1 = new double [10];
		double [] notas2 = new double [10];
		double [] result = new double [10];
		
		int i=0;
		try {
			
			for (i=0;i<notas1.length;i++) {				
				System.out.println("Digite as 10 notas iniciais: nota "+(i+1));
				notas1[i]=scan.nextDouble();				
			}
			
			for (i=0;i<notas2.length;i++) {				
				System.out.println("Digite as 10 notas secundárias: nota "+(i+1));
				notas2[i]=scan.nextDouble();				
			}
			
			for (i=0;i<result.length;i++) {
				result[i]= (notas1[i]+notas2[i])/2;
				
				if (result[i]>=7) {
					System.out.println("O aluno "+(i+1)+" está aprovado!"+"Nota "+result[i]);
				}
				else {
					System.out.println("O aluno "+(i+1)+" está reprovado!"+" Nota "+result[i]);
				}
			}			
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números!");
			main (args);
		}

	}

}
