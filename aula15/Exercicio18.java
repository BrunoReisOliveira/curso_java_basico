package com.bruno.cursojava.aula15;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		/*faça um programa que peça um 
		 * número inteiro e determine se ele
		 * é par ou impar. Dica: utilize o operador
		 * módulo (resto da divisão)
		 * 
		 */
	Scanner scan = new Scanner (System.in);
	
	try {
	
	System.out.println("Digite um número inteiro:");
	 int n = scan.nextInt();
	 int restodiv = n%2;
	  	 
	 switch (restodiv){
	
	 case 0:System.out.println("O número "+n+" é par");break;
	 default:System.out.println("O número "+n+" é ímpar.");
}
	}catch (InputMismatchException e) {
	
		System.out.println("Digite apenas números sem vírgula ','");
	
}

}
}

