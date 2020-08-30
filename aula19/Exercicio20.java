package com.bruno.cursojava.aula19;

import java.text.Format;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.IOP.CodecPackage.FormatMismatch;
public class Exercicio20 {

	public static void main(String[] args) {
		/*
		 * Implementar um programa que obtenha a cotação do dólar 
		 * (U$) em 
			relação ao real (R$) e a seguir, armazene em 
			vetor A com 20 elementos
			as seguintes conversões:
			A[i] = cotação do dolar *i, 
			para todo i variando de 1 até 20
		 */		
		Scanner scan = new Scanner (System.in);
		double [] dolar = new double [20];
		double cotacao=0;
		int i=0;
		
		try {
			
			System.out.println("Digite a cotação do dólar");
			cotacao = scan.nextDouble();
			
			for (i=0;i<dolar.length;i++) {
				dolar [i]=cotacao *(i+1);
			}
			
			for (i=0;i<dolar.length;i++) {
				System.out.println("Cotação de "+i+" dólar americano = "+NumberFormat.getCurrencyInstance().format(dolar[i]));
			}			
			
		}catch( InputMismatchException e) {
			System.out.println("Digite apenas números!");
			main(args);
		}
	}

}
