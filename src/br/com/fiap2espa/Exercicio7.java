package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int input_a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o segundo número: ");
        int input_b = scanner.nextInt();
        scanner.nextLine();

        int result = maiorMenor(input_a, input_b);
        System.out.println("O maior número é " + result);

        scanner.close();
    }
    static int maiorMenor(int a, int b){
        if(a > b){
            return a;
        } else{
            return b;
        }
    }
}
