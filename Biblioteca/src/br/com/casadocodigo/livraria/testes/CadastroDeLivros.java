package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.*;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Revista;

public class CadastroDeLivros {
	
	public static void main(String[] args){
		
		Autor autor1  = new Autor();
		autor1.setNome("Gabriel"); 
		autor1.setEmail("GabrielErickSilva@gmail.com"); 
	
		LivroFisico livro = new LivroFisico(autor1);
		livro.setNome("JAVA 8 Pr�tico"); 
		livro.setValor(60.00);
		livro.setIsbn("978-85-66250-46-6");
						
		
		// O METODO MOSTRAR_DETALHES, como ele vai fucinonar 
		livro.mostrarDetalhes();
		
		
		
		LivroFisico outroLivro = new LivroFisico(autor1);
		outroLivro.setNome("TeStando"); 
		outroLivro.setValor(100.00);
		//outroLivro.setIsbn("");
		outroLivro.mostrarDetalhes();
		
		
		Editora edi = new Editora();
		edi.setNomeFantasia("EPOCA");
		edi.mostrarDetalhes();
		
		Revista revista = new Revista();
		revista.setNome("Silvas");
		revista.mostrar();
		
		
		
				
		
		
				
		
		
	}

}
