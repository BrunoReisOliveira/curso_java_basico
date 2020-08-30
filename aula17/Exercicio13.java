package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 *FAÇA UM PROGRAMA QUE PEÇA DOIS NÚMEROS,
		  BASE E EXPOENTE, CALCULE E MOSTRE O PRIMEIRO
		  NÚMERO ELEVADO AO SEGUNDO NÚMERO. NÃO UTILIZE 
		  A FUNÇÃO DE POTENCIA DA LINGUAGEM 
		 * 
		 */
		double result1=1,exponega=0,expo2=0; 
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite a base:");
		double base = scan.nextDouble();
		
		System.out.println("Digite o expoente:");
		double expo = scan.nextDouble();	
		expo2 = expo;
		
		if(expo <0) {
			exponega = expo;
			expo =-1*(expo);
		
			while (expo != 0) {

				result1 = base * result1;
				expo--;
			}
			System.out.print("O número "+base+" elevado por " +expo2+" é igual a:"+1/result1);
			
		}else {
			while (expo!=0) {
				
				result1 = base*result1;
				expo--;	
			}
			System.out.print("O número "+ base+" elevado por " +expo2+" é igual a:"+result1);
			
		}
		
		

	}

}

