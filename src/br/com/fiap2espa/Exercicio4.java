package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número para fatoriar: ");
        int user_fatorial = scanner.nextInt();

        int resultado_fatorial = fatorial(user_fatorial);
        System.out.println("A fatorial de " + user_fatorial + " é " + resultado_fatorial);
        scanner.close();
    }
     static int fatorial(int input_fatorial){
        int result = 1;
        while (input_fatorial > 0){
            result *= input_fatorial;
            input_fatorial -= 1;
        }
        return result;
    }
}
