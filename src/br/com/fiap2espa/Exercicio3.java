package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        int numero_loop = 0;
        while (numero_loop <= numero){
            System.out.println(numero_loop);
            numero_loop++;
        }
    }
}
