package com.bruno.cursojava.aula19;

public class Exercicio1 {

	public static void main(String[] args) {
		/*criar um vetor A com 5 elementos inteiros
		 *construir um vetor B de mesmo tipo, tamanho 
		 *e com os "mesmos" elementos do vetor A,ou seja,
		 *B[i] = A [i]. 
		 */		
		int [] a = new int [5];
		int [] b = new int [5];
		int i=0,value =1;
		
		for (i=0; i<a.length; i++) {
				
			a [i] =value;
			value +=1;
		}
		
		for (i=0; i<a.length; i++) {
			
			System.out.println("Valor do vetor A e índice "+(i+1)+" é "+a[i]);
		}
		
		for (i =0; i<b.length; i++) {
			
			b [i] = a [i];
		}
		
		for (i=0; i <b.length;i++) {
			System.out.println("Valor do vetor B e índice "+(i+1)+" é "+b[i]);
		}
		

	}

}
