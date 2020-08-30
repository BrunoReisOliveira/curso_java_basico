package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * faça um programa que peça um número inteiro e determine
			se ele é ou não primo.Um número primo é aquele que é divisível por ele mesmo
			e por 1
		 */
		Scanner scan = new Scanner (System.in);
		
		//mod=2 pois qualquer número divido por 1 o resultado será ele mesmo
		int i=0,num=0,restdiv=0,mod=2,countnprimo=0;
			
		try {
			System.out.println("Digite um número inteiro e saiba se ele é primo:");
			num=scan.nextInt();
			
			for(i=1; i<=num; i++) {
							
				restdiv = num%mod;//percorre de 1 até o valor de num aplicando mod da divisão a partir de 2
								
				if (num==mod && restdiv==0	&& countnprimo==0 )	 {
					/*se num == mod (percorremos de 1 até o valor de num e não achamos outro valor que 
					 * o resto da divisão fosse zero além da divisão feita pelo próprio valor de num
					 * se restdiv==0 achamos um valor que após dividir, o resto será zero (neste caso o próprio valor de num)
					 * se countnprimo== 0 não achamos nenhum outro valor que divido pelo valor de num tivesse zero como resultado
					 */
				
					System.out.println("O número "+ num+" é primo!");
				
			}else if (restdiv==0) {
					//mostra a partir de 2 todos os números divisíveis pelo valor de num
					System.out.println("O número "+num+" é divisível por "+mod+". Portanto não é primo!");					
					countnprimo+=1;//se achar, soma mais 1							
			}				
				mod=mod+1;
}	
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números sem vírgula!");
}

}
}

