package com.bruno.cursojava.aula43;
//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
import java.util.Scanner;
public class Exercicio02_Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String nome;
		double rendaBruta=0,resultCalcularImpostoPJ=0,resultCalcularImpostoPF=0;
		
		/*System.out.println("***Teste contribuinte PJ***");	
		
		Exercicio02_contribuinte_PJ contribuintePJ = new Exercicio02_contribuinte_PJ();
		System.out.println("Digite o nome do cliente PJ:");
		nome = scan.next();
		contribuintePJ.setNome(nome);		
		System.out.println("Digite o valor da renda bruta:");
		rendaBruta = scan.nextDouble();
		resultCalcularImpostoPJ=contribuintePJ.calcularImposto(rendaBruta);
		//testando o método toString;
		System.out.println(contribuintePJ);
		System.out.println("Valor da renda bruta:"+rendaBruta+".\nValor disponível após desconto de 10% do imposto:"+resultCalcularImpostoPJ);*/
		
		System.out.println("***Teste contribuinte PF***");
		
		Exercicio02_contribuinte_PF contribuintePF = new Exercicio02_contribuinte_PF();
		System.out.println("Digite o nome do cliente PF:");
		nome = scan.next();
		contribuintePF.setNome(nome);		
		System.out.println("Digite o valor da renda bruta:");
		rendaBruta = scan.nextDouble();
		resultCalcularImpostoPF = contribuintePF.calcularImposto(rendaBruta);
		System.out.println(contribuintePF);
		System.out.println("Valor da renda bruta:"+rendaBruta+".\nValor com o desconto do IR:"+resultCalcularImpostoPF);
		

	}

}
