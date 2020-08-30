package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		// faça um programa que converta metros
		//para centímetros
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de metros:");
		
		double metro = scan.nextDouble();
		double centimetro = metro * 100;
		
		System.out.println (metro +" metro (s) é equivalente a "+ centimetro + " centímetro (s)");
		

	}

}
