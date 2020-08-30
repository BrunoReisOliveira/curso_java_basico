package com.bruno.cursojava.aula18;

import java.util.Scanner;
public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Scanner scan = new Scanner (System.in);
	
	int  n=0,limit=0,restodiv=0;
	
		System.out.println("Digite um número:");
		n=scan.nextInt();
	
		System.out.println("Digite um limite:");	
		limit= scan.nextInt();
	
			for (int i=n; i<=limit;i++) {
				
				if (i % 7==0) {
					
						System.out.println("O número "+ i +" é o primeiro dessa sequência divisível por 7!");
						break;
				}			
		}*/
	
		for (int i=0; i<=4; i++) {
			rotulo1:{
			
				rotulo2:{
			
					rotulo3:{
			
							if (i==1) {
								break rotulo1;
							}
							
							if (i==2) {
								break rotulo2;
							}
							
							if (i==3) {
								break rotulo3;
							}
							
							System.out.println("rotulo3");
						}
		
						System.out.println("rotulo2");
				}
			
					System.out.println("rotulo1");
			}
				System.out.println(i);
		}	
		
		Scanner scan = new Scanner (System.in);
		
		int  n=0,limit=0,restodiv=0;
		
			System.out.println("Digite um número:");
			n=scan.nextInt();
		
			System.out.println("Digite um limite:");	
			limit= scan.nextInt();
		
				for (int i=n; i<=limit;i++) {
					
					if (i % 7==0) {
						continue;
					}
						System.out.println("O número de i é: "+ i );
			}
		
	
	}

}
