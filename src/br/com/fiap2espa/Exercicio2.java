package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a sua idade para saber se pode votar: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >= 16){
            System.out.println("Você pode votar!");
        } else{
            System.out.println("Você não pode votar!");
        }
        scanner.close();
    }
}
