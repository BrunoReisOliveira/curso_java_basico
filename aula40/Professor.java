package com.bruno.cursojava.aula40;

/*3:56 / 12:47
Curso de Java 40: Orientação a Objetos: 
Herança e Polimorfismo: 
sobrecarga de métodos
 * 
 */
public class Professor extends Pessoa{
	

	private double salario;
	private String nomeCurso;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco(){
		
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
		
	}
}
