package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		/*	criar um vetor A com 10 elementos inteiros
			implementar um programa que defina e escreva a média
			aritmética simples dos elementos
			ímpares armazenados neste vetor
		 */		
		Scanner scan = new Scanner (System.in);
		int [] num = new int [10];
		int i=0, restodiv=0,count=0,num2=0;
		double media=0,soma=0;
		
		try {
			System.out.println("Digite 10 números inteiros e saiba a média aritmética dos valores ímpares");
		for (i =0; i<num.length; i++) {
			
			System.out.println("Digite o número "+(i+1));
			num [i] = scan.nextInt();
			}
		
		for (i=0;i<num.length;i++) {
			restodiv = num[i] %2;
			if (restodiv !=0) {
				soma +=num[i];
				count +=1;				
				System.out.println("Número ímpar: "+num[i]);
			}
		}
		media = soma / count;		
		System.out.println("Média aritmérica dos números ímpares:"+media);			
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas número sem vírgula!");
			main (args);
		}

	}

}
