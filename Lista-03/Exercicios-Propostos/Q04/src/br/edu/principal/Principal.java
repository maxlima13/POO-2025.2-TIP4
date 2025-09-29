package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double raio, volume;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        raio = sc.nextDouble();

        volume = calculaVolume(raio);

        System.out.println("Volume da esfera = " + volume);

        sc.close();
    }

    public static double calculaVolume(double r) {
        double v;
        v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return v;
    }
}