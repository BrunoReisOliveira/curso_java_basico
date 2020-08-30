package com.bruno.cursojava.aula27;

public class EXE_02_ContaCorrente {
	
	/*Criar uma classe para representar uma conta corrente que possui
		um número, um saldo, um status que informa se ela é especial ou não,
		um limite. Desenvolva métodos para realizar saque(verificando se o cliente pode
		realizar saques), depositar dinheiro, consultar saldo e verificar se o 
		cliente está usando cheque especial ou não.
		Desenvolva um programa para testar essa classe.
	 */
	String nomeCliente,numConta,statusConta;
	int limiteConta,saldoConta;	
	
	int verificaValorAtual (int valorSaque) {
					
		return saldoConta;
		}
	
	int usarCheque (int valorSaque) {
		
		valorSaque = (limiteConta + saldoConta)-valorSaque;
		
		return valorSaque;
		
	}
	
	int efetuaSaque(int valorSaque) {
		
		return saldoConta - valorSaque;
	}	
	
	int sacarValor (int valorSaque) {		
		
		int valorAtual =saldoConta- valorSaque;	
		return valorAtual;
	}
	
	int efetuaDeposito (int valorDeposito) {
		
		return saldoConta + valorDeposito;
	}
	
	int verificaLimite () {
		return limiteConta;
	}
	
	int verificaSaldo() {
		return saldoConta;
	}
	
	String verificaStatus() {
		return statusConta;
	}
	
	String verificaNum() {
		return numConta;
	}
	

}
