package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PAR = 0;
        int IMPAR = 0;
        for (int i = 0;i < 10; i++){
            System.out.println((i + 1) + " - Insira um número: ");
            int user_number = scanner.nextInt();
            scanner.nextLine();
            if (user_number % 2 == 0){
                PAR += 1;
            }else{
                IMPAR += 1;
            }
        }
        System.out.println("Há " + PAR + " números pares e " + IMPAR + " números impares");
    }
}
