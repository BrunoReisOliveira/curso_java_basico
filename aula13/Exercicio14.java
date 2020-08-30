package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio14 {

	
	public static void main(String[] args) {
		/* faça um programa que peça o tamanho de um arquivo
		para download (em MB) e a velocidade da um link
		de internet (em Mbps), calcule e informe o tempo
		aproximado de download do arquivo usando este link
		(em minutos)*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o tamanho do arquivo para download em (MB) e a velocidade de sua internet em (MB)");
		double arquivo = scan.nextDouble();
		double internet = scan.nextDouble();
		int basebyte = 1024;		
		//valida o tamanho do arquivo em kb
		double arquivomb = arquivo * basebyte;
		//calcula a taxa de transmissão por segundo do link
		double transinternt = (internet * basebyte)/8;
		
		double segdown = arquivomb / transinternt;
		double minudown = segdown /60;
		
		System.out.println("O tamanho do arquivo em (MB) é "+arquivo+" MB");
		System.out.println("A velocidade em (MB) da internet é "+ internet+" MB");
		System.out.println("A taxa de transmissão é "+transinternt + " Kbps");
		System.out.println("O tempo médio para dowloand é "+minudown );
		
	}

}
