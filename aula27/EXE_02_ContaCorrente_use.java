package com.bruno.cursojava.aula27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXE_02_ContaCorrente_use {

	public static void main(String[] args) {

		EXE_02_ContaCorrente conta = new EXE_02_ContaCorrente();

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do cliente:");
		conta.nomeCliente = scan.next();
		conta.numConta = "144235";
		conta.statusConta = "Conta Especial";
		conta.limiteConta = 2000;
		conta.saldoConta = 1000;
		int escolha = 0;
		int retornoMetodoVerificaValorAtual = 0, valorSaqueS = 0, valorDeposito = 0, valorPosSaque = 0,
				valorPosDeposito = 0, limiteAtual = 0, saldoAtual = 0,returnUsarChegue=0;
		String status,numConta,respCheq;
		
		System.out.println(
				"Escolha:\n1:sacar\n2:depositar\n3:limite atual\n4:saldo atual\n5:Status da Conta\n6:Número da Conta");
		escolha = scan.nextInt();

		switch (escolha) {

		case 1:

			try {

				System.out.println("Digite o valor do saque:");
				valorSaqueS = scan.nextInt();
				retornoMetodoVerificaValorAtual = conta.verificaValorAtual(valorSaqueS);

			} catch (InputMismatchException e) {
				System.out.println("Digite números sem vírgula!");
				main(args);
			}

			if (valorSaqueS > retornoMetodoVerificaValorAtual) {
				System.out.println("Saldo insuficiente!Deseja usar o cheque especial?");
				respCheq = scan.next();
				
				if(respCheq.equalsIgnoreCase("S")||respCheq.equalsIgnoreCase("SIM")) {
					//criar método para somar o saldo atual e valor do limite
					returnUsarChegue=conta.usarCheque(valorSaqueS);					
					System.out.println("Valor do saldo em conta antes do saque:"+conta.saldoConta+"\nValor após o saque:"+returnUsarChegue);
				}
				
			} else {

				valorPosSaque = conta.efetuaSaque(valorSaqueS);

				System.out.println("Valor do saldo em conta antes do saque:" + conta.saldoConta
						+ "\nValor após o saque:" + valorPosSaque);
			}
			break;

		case 2:

			try {

				System.out.println("Digite o valor do depósito:");
				valorDeposito = scan.nextInt();
				valorPosDeposito = conta.efetuaDeposito(valorDeposito);
				System.out.println("Valor do saldo em conta antes do depósito:" + conta.saldoConta
						+ "\nValor após o depósito:" + valorPosDeposito);
			} catch (InputMismatchException e) {
				System.out.println("Digite números sem vírgula");
				main(args);
			}
			break;
		case 3:
			limiteAtual = conta.verificaLimite();
			System.out.println("Limite atual: " + limiteAtual);
			break;

		case 4:
			saldoAtual = conta.verificaSaldo();
			System.out.println("Saldo atual: " + saldoAtual);
			break;
		case 5:
			status = conta.verificaStatus();
			System.out.println("Status atual: " + status);
			break;
		case 6:
			numConta = conta.verificaNum();
			System.out.println("Número da conta: "+numConta);
		}

		
	}

}
