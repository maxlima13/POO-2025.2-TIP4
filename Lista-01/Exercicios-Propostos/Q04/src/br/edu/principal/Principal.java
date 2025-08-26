package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		// declaração das notas
		double n1 = 9.0;
		double n2 = 8.0;
		
		// pesos
		int peso1 = 2;
		int peso2 = 3;
		
		// saída já com o cálculo da média ponderada
		System.out.println("A média ponderada é: " + ((n1 * peso1 + n2 * peso2) / (peso1 + peso2)));

	}

}
