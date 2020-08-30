package com.bruno.cursojava.aula15;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		/*faça um programa que leia
		 * 2 números e em seguida pergunte
		 * ao usuário qual operação ele 
		 * deseja realizar. O resultado da 
		 * operação deve ser acompanhado
		 * de uma frase que diga se o
		 * número é:
		 * -par ou ímpar;
		 * -positivo ou negativo;
		 *  
		 */
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Digite dois números");
	double n1 = scan.nextDouble();
	double n2 = scan.nextDouble();
	double result =0;	
		
	try {
		System.out.println("Escolha:1-Soma,2-Subtração,3-Multiplicação e 4-Divisão");
		int escolha = scan.nextInt();
		if (escolha >4 || escolha<1) {
			System.out.println("Escolha incorreta!");
			return;
		}
		switch(escolha) {
		
		case 1:
			result = n1 + n2;
			double restodiv = result %2;
			System.out.println("A soma de "+n1+" + "+n2+" é igual a "+result+".");
			if (restodiv==0) {
				System.out.println("O número "+result+" é par.");	
			}else if (restodiv !=0) {
				System.out.println("O número "+result+" é ímpar.");	
			}if (result >0) {
				System.out.println("O número "+result+" é positivo.");	
			}else if (result<0) {
				System.out.println("O número "+result+" é negativo.");
			}		
		break;
		case 2:
			result = n1 - n2;
			double restodiv2 = result %2;
			System.out.println("A subtração de "+n1+" - "+n2+" é igual a "+result+".");
			if (restodiv2==0) {
				System.out.println("O número "+result+" é par.");	
			}else if (restodiv2 !=0) {
				System.out.println("O número "+result+" é ímpar.");	
			}if (result >0) {
				System.out.println("O número "+result+" é positivo.");	
			}else if (result<0) {
				System.out.println("O número "+result+" é negativo.");	
			}
		break;
		case 3:
			result = n1 * n2;
			double restodiv3 = result %2;
			System.out.println("A multiplicação de "+n1+" x "+n2+" é igual a "+result+".");
			if (restodiv3==0) {
				System.out.println("O número "+result+" é par.");	
			}else if (restodiv3 !=0) {
				System.out.println("O número "+result+" é ímpar.");	
			}if (result >0) {
				System.out.println("O número "+result+" é positivo.");	
			}else if (result<0) {
				System.out.println("O número "+result+" é negativo.");	
			}
		break;
			
		case 4:
			if (n2==0) {
				System.out.println("Não é possível efetuar divisão por 'zero'. Dgite outro valor para:"+n2+".");
				return;
			}else {
				result = n1 / n2;				
				double restodiv4 = result %2;
				System.out.println("A divisão de "+n1+" / "+n2+" é igual a "+result+".");
				if (restodiv4==0) {
					System.out.println("O número "+result+" é par.");	
				}else if (restodiv4 !=0) {
					System.out.println("O número "+result+" é ímpar.");	
				}if (result >0) {
					System.out.println("O número "+result+" é positivo.");	
				}else if (result<0) {
					System.out.println("O número "+result+" é negativo.");	
				}
			break;			
			}
}
				
	}catch(InputMismatchException e) {
					System.out.println("Escolha incorreta!");
	}
			
}
	
}
	
	
	
	



