package com.bruno.cursojava.aula17;

import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		/*faça um programa que leia e valide
		 * as seguintes informações:
		 * NOME: maior que três caracteres;
		 * IDADE:entre 0 e 150;
		 * SALÁRIO: maior que zero;
		 * SEXO: 'f' ou 'm';
		 * ESTADO CIVIL:'s','c','v','d':
		 */		
		Scanner scan = new Scanner (System.in);
		String nome="";
		double idade=0;
		double salario=0;
		String sexo="";
		String estadocivil="";
		boolean oksexo=false, okestadocivil=false;
		
			do {
				System.out.println("Digite um nome: ");
				nome = scan.nextLine();
				
				if (nome.length()<3) {
					System.out.println("Digite um nome com no mínimo 4 caracteres!");
				}
				
			}while (nome.length()<3);
				System.out.println("Você digitou o nome: "+nome);
			
			do {
				
				System.out.println("Digite uma idade entre 0 e 150");
				idade =scan.nextDouble();
				
				if (idade <0 || idade >150) {
					System.out.println("Digite uma idade válida!");
					
				}
			}while (idade <0 || idade>150);
			
		System.out.println("Você digitou a idade "+ idade);
		
		
			do {
				System.out.println("Digite um salário diferente de zero");
				salario = scan.nextDouble();
				
				if (salario <=0) {
					System.out.println("Digite um salário válido!");
				}
				
			}while (salario <=0);
		
			System.out.println("Você digitou o salário "+salario);
			
			do {
				
				System.out.println("Digite 'f' ou 'm' para o sexo");
				sexo = scan.next();				
				
				if(sexo.equalsIgnoreCase("F")||sexo.equalsIgnoreCase("M")) {
					oksexo = true;		
					
				}else System.out.println("Sexo inválido!");
				
			}while (oksexo !=true); 
				System.out.println("Você digitou o sexo "+sexo);
				
				//ESTADO CIVIL:'s','c','v','d':
				do {
					System.out.println("Escolha o estado civil:'s','c','v','d'");
					estadocivil = scan.next();
					
					if(estadocivil.equalsIgnoreCase("S")||estadocivil.equalsIgnoreCase("C")||
						estadocivil.equalsIgnoreCase("V")||estadocivil.equalsIgnoreCase("D")) {
						okestadocivil =true;
						
					}else System.out.println("Estado civil inválido!");
					
				}while (okestadocivil!=true);	
				
				System.out.println("Seu nome é "+nome);
				System.out.println("Sua idade é "+idade);
				System.out.println("Seu salário é "+salario);
				System.out.println("Seu sexo é "+sexo);
				System.out.println("Seu estado civil é "+estadocivil);				
				
}		
}
	
		

