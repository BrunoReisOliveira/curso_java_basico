package com.bruno.cursojava.aula33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer01_lampada_use {
	
	static String retornoMostrarStatus;
	static String retornoLigarLampada;
	static String retornoDesligarLampada;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exer01_lampada status = new Exer01_lampada();
		int escolha = 0;
		String resp = "";
		
		status.setModelo("lampo");
		status.setMarca("Lampadeco");
		System.out.println("Marca: "+status.getMarca());
		System.out.println("Modelo: "+status.getModelo());		

		retornoMostrarStatus=status.mostrarStatus();
		System.out.println(retornoMostrarStatus);
		
		try {
			System.out.println("1-ligar\n2-desligar\n3-sair");
			escolha = scan.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Utilize apenas números!");
			main(args);
		}		
		
		switch (escolha) {
		
		case 1:
			
			retornoLigarLampada = status.ligarLampada();
			System.out.println(retornoLigarLampada);
			
			System.out.println("Deseja desligar a lâmpada?");
			resp = scan.next();
			
			if (resp.equalsIgnoreCase("S")||resp.equalsIgnoreCase("SIM")) {
				retornoDesligarLampada = status.desligarLampada();
				System.out.println(retornoDesligarLampada);
			}
			
			break;
		case 2:
			retornoDesligarLampada = status.desligarLampada();
			System.out.println(retornoDesligarLampada);
			
			System.out.println("Deseja ligar a lâmpada?");
			resp = scan.next();
			
			if (resp.equalsIgnoreCase("S")||resp.equalsIgnoreCase("SIM")) {
				retornoLigarLampada = status.ligarLampada();
				System.out.println(retornoLigarLampada);
			}
			break;
		case 3:
			break;
		default: System.out.println("Opção inválida!");
		main (args);
		
		}		

	}
	
}


