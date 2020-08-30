package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio29 {

	public static void main(String[] args) {
		/*Encontrar números primos é uma tarefa difícil. Faça um programa 
		que gera uma lista dos números primos existentes entre 1 e um número 
		inteiro informado pelo usuário*/
		
		Scanner scan = new Scanner (System.in);
		int i=0,num=0,CurrentValue=0,j=1,count=0;
		double restoDiv=0;
		ArrayList<Integer>lista = new ArrayList<>();
		
		try { 
			System.out.println("Digite um número inteiro e saiba  o intervalo de números primos até ele:");
			num = scan.nextInt();
			
				if (num <1) {
				System.out.println("Digite um valor maior que "+num);
				main(args);				
				
			}			
				do {
					
					lista.add(num);
					num--;
					
				}while (num>=2);
				
							
				for (i=0; i<lista.size(); i++) {
					
					CurrentValue = lista.get(i);
					
					for (j=1; j<=CurrentValue; j++) {

						restoDiv = CurrentValue %j;

						if (restoDiv==0) {						
							
						System.out.println("O número "+CurrentValue+" é divisível por "+j);						
					}
						
		}						
}		
				
			
			}catch(InputMismatchException e) { 
				
			System.out.println("Digite apenas números sem vírgula!");
			main (args);
}
		
}
	
}



		
		




