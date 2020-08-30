package com.bruno.cursojava.aula36labs;
import java.util.Scanner;
public class Exer01 {

	public static void main (String []args) {
		
		Scanner scan = new Scanner (System.in);
		
		String nome;
		
		System.out.println("Digite o nome da agenda:");
		nome = scan.nextLine();
		
		//chamada da classe agenda
		
		Agenda agenda = new Agenda (nome);
		/*Agenda agenda = new Agenda();
		 *agenda.setNome(nome); 
		 */
		//chamada da classe
		Contato [] contatos = new Contato [3];
		
		for (int i=0;i<3;i++) {
			
			System.out.println("Digite as informações do contato "+(i+1));
			//instancia do objeto
			Contato c = new Contato();
			
			System.out.println("Digite o nome:");			
			nome = scan.nextLine();
			c.setNome(nome);
			System.out.println("Digite o telefone:");	
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			System.out.println("Digite o e-mail:");	
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos [i]=c;			
		}
		//setar o valor na agenda
		agenda.setContatos(contatos);
		
		if (agenda !=null) {
			
			System.out.println(agenda.obterInfo());
		}
		
	}
}
