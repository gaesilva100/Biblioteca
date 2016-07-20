package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.*;

public class Revista implements Produto,Promocional {

	private String nome;
	private String descricao;	
	private double valor;
	private Editora editora;

	public boolean  aplicaDescontoDe(double porcentagem){

		if (porcentagem > 0.1){

			return false;		   
		}

		double desconto = getValor() * porcentagem;
		setValor (getValor() - desconto);
		return true;
	}
  
	



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}



	public Editora getEditora() {
		return editora;
	}



	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	void mostrarEditora(){
		editora.mostrarDetalhes();
                 	
	}
	
	public void mostrar(){
		System.out.println("Mostrando Detalhes da Revista");
		System.out.println("NOme da Revista É"+ getNome());
		System.out.println("Descricao " + getDescricao());
		System.out.println(" editora " + getEditora());
		System.out.println(" Valor" + getValor());
	}
	


/*
 * private String nome;
	private String descricao;	
	private double valor;
	private Editora editora;

 */
}
