package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercicio30 {

	public static void main(String[] args) {
		/*Desenvolva um programa que faça a tabuada de um número
		qualquer inteiro que será digitado pelo usuário, mas
		a tabuada não deve necessariamente iniciar em 1 e terminar em 10,
		o valor inicial e final devem ser informados também pelo usuário, conforme
		exemplo abaixo:
		
		*Montar a tabuada de: 5
		
		*Começar por:4
		
		*Terminar em:7
		
		Vou montar a tabuada de 5 começando em 4 e terminando em 7:
		
		5 x 4 =20
		5 x 5 =25
		5 x 6 =30
		5 x 7 =35
		
		OBS:Você deve verificar se o usuário não digitou o final menor que o inicial 
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		int i=0,tabuada=0,inicia=0,termina=0;
		
		try {
			
			System.out.println("Montar a tabuada de:");
			tabuada = scan.nextInt();
			
			System.out.println("Começar por:");
			inicia = scan.nextInt();
			
			System.out.println("Terminar em:");
			termina = scan.nextInt();
			
			if (termina < inicia) {
				System.out.println("Valor final menor que o inicial!");
					main(args);
				}			
			
			System.out.println("Tabuada de "+tabuada+" começando em "+inicia+" e terminando em "+  termina);
			
			for (i=inicia; i<=termina; i++) {
				
				System.out.println(tabuada+" x "+i+" ="+tabuada*i);
				
			}
			
		}catch (InputMismatchException e ) {
			System.out.println("Digite apenas números inteiros!");
			main (args);
		}

	}

}
