package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int valor, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        valor = sc.nextInt();

        resultado = verifica(valor);

        if (resultado == 1) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        sc.close();
    }

    public static int verifica(int n) {
        int r;
        if (n >= 0) {
            r = 1;
        } else {
            r = 0;
        }
        return r;
    }
}