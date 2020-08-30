package com.bruno.cursojava.aula19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio37 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 15 elementos inteiros. Construir um
			vetor B de mesmo tamanho, sendo que cada elemento do vetor
			B seja o fatarial do elemento correspondente em A.
		 */
		Scanner scan = new Scanner (System.in);
		int [] a = new int [15];
		int [] b = new int [15];
		int i=0,j=0,fat=0,numtemp=0,numtemp2=0,result=0;
		
		try {
			
			for (i=0;i<a.length;i++) {
				System.out.println("Digite o número "+(i+1));
				a[i] = scan.nextInt();
			}
			
			for (i=0;i<a.length;i++) {
				
				numtemp=a[i];
				numtemp2 = numtemp-1;				
				
				for (j=numtemp2;j>=1;j--) {						
					fat = numtemp*j;
					numtemp = fat;
					result = fat;					
				}
				
				if (numtemp == 0||numtemp==1) {
					b[i]=1;
				}else {
					b[i]=result;
				}
								
			}
			
			for (i=0;i<b.length;i++) {
				System.out.println(b[i]);
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros");
			main(args);
		}

	}
}


