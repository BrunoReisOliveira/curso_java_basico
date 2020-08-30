package com.bruno.cursojava.aula43;

public class Exercicio03_Teste {

	public static void main(String[] args) {
		
		System.out.println("Zoológico");
		System.out.println("-----------------------");
		
		Exercicio03_mamifero mamiferoCamelo = new Exercicio03_mamifero ();
			
		mamiferoCamelo.setNome("Camelo");
		mamiferoCamelo.setComprimento("150 cm");
		mamiferoCamelo.setPatas("4");
		mamiferoCamelo.setCor("Amarelo");
		mamiferoCamelo.setAmbiente("Terra");
		mamiferoCamelo.setVelocidade("2.0 m/s");		
		System.out.println(mamiferoCamelo);
		
		System.out.println("-----------------------");
		
		Exercicio03_peixe peixeTubarao = new Exercicio03_peixe();
		peixeTubarao.setNome("Tubarão");
		peixeTubarao.setComprimento("300 cm");
		peixeTubarao.setPatas("0");
		peixeTubarao.setCor("Cinzento");
		peixeTubarao.setAmbiente("Mar");
		peixeTubarao.setVelocidade("1.5 m/s");
		peixeTubarao.setCaracteristica("Barbatanas e cauda");
		System.out.println(peixeTubarao);
		
		System.out.println("-----------------------");
		
		Exercicio03_mamifero mamiferoUrso = new Exercicio03_mamifero ();
		mamiferoUrso.setNome("Urso-do-canadá");
		mamiferoUrso.setComprimento("180 cm");
		mamiferoUrso.setPatas("4");
		mamiferoUrso.setCor("Vermelho");
		mamiferoUrso.setAmbiente("Terra");
		mamiferoUrso.setVelocidade("0.5 m/s");
		mamiferoUrso.setAlimento("Mel");
		System.out.println(mamiferoUrso);
	}

}
