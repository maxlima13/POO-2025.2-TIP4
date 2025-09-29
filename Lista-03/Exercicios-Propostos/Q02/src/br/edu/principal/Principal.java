package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int h, m, s, total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        h = sc.nextInt();
        System.out.print("Digite os minutos: ");
        m = sc.nextInt();
        System.out.print("Digite os segundos: ");
        s = sc.nextInt();

        total = converter(h, m, s);

        System.out.println("Tempo total em segundos = " + total);

        sc.close();
    }

    public static int converter(int h, int m, int s) {
        int total;
        total = h * 3600 + m * 60 + s;
        return total;
    }
}