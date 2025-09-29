package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int a, b, c, result;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o número para A (maior que 1): ");
            a = sc.nextInt();
        } while (a <= 1);

        System.out.print("Digite o número para B: ");
        b = sc.nextInt();
        System.out.print("Digite o número para C: ");
        c = sc.nextInt();

        result = divisores(a, b, c);

        System.out.println("Soma dos múltiplos de " + a + " no intervalo [" + b + ", " + c + "] = " + result);

        sc.close();
    }

    public static int divisores(int a, int b, int c) {
        int i, s = 0;
        for (i = b; i <= c; i++) {
            if (i % a == 0) {
                s = s + i;
            }
        }
        return s;
    }
}