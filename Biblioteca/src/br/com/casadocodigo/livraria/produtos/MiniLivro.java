package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.*;

public class MiniLivro extends Livro{
	
	public MiniLivro(Autor autor){
		super(autor);
	}
	
	
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}

}