package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		/*
		 * faça um programa que calcule e mostre a média
		   aritmética de n notas 
		 */
		String resp="";
		Scanner scan = new Scanner(System.in);
		
		double nota=0,media=0;
		int numnota=0;	
		try {
			
			do {
				
				System.out.println("Digite as notas e saiba a média aritmética:");
				nota += scan.nextDouble();
				numnota+=1;
				media = nota/numnota;
				
				System.out.println("Deseja digitar outra nota?");
				resp= scan.next();
				
			}while (resp.equalsIgnoreCase("S")||resp.equalsIgnoreCase("SIM"));
			
			
			System.out.println("A média da nota é: "+media);
			
		}catch (InputMismatchException e ) {
			System.out.println("Valor inválido!");
			main (args);
		}		 

	}

}
