 package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		//faça um programa que peça dois números
		//e imprima o maior deles.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite dois números");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		if (n1 > n2){
			
			System.out.println(n1+" é maior que"+" "+n2);
		
		} else if (n1< n2) {
			System.out.println(n2+" é maior que"+" "+n1);
		}else {
			
			System.out.println("Os números digitados são iguais ou inválidos");
		}
		

	}

}
