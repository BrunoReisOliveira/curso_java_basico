package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		/*supondo que a população de um 
		 * país A seja da ordem de 80000
		 * habitantes com uma taxa anual de crecimento
		 * de 3% e que a população de B seja 200000
		 * habitantes com uma taxa de crescimento
		 * de 1,5%. Faça um programa que calcule
		 * e escreva o número de anos necessários
		 * para que a população do país A ultrapasse
		 * ou iguale a população do país B, mantidas
		 * as taxas de crescimento
		 */
		//-------------------------------------
		/*altere o programa anterior permitindo ao usuário
		 *  informar as populações e as taxas de crescimento
		 *  iniciais. Valide a entrada e permita repetir
		 *  a operação
		 */
		Scanner scan = new Scanner (System.in);			
			
		double paisa=0,paisb=0,taxaA=0,taxaB=0;		
			
		boolean valido =false;
		int ano=0;
			
		do {				
				
			System.out.println("Digite a população A:");
			paisa = scan.nextDouble();
				
				if (paisa >0) {
					valido =true;
					
			}else {
					System.out.println("População A deve ter um valor acima de zero!");
				}
								
			}while (!valido);
			
			
			valido =false;
			
			do {				
				
				System.out.println("Digite a população B:");
				paisb = scan.nextDouble();
				
				if (paisb >0) {
					valido =true;
					
				}else {
					System.out.println("População B deve ter um valor acima de zero!");
				}
								
			}while (!valido);
			
			
			valido =false;
			
			do {				
				
				System.out.println("Digite a taxa de crescimento da população A:");
				taxaA = scan.nextDouble();
				
				if (taxaA >0) {
					valido =true;
					
				}else {
					System.out.println("A taxa de crescimento da população A deve ser acima de zero!");
				}
								
			}while (!valido);
			
			valido =false;
			
			do {				
				
				System.out.println("Digite a taxa de crescimento da população B:");
				taxaB = scan.nextDouble();
				
				if (taxaB>0) {
					valido =true;
					
				}else {
					System.out.println("A taxa de crescimento da população B deve ser acima de zero!");
				}
								
			}while (!valido);			
			
			
			do {			
				
				paisa += (paisa/100)*taxaA;
				paisb += (paisb /100)*taxaB;
				ano++;
				
			}while (paisa< paisb);
			
			System.out.println("População A: "+ paisa);
			System.out.println("População B: "+ paisb);
			System.out.println("Serão necessário "+ano+" ano (s) para que o país A ultrapasse ou iguale o país B");
				
			
	}
}
	
			