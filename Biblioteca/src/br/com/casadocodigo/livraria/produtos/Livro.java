package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.*;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {
	
	private String nome;
	private double valor;
	private Autor autor;
	private String isbn;
	private boolean impresso;
	
	public Livro(Autor autor){
		//this();
		if(autor == null){
			throw new AutorNuloException(
					"O Autor do livro não pode ser nulo");
		}
		this.isbn ="000-00-0000-00-0";
		this.autor = autor;
		this.impresso = true ;
	}
	
	
	
	public Livro(){
		this.isbn ="1";
	}
	
	
	
	//public abstract boolean aplicaDescontoDe(double porcentagem);
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
     public double getValor(){
		return this.valor;
	}
     
     
 	public void setNome(String nome ){
		this.nome = nome;
	}
	
     public String getNome(){
		return nome;
	}
     
     
 	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
     public Autor getAutor(){
		return autor;
	}
     
    
     public void setIsbn(String isbn){
 		this.isbn = isbn;
 	}
 	
      public String getIsbn(){
 		return isbn;
 	} 
     
     
      
  	public void mostrarDetalhes(){
  		System.out.println("Mostrando Detalhes do Livro");
  		System.out.println("Nome:::: " + nome);
  		System.out.println("Valor:::: " + valor);
  		System.out.println("Isbn:::: " + isbn);
  		System.out.println(" -------  " );
  		
  		autor.mostrarDetalhes();
  		
  	}
	
}
