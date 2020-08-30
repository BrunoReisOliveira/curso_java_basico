package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio33 {

	public static void main(String[] args) {
		/* Criar um vetor A com 10 elementos inteiros. 
		 * Escreva um programa
			que imprima cada elemento do vetor A e uma mensagem 
			indicanto se o respectivo elemento é um número 
			primo ou não
		 */		
		int [] num = new int [10];
		int i=0,j=1,restdiv=0,numtemp=0,countprimo=0;	
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite 10 números e saiba se é primo ou não");
		
		try {
			
			for (i=0;i<num.length;i++) {
				System.out.println("Digite o número "+ (i+1));
				num[i] = scan.nextInt();
				if(num[i]<2) {
					System.out.println("Digite um valor maior que 2. Os números 0 e 1 não são primos!");
					main(args);
				}
			}			
		
			for (i=0; i<num.length;i++) {
				j=1;
				countprimo=0;
				numtemp = num[i];
				
				for(j=1;j<=numtemp;j++) {
					restdiv = numtemp %j;
					
					if( restdiv ==0) {
						countprimo+=1;
					}				
					
				}
				
				if(countprimo==2) {
					System.out.println("O número "+numtemp+" é primo!");
				}else {
					System.out.println("O número "+numtemp+" não é primo!");
				}				
			}					
						
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros!");
			main(args);
		}
	}

}
