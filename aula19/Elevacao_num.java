package com.bruno.cursojava.aula19;

import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Elevacao_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double base=0;
		int i=0,exp=0;
		Scanner scan = new Scanner (System.in);
		try {
			System.out.println("Digite a base:");
			base=scan.nextDouble();			
		}catch(InputMismatchException e ) {
			System.out.println("Digite apenas números!");
			main(args);			
		}
		
		try {			
			System.out.println("Digite o expoente:");
			exp = scan.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números inteiros");
		}	
		
		System.out.println("O número "+base+" elevado a "+exp+" é");
	}

}
