package com.bruno.cursojava.aula43;

public class Exercicio01_Teste {

	public static void main(String[] args) {
		
		
		System.out.println("***Teste Conta Bancária***");
		
		//instanica da classe
		Exercicio01_ContaBancaria contaSimples = new Exercicio01_ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");
		
		//depositar		
		contaSimples.depositar(100);		
		realizarSaque(contaSimples,50);
		realizarSaque(contaSimples,70);
		
		
		//testando o método toString
		System.out.println(contaSimples);
		
		
		System.out.println("***Teste Conta Poupança***");
		
		//instanica da classe conta poupança
		Exercicio01_contaPoupanca contaPoupanca = new Exercicio01_contaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupança");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(9);
		
		//depositar		
		contaPoupanca.depositar(100);		
		realizarSaque(contaPoupanca,50);
		realizarSaque(contaPoupanca,70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de :"+contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado!");
		}
		
		//testando o método toString
		System.out.println(contaPoupanca);
		
		
		System.out.println("***Teste Conta Especial***");
		
		//instanica da classe
		Exercicio01_contaEspecial contaEspecial = new Exercicio01_contaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta Especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);
		
		//depositar		
		contaEspecial.depositar(100);		
		realizarSaque(contaEspecial,50);
		realizarSaque(contaEspecial,70);
		realizarSaque(contaEspecial,80);
		
		
		//testando o método toString
		System.out.println(contaEspecial);

	}
	
		private static void realizarSaque(Exercicio01_ContaBancaria conta,double valor) {
				
				if (conta.sacar(valor)) {
					System.out.println("Saque efetuado!Novo saldo:"+conta.getSaldo());

				}else {
					
					System.out.println("Saldo insuficiente para saque de "+valor+"; saldo de:"+conta.getSaldo());
				}
	}

}
