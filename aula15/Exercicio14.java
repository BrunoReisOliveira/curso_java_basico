package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		/*faça um programa que lê duas notas
		 *parciais obtidas por um aluno
		 *numa disciplina ao longo de um semestre,
		 *e calcule a sua média.
		 *A atribuição de conceitos obedece à 
		 *tabela abaixo:
		 *Média de Aproveitamento Conceito
		 *Entre 9.0 e 10			A
		 *Entre 7.5 e 9.0			B
		 *Entre 6.0 e 7.5			C
		 *Entre 4.0 e 6.0			D
		 *Entre 4.0 e 0				E
		 *O algoritmo deve mostrar na tela as notas
		 *médias, o conceito correspondente e a
		 *mensgem "Aprovado" se o conceito for
		 *A,B ou C "Reprovado" se o conceito for D ou E
		 *
		 *
		 */
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite duas notas:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double media = (n1+n2)/2;
		
		if (media >=9 && media<=10) {
			
			System.out.println("Notas:"+n1+" e "+n2+".");
			System.out.println("Média:"+media+".");
			System.out.println("Conceito:A.");
			System.out.println("Aprovado!");
		}
		if (media >=7.5 && media<9) {
			
			System.out.println("Notas:"+n1+" e "+n2+".");
			System.out.println("Média:"+media+".");
			System.out.println("Conceito:B.");
			System.out.println("Aprovado!");
		}
		if (media >=6 && media<7.5) {
		
			System.out.println("Notas:"+n1+" e "+n2+".");
			System.out.println("Média:"+media+".");
			System.out.println("Conceito:C.");
			System.out.println("Aprovado!");
		}
		if (media >=4 && media<6) {
		
			System.out.println("Notas:"+n1+" e "+n2+".");
			System.out.println("Média:"+media+".");
			System.out.println("Conceito:D.");
			System.out.println("Reprovado!");
		}
	
		if (media >=0 && media<4) {
		
			System.out.println("Notas:"+n1+" e "+n2+".");
			System.out.println("Média:"+media+".");
			System.out.println("Conceito:E.");
			System.out.println("Reprovado!");
	}	
		

	}

}
