package br.com.casadocodigo.livraria.testes;
import java.util.List;

import br.com.casadocodigo.livraria.*;
import br.com.casadocodigo.livraria.produtos.*;

public class RegistroDeVendas {
	
	public static void main (String[] args){
		
		Autor autor = new Autor();
		autor.setNome("Ricardo");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-DRIVE Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook (autor);
		ebook.setNome("Test-Drive Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(ebook);
		carrinho.adiciona(fisico);
		
		System.out.println("Total " +carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		// Primeiro metodo 
		for (Produto produto : produtos){
			System.out.println(produto);
			try{
			
			if(produto != null){
				System.out.println(produto.getValor());
			}
		} catch(Exception e){
			System.out.println("O objeto passado não implementa Produto");
			e.printStackTrace();
		}
		}
		
		System.out.println("Fui executado! ");
		
		
		//Segundo Metodo...
		/*
		for (Produto produto : produtos){
			if(produto != null){
				System.out.println(produto.getValor());
			}
		}
		*/
	
	}
	
}
