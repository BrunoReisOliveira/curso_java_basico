package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		/*faça um programa que peça uma nota,
		 * entre 0 e 10. Mostre uma mensagem caso
		 * o valor seja inválido e continue pedindo
		 * até que o usuário informe um valor válido
		 */
		Scanner scan = new Scanner (System.in);

		double nota=0;
		
		try {
			
			do {
				
				System.out.println("Digite uma nota entre 0 e 10: ");
				nota=scan.nextDouble();
				
				if(nota <0 || nota >10) {
					System.out.println("Valor válido");
				}
				
			}while (nota <0 || nota >10); 			
			
			System.out.println("Você digitou a nota: "+nota);
			
			
		}catch (InputMismatchException e){
			System.out.println("Valor inválido!");
			main (args);
		
		
		
}

}
}
		
	

	


