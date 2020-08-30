package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio36 {

		public static void main(String[] args) {
			/*sendo H= 1 +1/2 +1/3 + 1/4 ... 1/n, faça um programa
			que calcule o valor de H com N termos*/
			
			Scanner scan = new Scanner (System.in);
			int n=0;
			double soma=0,i=0;
			try {		
				
				System.out.println("Digite o valor de n:");
				n=scan.nextInt();
				
				for (i=1; i<=n;i++) {
					
					soma +=1/i;					
				}
				
				System.out.println("O valor total da soma é "+soma);
			}catch (InputMismatchException e ) {
					System.out.println("Digite apenas números sem vírgula!");
			}

}


}





