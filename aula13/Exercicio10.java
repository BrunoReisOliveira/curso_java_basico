package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
	// faça um programa que peça a temperatura
	//em graus Celsius, transforme e mostre em graus 
	//Farenheit

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Didgite a temperatura em graus Celsius");
		double celsius = scan.nextDouble();
		double fahrenheit = ((celsius*9)/5)+32;
		
		System.out.println(celsius+" grau Celsius é equivalente a:"+fahrenheit+" grau Fahrenheit");
		
		
	}

}
