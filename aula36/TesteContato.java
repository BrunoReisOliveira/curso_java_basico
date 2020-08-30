package com.bruno.cursojava.aula36;

public class TesteContato {
	/*Curso de Java 36 - Orientação a Objetos: 
	 * Relacionamento entre Classes (tem um e tem muitos)
	*/
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Bruno Reis");
		//contato.setEndereco("Rua por ae");
		//contato.setTelefone("1198765432");
		
		//criar o objeto endereço
		//relacionamento tem-um endereço
		Endereco end = new Endereco();
		end.setNomeRua("Rua por aee");
		end.setNumero("1");
		end.setEstado("São Paulo");
		end.setComplemento("Casa");
		end.setCidade("São Paulo");
		end.setCep("04895-020");
		
		//criar o objeto telefone
		//relacionamento tem-um telefone
		Telefone tel = new Telefone();		
		tel.setTipo("Celular");
		tel.setDdd("11");
		tel.setNumero("987654321");
		
		//relacionamento um para muitos
		Telefone tel2 = new Telefone();		
		tel2.setTipo("Casa");
		tel2.setDdd("11");
		tel2.setNumero("59658741");
		
		Telefone[] telefones = new Telefone[2];
		telefones [0]=tel;
		telefones [1]=tel2;
		
		//adicionar o array na classe contato
		contato.setTelefones(telefones);
				
		/*adicionar o objeto do tipo endereço na 
		classe contato*/
		contato.setEndereco(end);
		
		//setar o telefone no contato
		//contato.setTelefone(tel);
		
		//relacionamento tem-um telefone
		
		
		//teste saída no console
		System.out.println("Nome:"+contato.getNome());
		//System.out.println("Telefone:"+contato.getTelefone());
		
		//validação do endereço
		if (contato !=null && contato.getEndereco() !=null) {
			System.out.println("Endereço:"+contato.getEndereco().getCidade());		
		}
		
		/*if (contato !=null && contato.getTelefone() !=null) {
			System.out.println("Telefone:"+contato.getTelefone().getDdd()+" "+contato.getTelefone().getNumero());
		}*/
		
		if (contato !=null && contato.getTelefones() !=null) {
			
			for (Telefone t:contato.getTelefones()) {
				System.out.println(t.getDdd()+" "+t.getNumero());
			}
		
		}
		
	}

}
