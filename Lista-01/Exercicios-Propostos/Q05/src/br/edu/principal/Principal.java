package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		// declarando o preço do produto
		double preco = 100.0;
		
		// saída já com a aplicação do desconto 
		System.out.println("O novo preço com desconto é: " + (preco - (preco * 0.10)));

	}

}
