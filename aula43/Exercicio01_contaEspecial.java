package com.bruno.cursojava.aula43;
/*Para todos os exercícios, não esqueça de encapsular os atributos com métodos
getters e setter, criar os construtores apropriados e também o método to String.

contaEspecial

atributo limite

sobrescreva o método sacar com a nova lógica necessária
 * 
 */
public class Exercicio01_contaEspecial extends Exercicio01_ContaBancaria {
	
	private double limite=0;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	@Override
	public String toString() {
		String s = "ContaEspecial[";
		s +=" limite: "+limite;
		s +="; "+super.toString();
		s +="]";
		return s;		
	}	
	
		public boolean sacar(double valor) {
			
			double saldoComLimite = this.getSaldo() + limite;
			
			if ((saldoComLimite -valor)>=0) {
				this.setSaldo(this.getSaldo()-valor);
				return true;
			}
			
			
		return false;	
		}

}
