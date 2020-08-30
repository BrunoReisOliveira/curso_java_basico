package com.bruno.cursojava.aula20;

import java.util.Random;
public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Gere e imprima uma matriz M 10x10 com valores aleatórios
			entre 0-9.Após isso, indique qual é o maior e o menor valor da linha 5 
			e qual é o maior e o menor valor da coluna 7.
		 */
		int [][] numerosAleatorios = new int [10][10];
		int i=0,j=0,maiorlinha5= Integer.MIN_VALUE,menorlinha5= Integer.MAX_VALUE,
				maiorcoluna7= Integer.MIN_VALUE,menorcoluna7=Integer.MAX_VALUE;
		Random geradorNum = new Random();
		
		for (i=0;i<numerosAleatorios.length;i++) {
			for (j=0;j<numerosAleatorios.length;j++) {
				numerosAleatorios[i][j] = geradorNum.nextInt(100);
			}
		}
		
		for (i=0;i<numerosAleatorios.length;i++) {
			for (j=0;j<numerosAleatorios.length;j++) {
				System.out.print(numerosAleatorios[i][j]+" ");
			}
				System.out.println();			
		}
		
			for (i=0;i<numerosAleatorios[5].length;i++) {
								
				if (numerosAleatorios[5][i]>maiorlinha5) {
					maiorlinha5 = numerosAleatorios[5][i];
				}
				
				if (numerosAleatorios[5][i]<menorlinha5) {
					menorlinha5 = numerosAleatorios[5][i];				
				}
			}
			
				for (i=0;i<numerosAleatorios.length;i++) {
						
					if (numerosAleatorios[i][7]>maiorcoluna7) {
						maiorcoluna7 = numerosAleatorios[i][7];
					}
					if (numerosAleatorios[i][7]<menorcoluna7) {
						menorcoluna7 = numerosAleatorios[i][7];										
					}
			}

			System.out.println("Maior número linha 5: "+maiorlinha5);
			System.out.println("Menor número linha 5: "+menorlinha5);
			System.out.println("Maior número coluna 7: "+maiorcoluna7);
			System.out.println("Menor número coluna 7: "+menorcoluna7);
	}

}
