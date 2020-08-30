package com.bruno.cursojava.aula24;

public class ContaCorrenteComum {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "1442";
		conta.saldo = 1000.000;
		conta.limite = 2000.000;
		conta.status = "Comum";
		
		System.out.println("Número: "+conta.numero);
		System.out.println("Saldo: "+conta.saldo);
		System.out.println("Limite: "+conta.limite);
		System.out.println("Status: "+conta.status);

	}

}
