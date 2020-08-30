package com.bruno.cursojava.aula13;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//faça um programa que peça 4 notas
		//bimestrais e mostre a média
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 4 notas bimestais:");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double n4 = scan.nextDouble();
		double media = (n1+n2+n3+n4)/4;
		
		System.out.println("A média da nota é:"+" "+media);
		

	}

}
