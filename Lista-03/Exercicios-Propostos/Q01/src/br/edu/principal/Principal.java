package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n, soma;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        n = sc.nextInt();

        soma = somatorio(n);

        System.out.println("Soma de 1 até " + n + " = " + soma);

        sc.close();
    }

    public static int somatorio(int n) {
        int i, s = 0;
        for (i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }
}