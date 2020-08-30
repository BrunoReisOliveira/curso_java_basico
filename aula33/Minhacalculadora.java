package com.bruno.cursojava.aula33;

/*Curso de Java 33 - Orientação a Objetos: 
 *Sobrecarga de métodos e construtores (overload)
 */
public class Minhacalculadora {
	
	public int soma (int n1,int n2) {
		return n1+n2;
	}
	
	public double soma (double n1,double n2) {
		return n1+n2;
	}
	
	public int soma (int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	
	public int soma (int []vetorInteiros) {
		
		int total =0;
		
		for (int i=0;i<vetorInteiros.length;i++) {
			total +=vetorInteiros[i];
		}
		return total;
	}

}
