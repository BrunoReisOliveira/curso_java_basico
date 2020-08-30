package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		/*faça um programa que peça os 3 lados de
		 * um triângulo. O programa
		 * deverá informar se os valores podem ser
		 * um triângulo. Indique, caso os lados
		 * formem um triângulo, se o mesmo é: equilátero
		 * isósceles ou escaleno.
		 * Dicas:
		 * Três lados formam um triângulo quando
		 * a soma de quaisquer dois lados for maior
		 * que o terceiro;
		 * Triângulo Equilátero: três lados iguais;
		 * Triângulo Isósceles: quaisquer dois lados iguais;
		 * Triângulo Escaleno: três lados diferentes;
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite três lados de um triângulo:");
			
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		
		if ((lado1+ lado2)> lado3 ||
			((lado1 + lado3)>lado2)||
			((lado2 + lado3)>lado1)) {
			
			if(lado1 == lado2 && lado2 == lado3&& lado3 == lado1) {
				System.out.println ("Triângulo Equilátero!");		
												
				}			
			else if (lado1 == lado2 ||lado2 == lado3|| lado3 == lado1) {
				System.out.println ("Triângulo Isósceles!");
				
			}	
			else if (lado1 !=lado2 && lado2!=lado3 && lado3 !=lado1) {
				System.out.println ("Triângulo Escaleno!");
			}
			
			}else System.out.println("Os valores digitados não formam um triângulo!");
		
		
			
		}	
	

	}


