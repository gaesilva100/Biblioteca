
public class CadastroDeLivros {
	
	public static void main(String[] args){
		
		Autor autor1  = new Autor();
		autor1.setNome("Gabriel"); 
		autor1.setEmail("GabrielErickSilva@gmail.com"); 
	
		Livro livro = new Livro(autor1);
		livro.setNome("JAVA 8 Prático"); 
		livro.setValor(60.00);
		livro.setIsbn("978-85-66250-46-6");
						
		livro.mostrarDetalhes();
		/*
		Autor outroAutor  = new Autor();
		outroAutor.setNome("Erick"); 
		outroAutor.setEmail("GABRIEL.SILVA@gmail.com"); 
	*/
		Livro outroLivro = new Livro();
		outroLivro.setNome("TeStando"); 
		outroLivro.setValor(100.00);
		//outroLivro.setIsbn("");
		
						
		
		outroLivro.mostrarDetalhes();
				
		
		
	}

}
