package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio24 {

	public static void main(String[] args) {
		/*
		 * Números palíndromos são aqueles que escritos da direita para a 
			esquerda têm o mesmo valor quando escritos da esquerda para a
			direita.Ex:545;789987;97379;123454321;etc. 
			Escreva um programa que verifique
			se um dado vetor A de 10 elementos inteiros é
			palíndromo, ou seja, se o primeiro elemento do vetor é igual
			ao último, se o segundo elemento do vetor é igual ao penúltimo e assim
			por diante até verificar todos os elementos ou chegar a conclusão que 
			o vetor não é um palíndromo.
		 */		

		int i=0,indicenum=0,count=0,tvet=0;
		Scanner scan = new Scanner (System.in);
			System.out.println("Digite números e saiba se o conjunto é palíndromo");
					
			try {
					System.out.println("Digite a quantidade de números que serão digitados:");
							tvet = scan.nextInt();
							indicenum = tvet-1;
					}catch(InputMismatchException e) {
							System.out.println("Digite apenas números sem vírgula!");
							main (args);
			}		
		
		int [] num = new int [tvet];	
		
		try {
			
			for (i=0;i<num.length;i++) {
				System.out.println("Digite o número "+(i+1));
				num[i]=scan.nextInt();
			}
			
			for (i=0;i<num.length;i++) {
				
				if (num[i]==num[indicenum]) {
					count +=1;					
				}				
				indicenum-=1;	
				
			}
			
			if (count ==tvet) {
				System.out.println("O vetor é palíndromo!");
			}else {
				System.out.println("O vetor não é palíndromo!");
			}			
									
		}catch (InputMismatchException e) {
			 System.out.println("Digite apenas números inteiros!");
			 main(args);
		}		

		
	}

}
