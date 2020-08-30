package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio27 {

	public static void main(String[] args) {
		/*o departamento estadal de meteorologia lhe contratou
		para desenvolver um programa que leia um conjunto
		indeterminado de temperaturas, e informe ao final a menor e a
		maior temperatura bem como a média das temperaturas
		 * 
		 */		
		Scanner scan = new Scanner(System.in);
		double temp=0,somatemp=0,menortemp=0,maiortemp=0, valorAtual=0;
		String resp = "";
		ArrayList <Double> lista = new ArrayList<>();		
					
		try {		
					
			do {
				
				System.out.println("Digite uma temperatura:");
				temp = scan.nextDouble();
				somatemp +=temp;
				lista.add(temp);
										
				System.out.println("Deseja digitar outra temperatura?");
				resp =scan.next();
							
				
			}while (resp.equalsIgnoreCase("S")||(resp.equalsIgnoreCase("SIM")));
			
				menortemp = lista.get(0);
				
				for (int i=0; i<lista.size(); i++) { 
					System.out.printf("Posição %d - %s\n",i,lista.get(i)); 
					valorAtual = lista.get(i);
					//ternário
					maiortemp = valorAtual > maiortemp ? valorAtual : maiortemp;
					menortemp = valorAtual < menortemp ? valorAtual : menortemp;
				
				}
				
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números !");
			main(args);
		}
				
			System.out.println("A menor temperatura é:"+menortemp);
			System.out.println("A maior temperatura é:"+maiortemp);
			System.out.println("A média da (s) temperatura (s) é (são)	"+somatemp / lista.size());
	}

}

