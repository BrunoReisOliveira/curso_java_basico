package com.bruno.cursojava.aula33;
/*
 * Reescreva os seguintes exercícios, criando todos os atribuitos
   do tipo privado, métodos getters e setters e construtores. Os métodos
   que serão utilizado pela classe de teste devem ser públicos. Se necessário, crie métodos
   privados como auxiliares para organizar melhor o código fonte também.
  
  1. Escreva uma classe para representar uma lâmpada.Desenvolva
  métodos para ligar e desligar a lâmpada.
 */

public class Exer01_lampada {	

	private String modelo;
	private String marca;
	private String cor;
	private String codProduto;
	private double espessura;
	private double tamanho;
	private double consumo;
	private double potenciaNominal;
	private double tensaoNominal;
	private double tensaoTeste;
	private double fluxoLuminoso;
	private int garantia;
	
	public String mostrarStatus() {
		String status;
		status ="Sua lâmpada está desligada!";
		return status;
	}
	
	public String ligarLampada() {
		String ligada;
		ligada="A lâmpada está ligada!";
		return ligada;
	}
	
	public String desligarLampada() {
		String desligada;
		desligada ="A lâmpada está desligada!";
		
		return desligada;
	}

	public Exer01_lampada(String modelo, String marca, 
			String cor, String codProduto, 
			double espessura, double tamanho,
			double consumo, double potenciaNominal, 
			double tensaoNominal,double tensaoTeste, 
			double fluxoLuminoso,
			int garantia) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.codProduto = codProduto;
		this.espessura = espessura;
		this.tamanho = tamanho;
		this.consumo = consumo;
		this.potenciaNominal = potenciaNominal;
		this.tensaoNominal = tensaoNominal;
		this.tensaoTeste = tensaoTeste;
		this.fluxoLuminoso = fluxoLuminoso;
		this.garantia = garantia;
	}
	
	//construtor vazio
	public Exer01_lampada() {};

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public double getEspessura() {
		return espessura;
	}

	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getPotenciaNominal() {
		return potenciaNominal;
	}

	public void setPotenciaNominal(double potenciaNominal) {
		this.potenciaNominal = potenciaNominal;
	}

	public double getTensaoNominal() {
		return tensaoNominal;
	}

	public void setTensaoNominal(double tensaoNominal) {
		this.tensaoNominal = tensaoNominal;
	}

	public double getTensaoTeste() {
		return tensaoTeste;
	}

	public void setTensaoTeste(double tensaoTeste) {
		this.tensaoTeste = tensaoTeste;
	}

	public double getFluxoLuminoso() {
		return fluxoLuminoso;
	}

	public void setFluxoLuminoso(double fluxoLuminoso) {
		this.fluxoLuminoso = fluxoLuminoso;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

}
