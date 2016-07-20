package br.com.casadocodigo.livraria.testes;
import br.com.casadocodigo.livraria.*;
import br.com.casadocodigo.livraria.produtos.*;

public class RegrasDeDesconto {
	
	public static void main (String[]args){
		
		Autor autor = new Autor();
		autor.setNome("Silva");
		
		
		LivroFisico livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
		if(!livro.aplicaDescontoDe(0.3)){
			System.out.println("Desconto no livro nao pode ser maior"
					+ "que 30%");
		}else{
			System.out.println("valor do livro com desconto:"
					+ livro.getValor());
		}
		

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDescontoDe(0.3)){
			System.out.println("Desconto no ebook nao pode ser maior"
					+ "que 15%");
		}else{
			System.out.println("valor do ebook com desconto:"
					+ ebook.getValor());
		}
	
	
		
				
	}

}
