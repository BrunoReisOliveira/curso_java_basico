package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		/*faça um programa que leia três números
		 * e mostre o maior e menor deles
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três números");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		
		if (n3>n2 &&n3>n1 &&n2>n1) {
			
			System.out.println(n3+" é maior que "+n2+" e "+ n1+"."+"O número "+ n1+" é menor que "+n2+" e "+ n3);
						
		}
		else if (n2>n1 &&n2>n3 &&n1>n3) {
			
			System.out.println(n2+" é maior que "+n1+" e "+ n3+"."+"O número "+ n3+" é menor que "+n1+" e "+ n2);
						
		}		
		else if (n1>n2 &&n1>n3 &&n3>n2) {
			
			System.out.println(n1+" é maior que "+n2+" e "+ n3+"."+"O número "+ n2+" é menor que "+n1+" e "+ n3);
						
		}
		else if (n1<n2 &&n1<n3&&n2>n3) {
			
			System.out.println(n2+" é maior que "+n1+" e "+ n3+"."+"O número "+ n1+" é menor que "+n3+" e "+ n2);
						
		}
		else if (n1>n2 &&n1>n3&&n2>n3) {
			
			System.out.println(n1+" é maior que "+n2+" e "+ n3+"."+"O número "+ n3+" é menor que "+n1+" e "+ n2);
						
		}
		
		else if (n1>n2 &&n1<n3&&n2<n3) {
			
			System.out.println(n3+" é maior que "+n1+" e "+ n2+"."+"O número "+ n2+" é menor que "+n3+" e "+ n1);
						
		}
		else if (n1==n2 &&n1==n3&&n2==n3) {
			
			System.out.println("Os números digitados são iguais: "+n1+","+n2+" e "+n3);
						
		}
	else if (n1==n2 &&n1!=n3&&n2!=n3&&n3>n1&&n3>n2 ) {
			
			System.out.println("O primeiro número "+n1+ " é igual ao segundo "+n2+ "."+"O número "+n3+" é maior.");
						
		}		
		
	else if (n1!=n2 &&n1!=n3&& n2==n3&&n2>n1&&n3>n1 ) {
		
		System.out.println("O segundo número "+n2+ " é igual ao terceiro "+n3+ "."+"O segundo ou terceiro número são maiores que "+n1);
					
	}
		
else if (n1!=n2 &&n1==n3&& n2>n1&&n2>n3 ) {
		
		System.out.println("O primeiro número "+n1+ " é igual ao terceiro "+n3+ "."+"O número "+n2+" é maior que "+n1+" e "+n3);
					
	}
		
else if (n1>n2 &&n1>n3&& n2==n3) {
	
	System.out.println("O segundo número "+n2+ " é igual ao terceito "+n3+"."+"O número "+n1+" é maior que "+n2+" e "+n3);
				
}
		
else if (n1>n2 &&n1==n3&& n2<n1&& n2<n3) {
	
	System.out.println("O primeiro número "+n1+ " é igual ao terceito "+n3+"."+"Os números "+n1+" ou "+n3+" são maiores que "+n2);
				
}	

else if (n1==n2 &&n1>n3&& n2>n3) {
	
	System.out.println("O primeiro número "+n1+ " é igual ao segundo "+n2+"."+"Os números "+n1+" ou "+n2+" são maiores que "+n3);
				
}			
}
}
		


