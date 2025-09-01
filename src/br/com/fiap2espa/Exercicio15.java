package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int user_num = scanner.nextInt();

        while (user_num >= 0){
            System.out.println(user_num);
            user_num--;
        }
    }
}
