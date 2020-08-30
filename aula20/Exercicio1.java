package com.bruno.cursojava.aula20;

import java.util.Random;
public class Exercicio1 {

	public static void main(String[] args) {
		/*Gere e imprima uma matriz M 4x4 com valores aleatórios
			entre 0-9. Após isso, determine o maior número da matriz e sua 
			posição (linha, coluna).
		 */		
		int [][] numerosAleatorios = new int [4][4];		
		int i=0,j=0,maiornum = Integer.MIN_VALUE,linha=0,coluna=0;
		Random gerador = new Random();
		
		for (i=0;i<numerosAleatorios.length;i++) {
			for (j=0;j<numerosAleatorios.length;j++) {
				numerosAleatorios[i][j]=gerador.nextInt(100);
				
				if (numerosAleatorios[i][j]>maiornum) {
					maiornum = numerosAleatorios[i][j];
					linha =i;
					coluna =j;
				}
			}
		}
		
			for (i=0;i<numerosAleatorios.length;i++) {
			for (j=0;j<numerosAleatorios.length;j++) {
				System.out.print(numerosAleatorios[i][j]+" ");
			}
			System.out.println();
		}		
		System.out.println("Maior número:"+maiornum);
		System.out.println("Linha:"+linha);
		System.out.println("Coluna:"+coluna);
	}

}
