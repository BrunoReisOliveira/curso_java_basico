package com.bruno.cursojava.aula20;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		/* Capture do teclado valores para preenchimento de uma
			matriz M 3x3. Após a captura, imprima a matriz criada 
			e encontre a quantidade de números pares e ímpares.
		 */
		Scanner scan = new Scanner (System.in);
		int [][] numeros = new int [3][3];
		int i=0,j=0,countp=0,counti=0,num=1;
		
		try {
			
			for (i=0;i<numeros.length;i++) {
				for (j=0;j<numeros.length;j++) {
					System.out.println("Digite o número "+num);
					numeros[i][j]=scan.nextInt();
					
					if (numeros[i][j]%2==0) {
						countp++;
					}else {
						counti++;
					}
					num++;
				}
			}
			
			for (i=0;i<numeros.length;i++) {
				for (j=0;j<numeros.length;j++) {
					System.out.print(numeros[i][j]+" ");
				}
			}	System.out.println();
			
			System.out.println("Quantidade de números pares "+countp);
			System.out.println("Quantidade de números ímpares "+counti);
			
			
		}catch(InputMismatchException e ) {
			System.out.println("Digite apenas números!");
			main(args);
		}
		


	}

}
