package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double precoAntigo, precoAtual, acrescimo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço antigo: ");
        precoAntigo = sc.nextDouble();
        System.out.print("Digite o preço atual: ");
        precoAtual = sc.nextDouble();

        acrescimo = calculoReajuste(precoAntigo, precoAtual);

        System.out.println("Percentual de acrescimo = " + acrescimo + "%");

        sc.close();
    }

    public static double calculoReajuste(double pa, double pn) {
        double result;
        result = (100 * pn - 100 * pa) / pa;
        return result;
    }
}