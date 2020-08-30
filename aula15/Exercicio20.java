package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio20 {

	public static void main(String[] args) {
		/*faça um programa que pergunte
		 * 5 questões para uma pessoa
		 * referente a um crime.
		 * As perguntas são:
		 * Telefonou para a vítima?
		 * Esteve no local do crime?
		 * Mora perto da vítima?
		 * Devia para a vítima?
		 * Já trabalhou com a vítima?
		 * O programa deve no final emitir uma
		 * classificação sobre a participação da pessoa
		 * no crime.
		 * Se a pessoa responder positivamente a 2 questões
		 * ela deve ser classificada como "Suspeita", 
		 * entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
		 * Caso contrário, ele será classificado como "Inocente".
		 *
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Responda as questões referente ao crime. Telefonou para a vítima?");
		String resp1 = scan.next();
		int contaresp =0;		
		
		if (resp1.equalsIgnoreCase("S")||resp1.equalsIgnoreCase("SIM")) {
			contaresp = contaresp+1;
								
		}else if (resp1.equalsIgnoreCase("N")|| resp1.equalsIgnoreCase("NÃO")){
			contaresp =contaresp;
				
		}else {
			System.out.println("Digite os formatos de respostas:Sim,SIM,S,s,Não,NÃO,N ou n");
			return;		}
				
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();
		if (resp2.equalsIgnoreCase("S")||resp2.equalsIgnoreCase("SIM")) {
			contaresp = contaresp+1;
								
		}else if (resp2.equalsIgnoreCase("N")|| resp2.equalsIgnoreCase("NÃO")){
			contaresp = contaresp;				
		}		
		else {			
			System.out.println("Digite os formatos de respostas:Sim,SIM,S,s,Não,NÃO,N ou n");
			return;
		}
		
		System.out.println("Mora perto da vítima?");
		String resp3 = scan.next();
		if (resp3.equalsIgnoreCase("S")||resp3.equalsIgnoreCase("SIM")) {
			contaresp = contaresp+1;
								
		}else if (resp3.equalsIgnoreCase("N")|| resp3.equalsIgnoreCase("NÃO")){
			contaresp = contaresp;
				
		}		
		else {			
			System.out.println("Digite os formatos de respostas:Sim,SIM,S,s,Não,NÃO,N ou n");
			return;
		}
		
		System.out.println("Devia para a vítima?");
		String resp4 = scan.next();
		if (resp4.equalsIgnoreCase("S")||resp4.equalsIgnoreCase("SIM")) {
			contaresp = contaresp+1;
								
		}else if (resp4.equalsIgnoreCase("N")|| resp4.equalsIgnoreCase("NÃO")){
			contaresp = contaresp;
				
		}		
		else {			
			System.out.println("Digite os formatos de respostas:Sim,SIM,S,s,Não,NÃO,N ou n");
			return;
		}
		
		System.out.println("Já trabalhou com a vítima?");
		String resp5 = scan.next();
		if (resp5.equalsIgnoreCase("S")||resp5.equalsIgnoreCase("SIM")) {
			contaresp = contaresp+1;
						
		}else if (resp5.equalsIgnoreCase("N")|| resp5.equalsIgnoreCase("NÃO")){
			contaresp = contaresp;				
		}		
		else {			
			System.out.println("Digite os formatos de respostas:Sim,SIM,S,s,Não,NÃO,N ou n");
			return;
		}
		
		if (contaresp ==0 || contaresp ==1) {
			System.out.println("Você é inocente!");
		}else if (contaresp==2){
			System.out.println("Você é suspeito!");
		}else if (contaresp >2 && contaresp<=4) {
			System.out.println("Você é cúmplice!");
		}else {
			System.out.println("Você é assassino!");
		}
				
		}
		
	}


