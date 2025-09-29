package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double n;
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = sc.nextDouble();

        x = verifica(n);

        if (x == 1) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        sc.close();
    }

    public static int verifica(double n) {
        int res;
        if (n >= 0) {
            res = 1;
        } else {
            res = 0;
        }
        return res;
    }
}