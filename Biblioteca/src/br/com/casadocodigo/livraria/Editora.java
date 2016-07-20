package br.com.casadocodigo.livraria;

public class Editora {
	
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void mostrarDetalhes(){

		System.out.println("Mostrando Detalhes da Editora ");
		System.out.println("EDITORA:::"+ getNomeFantasia());
		System.out.println("Nome:::: " + getRazaoSocial());
		System.out.println("Nome:::: " + getCnpj());
		System.out.println(" -------  " );



}
	
}
