package com.bruno.cursojava.aula34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer03_Calculadora_fatorial_use {

	public static void main(String[] args) {
		double retornoSomar=0,retornoSubtrair=0,
				   retornoMultiplicar=0,retornoDividir=0,retornoPotencia=0,num1=0,num2=0;
			
			int escolha=0,retornoFatorial=0;	
			Scanner scan = new Scanner (System.in);
						
			
			try {
				
				System.out.println("1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Potenciação\n6-Fatorial");
				escolha=scan.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas números!");
				main(args);
			}
			
			switch (escolha) {
			
			case 1:
				
				try {
					
					System.out.println("Digite dois números");
					num1=scan.nextDouble();
					num2=scan.nextDouble();
					
				}catch(InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main (args);
				}
				
				retornoSomar=Exer03_Calculadora_fatorial.somar(num1, num2);
				System.out.print("Soma de "+num1+" e "+num2+"="+retornoSomar);
				break;
			case 2:
				
				try {
					
					System.out.println("Digite dois números");
					num1=scan.nextDouble();
					num2=scan.nextDouble();
					
				}catch(InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main (args);
				}
				
				retornoSubtrair=Exer03_Calculadora_fatorial.subtrair(num1, num2);
				System.out.print("Subtração de "+num1+" e "+num2+"="+retornoSubtrair);
				break;
			case 3:
				try {
					
					System.out.println("Digite dois números");
					num1=scan.nextDouble();
					num2=scan.nextDouble();
					
				}catch(InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main (args);
				}
				
				retornoMultiplicar=Exer03_Calculadora_fatorial.multiplicar(num1, num2);
				System.out.print("Multiplicação de "+num1+" e "+num2+"="+retornoMultiplicar);
				break;	
			case 4:
				try {
					
					System.out.println("Digite dois números");
					num1=scan.nextDouble();
					num2=scan.nextDouble();
					
				}catch(InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main (args);
				}
				retornoDividir=Exer03_Calculadora_fatorial.dividir(num1, num2);
				System.out.print("Divisão de "+num1+" e "+num2+"="+retornoDividir);
				break;
			case 5:
				try {
					
					System.out.println("Digite dois números");
					num1=scan.nextDouble();
					num2=scan.nextDouble();
					
				}catch(InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main (args);
				}
				retornoPotencia=Exer03_Calculadora_fatorial.potencia(num1, num2);
				System.out.print("Potenciação de "+num1+" elevado a "+num2+"="+retornoPotencia);
				break;
			case 6:
				try {
					
					int numfat=0;
					System.out.println("Digite um número");
					numfat=scan.nextInt();					
					retornoFatorial=Exer03_Calculadora_fatorial.fatorial(numfat);
					System.out.print(",fatorial de "+numfat+"="+retornoFatorial);
				}catch(InputMismatchException e) {
					System.out.println("Digite apenas números!");
					main (args);				
					break;
				}
			
			}		
			
		}

	}


