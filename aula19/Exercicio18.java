package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		/*Ler um vetor A com 10 elementos inteiros 
		 * correspondentes as idades
			de um grupo de pessoas. 
			Escreva um programa que
			determine e escreva a menor e a maior idade 
			e suas posições
		 */		
		Scanner scan = new Scanner (System.in);
		int [] idades = new int [10];
		int i=0,maioridade = Integer.MIN_VALUE,menoridade = Integer.MAX_VALUE,pmaior=0,pmenor=0;
		
		System.out.println("Digite 10 idades e saiba a menor e maior");
		try {
			
			for (i=0;i<idades.length;i++) {
				System.out.println("Digite a idade "+(i+1));
				idades[i]= scan.nextInt();
				
				if (idades[i]>maioridade) {
					maioridade=idades[i];
					pmaior = i;
				}else if (idades[i]<menoridade) {
					menoridade = idades[i];
					pmenor=i;					
				}
			}			
			
			System.out.println("Maior idade é:"+maioridade+" posição "+pmaior);
			System.out.println("Menor idade é:"+menoridade+" posição "+pmenor);
			
		}catch (InputMismatchException e) {
			System.out.println("Digite apenas números sem vírgula!");
			main (args);
		}

	}

}
