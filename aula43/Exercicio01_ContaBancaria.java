package com.bruno.cursojava.aula43;
/*Para todos os exercícios, não esqueça de encapsular os atributos com métodos
getters e setter, criar os construtores apropriados e também o método to String.

Exercício 01 - Conta Bancária

Elabore uma classe ContaBancaria com os seguintes atributos:

nomeCliente
numConta
saldo

E os seguintes métodos:

sacar (o saldo não pode ficar negativo)
depositar
 * 
 * 
 * 
 */
public class Exercicio01_ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	//construtores
	
	public Exercicio01_ContaBancaria(){
		super();
	};
	
	public Exercicio01_ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	
	@Override
	public String toString() {
		return "Exercicio01_ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo
				+ "]";
	}
	
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
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(double valor) {
		saldo+=valor;
		
	}
	
	//sacar (o saldo não pode ficar negativo)
	public boolean sacar(double valor) {
		
		if ((saldo -valor)>=0) {
			saldo -=valor;
			return true;
		}
		return false;
	}
}
