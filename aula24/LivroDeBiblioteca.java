package com.bruno.cursojava.aula24;

import java.util.Date;

public class LivroDeBiblioteca {

	
	public static void main(String[] args) {
					
		Livro livroBiblioteca = new Livro();
		livroBiblioteca.nomeRetirada = "Bruno";
		livroBiblioteca.dataRetirada = new Date();
		livroBiblioteca.nomeLivro = "Aprendendo Java";
		livroBiblioteca.nomeAutor = "Loiane Gronner";
		livroBiblioteca.nomeEditora = "Editora Aprender";
		livroBiblioteca.numPagina = 256;
		livroBiblioteca.anoPublicacao = 2020;
		
		System.out.println("Responsável : "+livroBiblioteca.nomeRetirada);
		System.out.println("Data retirada: "+livroBiblioteca.dataRetirada);
		System.out.println("Data retorno: "+livroBiblioteca.dataRetorno);
		System.out.println("Nome: "+livroBiblioteca.nomeLivro);
		System.out.println("Nome autor: "+livroBiblioteca.nomeAutor);
		System.out.println("Nome editora: "+livroBiblioteca.nomeEditora);
		System.out.println("Páginas: "+livroBiblioteca.numPagina);
		System.out.println("Ano: "+livroBiblioteca.anoPublicacao);
		
	}

}
