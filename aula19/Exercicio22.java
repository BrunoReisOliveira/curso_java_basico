package com.bruno.cursojava.aula19;

import java.util.Random;
public class Exercicio22 {

	public static void main(String[] args) {
		/*
		 * Gerar aleatoriamente um vetor A com 10 elementos
			inteiros e iguais a 0 e 1, sugestão: A[i] = (int)Math.round(Math.random()*1);
			Pede-se para implementar  um programa que determine o percentual de 
			números 0's e 1's existentes no vetor A.
		 */
		double [] num = new double [10];
		
		int i=0,zero=0,um=0;
		double numtemp=0,porcent0=0,porcent1=0;
		
		Random gerador = new Random();
		
		for (i=0;i<num.length;i++) {
			
			numtemp = (int)Math.round(Math.random()*1);
			num[i] = numtemp;
			
			if(num[i]==0) {
				zero++;
			}
			else {
				um++;
			}
			
			//10  			-100%
			//zero/um		-x
			//x = (zero ou um * 100)/10(num.length)
			
		}
		
		porcent0 = (zero * 100)/num.length;
		porcent1 = (um * 100)/num.length;
		
		for (i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}		
		System.out.println("% de zero "+porcent0+" % de um "+porcent1+"%");

	}

}
