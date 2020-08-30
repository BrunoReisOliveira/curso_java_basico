package com.bruno.cursojava.aula13;

import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		//faça um programa que calcule a área de um quadrado
		//em seguida mostre o dobro desta área para o usuário
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado");
		
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		double dobroarea = area *2;
		
		System.out.println("A área de um quadrado com tamanho de lado igual a "+lado+" cm é: "+area+" cm². O dobro da área é: "+dobroarea+" cm²" );
		
		
			
		

	}

}
