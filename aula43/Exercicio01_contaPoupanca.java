package com.bruno.cursojava.aula43;

import java.util.Calendar;

/* Para todos os exercícios, não esqueça de encapsular os atributos com métodos
	getters e setter, criar os construtores apropriados e também o método to String.
	
	contaPoupança

	atributo diaRendimento
	
	método calcularNovoSaldo, recebe a taxa de rendimento da poupança e atualiza o saldo	
	
 */
public class Exercicio01_contaPoupanca extends Exercicio01_ContaBancaria {
	
	private int diaRendimento=0;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "ContaPoupança[";
		s +=" diaRendimento: "+diaRendimento;
		s +="; "+super.toString();
		s +="]";
		return s;		
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento==hoje.get(Calendar.DAY_OF_MONTH)) {
			
			//saldo += saldo * taxaRendimento;
			
			this.setSaldo(this.getSaldo() + (this.getSaldo()* taxaRendimento));
			return true;
		}
		return false;
	}

	
	
	

}
