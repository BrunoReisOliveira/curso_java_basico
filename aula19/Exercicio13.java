package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		/*criar um vetor A com 10 elementos inteiros
		implementar um programa que determine a soma dos 
		elementos armazenados neste vetor que
		são múltiplos de 5
		
		info:Para verificar se um número é múltiplo de outro, basta encontrar um número inteiro 
		de modo que a multiplicação entre eles resulte no primeiro número.
		
		55 é divisível por 5 pois 55:5 = 11 e o resto é 0
		
		a) 35 é múltiplo de 7, pois 35 é igual a 7 multiplicado pelo número inteiro 5.
		
		b) 63 é múltiplo de 21, pois 63 é igual a 21 multiplicado pelo número inteiro 3.
		
		c) 22 não é múltiplo de 3, pois não existe número inteiro que, multiplicado por 3, 
		resulte em 22.*/
		
		Scanner scan = new Scanner (System.in);
		
		int [] num = new int [10];
		int i=0,restodiv=0,soma=0;
		
			System.out.println("Digite 10 números e saiba a soma dos múltiplos de 5:");
				for (i=0; i<num.length;i++) {
					try {
						
						System.out.println("Digite o número "+(i+1));
						num[i]= scan.nextInt();							
						
					}catch(InputMismatchException e ) {
						System.out.println("Digite apenas números sem vírgula!");
						main(args);
					}			
				
				}
				
				for (i=0;i<num.length;i++) {
					
					restodiv = num[i]%5;
					if (restodiv==0) {
						System.out.println("O número "+num[i]+" é divisível por 5");
						soma +=num[i];
					}
				}
				
				System.out.println("A soma dos números divisíveis por 5 é "+soma);
		
	}

}
