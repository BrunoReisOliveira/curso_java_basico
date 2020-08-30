package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio17 {

public static void main(String[] args) {
/*
* desenvolver um programa para cálculo do fatorial
*/
double i=0,num=0,term2=0,result=0;
	try {
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número inteiro para cálculo do fatorial:");
		num = scan.nextInt();
		term2=num-1;
		
		for (i=term2; i>1 ; i--) {		
			result= num * i;
			num = result;
		}	
	
		if (num==0||num==1) {
			result = 1;
		}else if (num==2) {
			result = 2;
		}
	
			System.out.println(result);
		
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros!");
			main (args);
}
		
}
}