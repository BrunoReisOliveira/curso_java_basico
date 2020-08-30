package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		//faça um programa que peça a temperatura em 
		//graus Farenheit, transforme e mostre a 
		//temperatura em graus Celsius
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit");
		double farenheit = scan.nextDouble();
		double celsius = ((farenheit-32)*5)/9;
		
		System.out.println(farenheit+ " grau Fahrenheit"+" é equivalente a:"+celsius+" grau Celsius");
		
		

	}

}
