package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		// faça um programa que peça 2 números inteiros
		//e um número real
		//calcule e mostre
		//a. o produto do dobro do primeiro com a metade
		//do segundo
		//b. a soma do triplo do primeiro com o terceiro
		//c. o terceiro elevado ao cubo
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite 2 números inteiros e um número real");
		int n1 = scan.nextInt();
		int n2 =scan.nextInt();
		double nr = scan.nextDouble();
		int dobron1 = n1*2;
		int metaden2 = n2/2;
		int produto = (dobron1*metaden2);
		int triplon1=n1*3;
		double soma = (triplon1+nr);
		double elevacao =Math.pow(nr, 3);
		
		System.out.println("Você digitou:"+n1+" "+n2+" " +nr);
		
		System.out.println("O dobro de "+n1+" é "+ dobron1+"."+"A metade de "+n2+" é "+metaden2+"."+"O número "+dobron1 +" x "+metaden2+" é "+produto);
		
		System.out.println("O triplo de "+n1+ " é "+triplon1+"."+"O número "+triplon1+" + "+nr+" é "+soma);
		
		System.out.println("O número "+ nr+" elevado ao cubo é "+elevacao);		
		
		
		
		

	}

}
