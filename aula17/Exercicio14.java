package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * faça um programa que peça 10 números inteiros,
		 * calcule e mostre a quantidade de números pares
		 * e a quantidade de números impares
		 */
		Scanner scan = new Scanner (System.in);
		int i=1,restodiv=0,num,numpar=0,numimpar=0;
		
		try {			
			while (i<=10) {
				
				System.out.println("Digite o número "+i+ " inteiro:");
				num = scan.nextInt();
				restodiv=num % 2;
				if (restodiv ==0) {
					numpar=numpar+1;
				}else {
					numimpar=numimpar+1;
				}
				i++;
			}			
			System.out.println("Você digitou "+numpar+" número (s) par (es) e "+numimpar+" número (s) ímpar (es)");	
			
		}catch(java.util.InputMismatchException e ) {
			System.out.println("Digite apenas números inteiros!");
			main (args);
		}
	}
}
