package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		//faca um programa que peça o raio de um 
		//círculo, calcule e mostre sua área
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o raio de um círculo:");
		
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);		
		System.out.println("A area do círculo é: "+area+ " m²");
		

	}

}
