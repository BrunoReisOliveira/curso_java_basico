package com.bruno.cursojava.aula24;

public class LivroDeLivraria {

	public static void main(String[] args) {
		
		Livro livraria = new Livro();
		
		livraria.nomeLivro = "Aprendendo Java com Loiane";
		livraria.nomeAutor = "Professor de Java";
		livraria.nomeEditora = "Editora Java";
		livraria.numPagina = 52;
		livraria.anoPublicacao = 2020;
		
		System.out.println(livraria.nomeLivro);
		System.out.println(livraria.nomeAutor);
		System.out.println(livraria.nomeEditora);
		System.out.println(livraria.numPagina);
		System.out.println(livraria.anoPublicacao);
		
	}

}

