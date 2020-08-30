package com.bruno.cursojava.aula15;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio22 {

	public static void main(String[] args) {
		/*uma fruteira está vendendo frutas
		 * com a seguinte tabela de preços:
		 * 
		 * até 5kg
		 * morango R$2,50 por kg
		 * maçã R$1,80 por kg
		 * 
		 * acima de 5kg
		 * R$ 2,20 por Kg
		 * R$ 1,50 por Kg
		 * 
		 * Se o cliente comprar mais de 8 kg
		 * em frutas ou o valor total da compra ultrapas-
		 * sar R$25,00, receberá ainda um desconto de 10%
		 * sobre o total. 
		 * Escreva um programa para ler a quantidade
		 * (em kg) de morangos e quantidade (em kg)
		 * de maças adquiridas e escreva o valor 
		 * a ser pago pelo cliente.
		 */
		
		Scanner scan = new Scanner (System.in);
		try {
			
			System.out.println("Digite a quantidade (kg) de morango.");
			double kmorango = scan.nextDouble();
			System.out.println("Digite a quantidade (kg) de maças.");
			double kmaca = scan.nextDouble();
			double precomorango=2.20;
			double precomaca =1.50;
			double total=((precomorango*kmorango)+(precomaca*kmaca));;
			double totaldesconto=0;
			double totalkilo = kmorango + kmaca;
			
		if (totalkilo <=5) {
				
				precomorango =2.50;
				precomaca = 1.80;
				total = ((precomorango*kmorango)+(precomaca*kmaca));
				
				System.out.println("O preço do morango é:R$"+precomorango+" Kg.");
				System.out.println("O preço da maça é:R$"+precomaca+" Kg.");
				System.out.println("O preço total do morango é:R$"+precomorango*kmorango+".");
				System.out.println("O preço total da maçã é:R$"+precomaca*kmaca+".");
				System.out.println("O preço total da compra é:R$"+total+"0.");
				
			}else if (totalkilo >5 && totalkilo <=8) {
				
				precomorango =2.20;
				precomaca = 1.50;
				total = ((precomorango*kmorango)+(precomaca*kmaca));
				
				System.out.println("O preço do morango é:R$"+precomorango+" Kg.");
				System.out.println("O preço da maça é:R$"+precomaca+" Kg.");
				System.out.println("O preço total do morango é:R$"+precomorango*kmorango+".");
				System.out.println("O preço total da maçã é:R$"+precomaca*kmaca+".");
				System.out.println("O preço total da compra é:R$"+total+"0.");
			
			}else if (totalkilo >8 && total<=25) {
				
				precomorango =2.20;
				precomaca = 1.50;
				total = ((precomorango*kmorango)+(precomaca*kmaca));
				totaldesconto = total-((total *10)/100);
				
				System.out.println("O preço do morango é:R$"+precomorango+" Kg.");
				System.out.println("O preço da maça é:R$"+precomaca+" Kg.");
				System.out.println("O preço total do morango é:R$"+precomorango*kmorango+".");
				System.out.println("O preço total da maçã é:R$"+precomaca*kmaca+".");
				System.out.println("O preço total da compra é:R$"+total+"0.");
				System.out.println("O preço total da compra com 10% de desconto é:R$"+totaldesconto+"0."+"Você economizou:R$"+(total *10)/100+".");
						
			
			}else if (total>25) {
				precomorango =2.20;
				precomaca = 1.50;
				total = ((precomorango*kmorango)+(precomaca*kmaca));
				totaldesconto = total-((total *10)/100);
				
				System.out.println("O preço do morango é:R$"+precomorango+" Kg.");
				System.out.println("O preço da maça é:R$"+precomaca+" Kg.");
				System.out.println("O preço total do morango é:R$"+precomorango*kmorango+".");
				System.out.println("O preço total da maçã é:R$"+precomaca*kmaca+".");
				System.out.println("O preço total da compra é:R$"+total+"0.");
				System.out.println("O preço total da compra com 10% de desconto é:R$"+totaldesconto+"0."+"Você economizou:R$"+(total *10)/100+".");
			}					
		
		}catch (InputMismatchException e){
			
			System.out.println("Digite apenas números!");
			return;
			
		}

	}

}
