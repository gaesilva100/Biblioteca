package br.com.casadocodigo.livraria;

public class Autor {
	
	private String nome;
	private String email;
	
	public void setNome(String nome ){
		this.nome = nome;
	}
	
     public String getNome(){
		return nome;
	}
     
     
     public void setEmail(String email ){
 		this.email = email;
 	}
 	
      public String getEmail(){
 		return email;
 	}
	
	public void mostrarDetalhes(){
		
		System.out.println("Mostrando Detalhes do Autor  "+ getNome());
		System.out.println("Nome:::: " + nome);
		System.out.println("Nome:::: " + email);
		System.out.println(" -------  " );
	}

}
