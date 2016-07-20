package br.com.casadocodigo.livraria.testes;
import java.util.Date;
import java.util.Random;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.*;


public class Test {
	
	public static void main (String[] args){
		
		Object objeto1 = 10;
		Object objeto = "Uma String";
		
		System.out.println(objeto);
		System.out.println(objeto1);
		
		boolean resultado = Boolean.parseBoolean("False");
		
		System.out.println(resultado);
		
		String numeroEmTexto = String.valueOf(11);
		
		System.out.println(numeroEmTexto);
		System.out.println();
		
		///----- ---- -- ---- --- -
		System.out.println("Testando pacote JAVA.LANG");
		
		long round = Math.round(3.99);
		System.out.println("Round  3.99 :" + round);
		long max = Math.max(100, 10);
		System.out.println("Max  100 a 10  :"+ max);
		int min = Math.min(100, 10);
		System.out.println("Min  100 a 10 :"+ min);
		int abs = Math.abs(-5);
		System.out.println("Abs  -5 :"+ abs);
		double sqrt = Math.sqrt(4);
		System.out.println("Sqrt  4 :" + sqrt);
		
		// ----------------------- --- 
		System.out.println();
		
		System.out.println("Testando o Random ");
		Random random = new Random();
		/* Da mesma forma como o nexInt, também exite um 
		 * método NEXT para cada tipo primitivo, Boolean,Double
		 */
		System.out.println(random.nextInt(10));
		
		//String java = new String ("java");
		System.out.println();
		
		System.out.println("Testando o Equals");
		String java ="java";
		String java2 = "java";
		
		System.out.println(java.equals(java2));
		System.out.println(java == java2);
		System.out.println();
		
		System.out.println("Testando o Replace");
		java.replace("v", "c");
		System.out.println(java);
		// Agora vai Funcionar...
		String novaString = java.replace("v", "c");
		System.out.println(novaString);
		System.out.println();
		
		System.out.println("Testando alguns metodos");
		String replace = java.replace("v", "c");
		System.out.println("Replace (java) " +replace);
		
		String uppercase = java.toUpperCase();
		System.out.println("Uppercase(java) " + uppercase);
		
		String lowerCase = "JAVA".toLowerCase();
		System.out.println("lowerCase (JAVA) " +lowerCase);
		
		char charAt = java.charAt(0);
		System.out.println("charAt (java) " + charAt);
		
		boolean endsWith = java.endsWith("a");
		System.out.println("endsWith (java) " + endsWith);
		
		boolean startsWith = java.startsWith("s");
		System.out.println("startsWith (java) " + startsWith);
		
		boolean equals = java.equalsIgnoreCase("Java");
		System.out.println("equals (java) " + equals);
		
	}

}
