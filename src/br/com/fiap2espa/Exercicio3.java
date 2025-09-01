package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine();

        while (numero1 <= numero2){
            System.out.println(numero1);
            numero1++;
        }
        scanner.close();
    }
}