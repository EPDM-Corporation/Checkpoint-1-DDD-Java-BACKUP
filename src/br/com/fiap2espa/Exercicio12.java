package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira o comprimento: ");
        double comprimento = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira a largura: ");
        double largura = scanner.nextDouble();
        scanner.nextLine();

        double resultado = altura * largura * comprimento;
        System.out.println("O volume da caixa é " + resultado);
    }
}
