package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. 
		 * Escrever um programa
			que calcule e escreva			
			
			A) a soma de elementos armazenados neste vetor que 
			são inferiores a 15
			
			B) a quantidade de elementos armazenados no vetor que são iguais a 15
			
			C) a média dos elementos armazenados no vetor que são superiores a 15
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int [] num = new int [10];
		int i=0,qtdigual15=0,qtdmaior15=0,somamenor15=0,somamaior15=0;
		double mediamaior15=0;
		
		try {
			System.out.println("Digite 10 números inteiros e saiba:\nA)a soma de elementos armazenados neste vetor que são inferiores a 15\nB)a quantidade de elementos armazenados no vetor que são iguais a 15\nC)a média dos elementos armazenados no vetor que são superiores a 15");
			for (i=0; i<num.length;i++) {
				
				System.out.println("Digite o número "+(i+1));
				num[i] = scan.nextInt();
								
				if (num[i]<15) {
					somamenor15+=num[i];
				}else if(num[i]==15) {
					qtdigual15+=1;
				}else if (num[i]>15) {
					somamaior15+=num[i];
					qtdmaior15+=1;
				}
			}
			
			mediamaior15 = somamaior15 / qtdmaior15;
			
			System.out.println("A soma de elementos armazenados neste vetor que são inferiores a 15 é "+somamenor15);
			System.out.println("A quantidade de elementos armazenados no vetor que são iguais a 15 é "+qtdigual15);
			System.out.println("A média dos elementos armazenados no vetor que são superiores a 15 é "+mediamaior15);
		}catch(InputMismatchException e ) {
			System.out.println("Digite apenas números sem vírgula!");
			main(args);
		}		

	}

}
