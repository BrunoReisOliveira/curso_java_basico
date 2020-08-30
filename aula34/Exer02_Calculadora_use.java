package com.bruno.cursojava.aula34;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exer02_Calculadora_use {

	public static void main(String[] args) {

		double retornoSomar=0,retornoSubtrair=0,
			   retornoMultiplicar=0,retornoDividir=0,retornoPotencia=0,num1=0,num2=0;
		
		int escolha=0;	
		Scanner scan = new Scanner (System.in);
		
		try {
			
			System.out.println("Digite dois números");
			num1=scan.nextDouble();
			num2=scan.nextDouble();
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números!");
			main (args);
		}
		
		
		try {
			
			System.out.println("1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Potenciação");
			escolha=scan.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números!");
			main(args);
		}
		
		switch (escolha) {
		
		case 1:
			
			retornoSomar=Exer02_Calculadora.somar(num1, num2);
			System.out.print("Soma de "+num1+" e "+num2+"="+retornoSomar);
			break;
		case 2:
			
			retornoSubtrair=Exer02_Calculadora.subtrair(num1, num2);
			System.out.print("Subtração de "+num1+" e "+num2+"="+retornoSubtrair);
			break;
		case 3:
			
			retornoMultiplicar=Exer02_Calculadora.multiplicar(num1, num2);
			System.out.print("Multiplicação de "+num1+" e "+num2+"="+retornoMultiplicar);
			break;	
		case 4:
			
			retornoDividir=Exer02_Calculadora.dividir(num1, num2);
			System.out.print("Divisão de "+num1+" e "+num2+"="+retornoDividir);
			break;
		case 5:
			
			retornoPotencia=Exer02_Calculadora.potencia(num1, num2);
			System.out.print("Potenciação de "+num1+" elevado a "+num2+"="+retornoPotencia);
			break;			
		
		}		
		
	}

}
