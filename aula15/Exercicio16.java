package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		/*faça um programa que calcule as raízes
		 * de uma equação do segundo
		 * grau, na forma ax2 + bx + c. O programa
		 * deverá pedir os valores de a,
		 * b e c e fazer as consistências, 
		 * informando ao usuário nas seguintes situações:
		 * a. Se o usuário informar o valor de A
		 * igual a zero, a equação não é
		 * do segundo grau e o programa não deve fazer
		 * pedir os demais valores, sendo encerrado;
		 * b.Se o delta calculado for negativo, a
		 * equação não possui raizes reais.Informe 
		 * ao usuário e encerre o programa.
		 * c. Se o delta calculado for igual a zero
		 * a equação possui apenas uma raiz real;
		 * informe-a ao usuário;
		 * d. Se o delta for positivo, a equação possui
		 * duas raizes reais; informe-as ao usuário
		 */
		
		Scanner scan = new Scanner (System.in);
		
		double a=0;
		double b=0;
		double c=0;
	
		System.out.println("Digite o valor de A:");
		a = scan.nextDouble();
		
		if (a==0) {
			System.out.println("Digite um valor diferente de "+a+". A equação não é de segundo grau.");
			return;
		}else if (a!=0) {
			System.out.println("Digite o valor de B:");
			b= scan.nextDouble();
			
			System.out.println("Digite o valor de C:");
			c=scan.nextDouble();
			
			//cálculo do delta
			double delta =	(Math.pow(b, 2)-(4*a*c));
			
			if (delta <0) {
				
				System.out.println("A equação não possui raízes reais!O valor de Delta é:"+delta+".");
				return;
			}else if (delta ==0) {
				double x1=((-b + Math.sqrt(delta)) / (2*a));
				double x2= ((-b - Math.sqrt(delta)) / (2*a));
				System.out.println("A equação possui apenas uma raiz real para x1 e x2. Sendo x1="+x1+" e x2="+x2+".");
				System.out.println("O valor de delta é:"+delta);	
			}else if (delta>0) {
				double x1=((-b + Math.sqrt(delta)) / (2*a));
				double x2= ((-b - Math.sqrt(delta)) / (2*a));
				System.out.println("A raíz de x1 é:"+x1+".");
				System.out.println("A raíz de x2 é:"+x2+".");
				System.out.println("O valor de delta é:"+delta);
			}
			
		}
			
	}

}
