package com.bruno.cursojava.aula15;

import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		/*faça um programa para o cálculo de uma 
		 * folha de pagamento, sabendo que os descontos
		 * são do Imposto de Renda, que depende do salário
		 * bruto (conforme tabela abaixo) e 3% para o Sindicato e que 
		 * o FGTS corresponde a 11% do salário Bruto, mas
		 * não é descontado (é a empresa que deposita). O salário
		 * Líquido corresponde ao Salário Bruto menos os descontos. O
		 * programa deverá pedir ao usuário o valor da sua hora
		 * e a quantidade de horas trabalhadas no mês.
		 * 
		 *DESCONTO DO IR:
		 *salário bruto até 900 (inclusive) - isento
		 *salário bruto até 1500(inclusive) - desconto de 5%
		 *salário bruto até 2500 (inclusive) - desconto de 10%
		 *salário bruto acima de 2500 - desconto de 20$
		 *Imprima na tela as informações, dispostas conforme o exemplo
		 *abaixo.
		 *No exemplo o valor da hora é 5 e a quantidade de horas é 220
		 *
		 *Salário Bruto: (5 * 220)		:R$1100,00
		 *(-) IR (5%)					:R$  55,00
		 *(-) INSS (10%)				:R$ 110,00
		 *FGTS (11%)					:R$ 121,00
		 *Total de descontos			:R$ 165,00
		 *Salário Líquido				:R$ 935,00
		 */			
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite o valor/hora e a quantidade de horas trabalhadas no mês:");
		double vhora = scan.nextDouble();
		double qtdhorames = scan.nextDouble();
		double salariobruto = vhora * qtdhorames;
		//double sindicato = (salariobruto *3)/100;
		double fgts = (salariobruto * 11)/100;
		double inss = (salariobruto * 10)/100;
		double ir = 0;	
		
		if (salariobruto <=900) {
			ir = 0;
			double descontos = ir+inss;
			double salarioliquido = salariobruto - descontos;			
			System.out.println("Salário Bruto:"+"("+vhora+" * "+qtdhorames+")"+"	    "+":R$"+salariobruto+"0");
			System.out.println("(-)IR(0%)"+" 		            "+":R$"+ir+"0");
			System.out.println("(-)INSS(10%"+")"+"		            "+":R$"+inss+"0");
			System.out.println("(-)FGTS(11%"+")"+"		            "+":R$"+fgts+"0");
			System.out.println("Total de descontos"+"		    "+":R$"+descontos+"0");
			System.out.println("Salário	Líquido	"+"		    "+":R$"+salarioliquido+	"0");
	
		
		}
		
		else if	 (salariobruto >900 && salariobruto <=1500) {			
			ir =(salariobruto * 5 )/100;
			double descontos = ir+inss;
			double salarioliquido = salariobruto - descontos;
			System.out.println("Salário Bruto:"+"("+vhora+" * "+qtdhorames+")"+"	    "+":R$"+salariobruto+"0");
			System.out.println("(-)IR(5%)"+"	 		    "+":R$"+ir+"0");
			System.out.println("(-)INSS(10%)"+"		            "+":R$"+inss+"0");
			System.out.println("(-)FGTS(11%)"+"		            "+":R$"+fgts+"0");
			System.out.println("Total de descontos"+"		    "+":R$"+descontos+"0");
			System.out.println("Salário	Líquido	"+"		    "+":R$"+salarioliquido+	"0");
	
		
		}
		
		else if	 (salariobruto >1500 && salariobruto <=2500) {			
			ir =(salariobruto * 10 )/100;
			double descontos = ir+inss;
			double salarioliquido = salariobruto - descontos;
			System.out.println("Salário Bruto:"+"("+vhora+" * "+qtdhorames+")"+"	    "+":R$"+salariobruto+"0");
			System.out.println("(-)IR(5%)"+"	 		    "+":R$"+ir+"0");
			System.out.println("(-)INSS(10%)"+"		            "+":R$"+inss+"0");
			System.out.println("(-)FGTS(11%)"+"		            "+":R$"+fgts+"0");
			System.out.println("Total de descontos"+"		    "+":R$"+descontos+"0");
			System.out.println("Salário	Líquido	"+"		    "+":R$"+salarioliquido+	"0");
	
		
		}
		else if	 (salariobruto >2500) {			
			ir =(salariobruto * 20 )/100;
			double descontos = ir+inss;
			double salarioliquido = salariobruto - descontos;
			System.out.println("Salário Bruto:"+"("+vhora+" * "+qtdhorames+")"+"	    "+":R$"+salariobruto+"0");
			System.out.println("(-)IR(5%)"+"	 		    "+":R$"+ir+"0");
			System.out.println("(-)INSS(10%)"+"		            "+":R$"+inss+"0");
			System.out.println("(-)FGTS(11%)"+"		            "+":R$"+fgts+"0");
			System.out.println("Total de descontos"+"		    "+":R$"+descontos+"0");
			System.out.println("Salário	Líquido	"+"		    "+":R$"+salarioliquido+	"0");
	
		
		}
		
		
	}

}
