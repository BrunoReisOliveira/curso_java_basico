package com.bruno.cursojava.aula43;

public class Exercicio02_contribuinte_PF extends Exercicio02_contribuinte {

	public double calcularImposto(double rendaBruta) {
		double result = 0;

		if (rendaBruta >= 0 && rendaBruta <= 1400) {

			result = rendaBruta;
		}

		if (rendaBruta > 1400 && rendaBruta <= 2100) {

			double desconto = ((rendaBruta * 10) / 100);
			result = ((rendaBruta - desconto) - 100);
		}

		if (rendaBruta > 2100 && rendaBruta <= 2800) {

			double desconto = ((rendaBruta * 15) / 100);
			result = ((rendaBruta - desconto) - 270);
		}

		if (rendaBruta > 2800 && rendaBruta <= 3600) {

			double desconto = ((rendaBruta * 25) / 100);
			result = ((rendaBruta - desconto) - 500);
		}

		if (rendaBruta > 3600) {

			double desconto = ((rendaBruta * 30) / 100);
			result = ((rendaBruta - desconto) - 700);
		}

		return result;

	}

}
