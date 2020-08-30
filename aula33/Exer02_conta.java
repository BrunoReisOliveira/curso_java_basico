package com.bruno.cursojava.aula33;

/*	Reescreva os seguintes exercícios, criando todos os atribuitos
	do tipo privato, métodos getters e setters e construtores. Os métodos
	que serão utilizado pela classe de teste devem ser públicos. Se necessário, 
	crie métodos privados como auxiliares para organizar melhor o código fonte também.
	
	2.Criar uma classe para representar uma conta corrente que possui
	um número, um saldo, um status que informa se ela é especial ou não,
	um limite.Desenvolva métodos para realizar saque (verificando se o cliente
	pode realizar saques), depositar dinheiro, consultar saldo e verificar
	se o cliente está usando cheque especial ou não. Desenvolva um programa
	para testar essa classe.
 * 
 */
public class Exer02_conta {

	private String nomeCliente, numConta, statusConta;
	private int limiteConta, saldoConta;

	public Exer02_conta(String nomeCliente, String numConta, String statusConta, 
			int limiteConta, int saldoConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.statusConta = statusConta;
		this.limiteConta = limiteConta;
		this.saldoConta = saldoConta;
	}

	// construtor vazio
	public Exer02_conta() {
	};

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(String statusConta) {
		this.statusConta = statusConta;
	}

	public int getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(int limiteConta) {
		this.limiteConta = limiteConta;
	}

	public int getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(int saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int verificaValorAtual(int valorSaque) {

		return saldoConta;
	}

	public int usarCheque(int valorSaque) {

		valorSaque = (limiteConta + saldoConta) - valorSaque;

		return valorSaque;

	}

	public int efetuaSaque(int valorSaque) {

		return saldoConta - valorSaque;
	}

	public int sacarValor(int valorSaque) {

		int valorAtual = saldoConta - valorSaque;
		return valorAtual;
	}

	public int efetuaDeposito(int valorDeposito) {

		return saldoConta + valorDeposito;
	}

	public int verificaLimite() {
		return limiteConta;
	}

	public int verificaSaldo() {
		return saldoConta;
	}

	public String verificaStatus() {
		return statusConta;
	}

	public String verificaNum() {
		return numConta;
	}

}
