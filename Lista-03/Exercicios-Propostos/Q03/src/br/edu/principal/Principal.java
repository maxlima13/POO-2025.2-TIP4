package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n1, n2, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        resultado = verificaDivisor(n1, n2);

        if (resultado == 0) {
            System.out.println(n1 + " é divisível por " + n2);
        } else {
            System.out.println("Próximo número divisível por " + n2 + " é: " + resultado);
        }

        sc.close();
    }

    public static int verificaDivisor(int n1, int n2) {
        int prox;
        if (n1 % n2 == 0) {
            return 0;
        } else {
            prox = n1 + 1;
            while (prox % n2 != 0) {
                prox++;
            }
            return prox;
        }
    }
}