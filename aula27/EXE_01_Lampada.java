package com.bruno.cursojava.aula27;

public class EXE_01_Lampada {
	/* Escreva uma classe para representar uma lâmpada. Desenvolva métodos
	   para ligar, desligar a lâmpada.
	 */

	String modelo;
	String marca;
	String cor;
	String codProduto;
	double espessura;
	double tamanho;
	double consumo;
	double potenciaNominal;
	double tensaoNominal;
	double tensaoTeste;
	double fluxoLuminoso;
	int garantia;
	
	void mostrarStatus() {
		System.out.println("Sua lâmpada está desligada!");
	}
	
	void ligarLampada() {
		System.out.println("A lâmpada está ligada!");
	}
	
	void desligarLampada() {
		System.out.println("A lâmpada está desligada!");
	}
}
