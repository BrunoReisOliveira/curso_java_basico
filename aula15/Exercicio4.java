package com.bruno.cursojava.aula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * faça um programa que verifique se 
		 * uma letra digitada é vogal ou consoante
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra");		
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") ||
				letra.equalsIgnoreCase("I")	|| letra.equalsIgnoreCase("O") ||
				letra.equalsIgnoreCase("U")) {
		
		System.out.println(letra+" é uma vogal");	
		
		}else if (letra.equalsIgnoreCase("Q")||letra.equalsIgnoreCase("Z")||
				letra.equalsIgnoreCase("W")||letra.equalsIgnoreCase("S")||
				letra.equalsIgnoreCase("X")||letra.equalsIgnoreCase("D")||
				letra.equalsIgnoreCase("C")||letra.equalsIgnoreCase("R")||
				letra.equalsIgnoreCase("F")||letra.equalsIgnoreCase("V")||
				letra.equalsIgnoreCase("T")||letra.equalsIgnoreCase("G")||
				letra.equalsIgnoreCase("B")||letra.equalsIgnoreCase("Y")||
				letra.equalsIgnoreCase("H")||letra.equalsIgnoreCase("N")||
				letra.equalsIgnoreCase("J")||letra.equalsIgnoreCase("M")||
				letra.equalsIgnoreCase("K")||letra.equalsIgnoreCase("L")||
				letra.equalsIgnoreCase("P")||letra.equalsIgnoreCase("Ç"))
																	{
			
			System.out.println(letra+" é uma consoante");		
	}	else {
			System.out.println("Valor inválido para "+letra+"!");
	}
	
}
	
	
}




