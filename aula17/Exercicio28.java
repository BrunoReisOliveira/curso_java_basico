package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio28 {

public static void main(String[] args) {
	/*Os números primos possuem várias aplicações dentro da computação,
	por exemplo na criptografia. Um número primo é aquele 
	que é divisível apenas por um e por ele mesmo.
	Faça um programa que peça um número inteiro e determine se 
	ele é ou não um número primo
	*/ 
Scanner scan = new Scanner (System.in);
int num=0,count=0;
double restoDiv=0;

try { 
System.out.println("Digite um número inteiro e saiba se ele é primo:");
num = scan.nextInt();
	if (num <=1) {
	System.out.println("Digite um valor maior que "+num);
	main(args);
}
}catch(InputMismatchException e) { 
System.out.println("Digite apenas números sem vírgula!");
main (args);
}

for (int i=1; i<=num; i++) {

	restoDiv = num %i;

if (restoDiv==0) {
	count +=1;
System.out.println("O número "+num+" é divisível por "+i);
//System.out.println("O número "+num+" é primo!");
}

}
	if (count == 2) {
		System.out.println("O número "+num+" é primo!");
		}else {
		System.out.println("O número "+num+ " é composto!");
	}
}

}