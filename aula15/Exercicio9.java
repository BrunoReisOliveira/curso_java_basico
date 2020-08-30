package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		/*faça um programa que leia três números e mostre-os
		  em ordem decrescente
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite três números:");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		if (n3>n2&&n3>n1&&n2>n1) {
			System.out.println("A ordem decrescente é:"+n3+","+n2+" "+n1);
		}
		
		if (n2>n1&&n2>n3&&n1>n3) {
			System.out.println("A ordem decrescente é:"+n2+","+n1+" "+n3);
		}
	
		if (n1>n2&&n1>n3&&n3>n2) {
			System.out.println("A ordem decrescente é:"+n1+","+n3+" "+n2);
		}	
		
		if (n3>n1&&n3>n2&&n1>n2) {
			System.out.println("A ordem decrescente é:"+n3+","+n1+" "+n2);
		}
		
		if (n2>n1&&n2>n3&&n3>n1) {
			System.out.println("A ordem decrescente é:"+n2+","+n3+" "+n1);
		}
		
		if (n1>n2&&n1>n3&&n2>n3) {
			System.out.println("A ordem decrescente é:"+n1+","+n2+" "+n3);
		}
		
		if (n1==n2&&n3>n2) {
			System.out.println("A ordem decrescente é:"+n3+","+n2+" "+n1);
		}
		
		if (n1==n3&&n2>n3) {
			System.out.println("A ordem decrescente é:"+n2+","+n3+" "+n1);
		}
		
		if (n1>n2&&n2==n3) {
			System.out.println("A ordem decrescente é:"+n1+","+n2+" "+n3);
		}
		
		if (n1==n2&&n2==n3) {
			System.out.println("Os números digitados são iguais:"+n1+","+n2+" "+n3);
		}
		
		if (n1>n3&&n1==n2) {
			System.out.println("A ordem decrescente é:"+n1+","+n2+" "+n3);
		}
		if (n1>n2&&n1==n3) {
			System.out.println("A ordem decrescente é:"+n1+","+n3+" "+n2);
		}
		if (n1<n2&&n2==n3&&n2>n1) {
			System.out.println("A ordem decrescente é:"+n2+","+n3+" "+n1);
		}
		
	}	

}
