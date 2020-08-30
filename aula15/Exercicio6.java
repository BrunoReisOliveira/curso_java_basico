package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		/*faça um programa que leia três números e mostre
		 o maior deles
		 */
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite três números");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		if (n1>n2 && n1>n3) {
			
			System.out.println(n1+" é maior que "+n2+" e "+n3);
			
		}else if (n2>n1&&n2>n3) {
			
			System.out.println(n2+" é maior que "+n1+" e "+n3);
		}
		
		else if(n3>n1 &&n3>n2) {
			System.out.println(n3+" é maior que "+n1+" e "+n2);
		}
		
		else if (n1==n2 && n1==n3) {
			System.out.println("Os valores digitados são iguais:"+n1+" "+n2+" "+n3);
		}	
		

	}

}
