package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		/*faça um programa que pergunte o preço
		 * de três produtos e informe qual o produto
		 * você deve comprar, sabendo que a decisão é sempre
		 * pelo mais barato
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite três valores de produtos:");
		
		double prod1 = scan.nextDouble();
		double prod2 = scan.nextDouble();
		double prod3 = scan.nextDouble();
		
		
		if (prod1<prod2 && prod1< prod3) {			
			System.out.println ("O menor preço é:" + prod1);
		} else if (prod2<prod1 && prod2< prod3) {
			System.out.println ("O menor preço é:" + prod2);
		}else if (prod3<prod1 && prod3< prod2) {			
			System.out.println ("O menor preço é:" + prod3);
		}else if (prod1==prod2 && prod2==prod3) {
			System.out.println("Os valores digitados são iguais:"+ prod1+","+prod2+" e "+prod3);
		}else if (prod1==prod2 && prod3>prod1) {
			System.out.println("Os valores digitados são iguais:"+ prod1+" e "+prod2+".Ambos são menores que "+prod3);
		}else if (prod1==prod3 && prod2>prod1 &&prod2>prod3) {
		System.out.println("Os valores digitados são iguais:"+ prod1+" e "+prod3+".Ambos são menores que "+prod2);
		}else if (prod1>prod2 && prod2==prod3) {
			System.out.println("Os valores digitados são iguais:"+ prod2+" e "+prod3+".Ambos são menores que "+prod1);
		}

}
}
