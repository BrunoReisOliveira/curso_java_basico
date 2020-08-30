package com.bruno.cursojava.aula24;

public class AgendaContato1 {

	public static void main(String[] args) {
		
		Agenda contato = new Agenda();
		contato.primeiroNome = "Bruno";
		contato.nomeCompleto = "Bruno Reis de Oliveira";
		contato.apelido = "N/A";
		contato.empresa = "Tecnologia da Informação";
		contato.nomeEmpresa = "RSI Iformática";
		contato.email = "email@email.com.br";
		contato.endereco = "Rua 1, nº40";
		contato.website = "www.site.com.br";
		contato.telefone = 59772210;
		
		System.out.println("Nome: "+contato.primeiroNome);
		System.out.println("Nome completo: "+contato.nomeCompleto);
		System.out.println("Apelido: "+contato.apelido);
		System.out.println("Empresa: "+contato.empresa);
		System.out.println("Nome Empresa: "+contato.nomeEmpresa);
		System.out.println("E-mail: "+contato.email);
		System.out.println("Endereço: "+contato.endereco);
		System.out.println("Web Site: "+contato.website);
		System.out.println("Telefone: "+contato.telefone);
			

	}

}
