package com.bruno.cursojava.aula17;


public class Exercicio4 {

	public static void main(String[] args) {
		/*supondo que a população de um 
		 * país A seja da ordem de 80000
		 * habitantes com uma taxa anual de crecimento
		 * de 3% e que a população de B seja 200000
		 * habitantes com uma taxa de crescimento
		 * de 1,5%. Faça um programa que calcule
		 * e escreva o número de anos necessários
		 * para que a população do país A ultrapasse
		 * ou iguale a população do país B, mantidas
		 * as taxas de crescimento
		 */
		long paisa = 80000;
		long paisb = 200000;
		
		int ano=0;
		do {			
			
			paisa += (paisa/100)*3;
			paisb += (paisb /100)* 1.5;
			ano++;
			
		}while (paisa< paisb);
		
		System.out.println("População A: "+ paisa);
		System.out.println("População B: "+ paisb);
		System.out.println("Serão necessário "+ano+" ano (s) para que o país A ultrapasse ou iguale o país B");
			
		
		
}

}
