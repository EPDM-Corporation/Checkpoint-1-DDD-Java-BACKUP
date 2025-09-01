package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número para saber sua tabuada: ");
        int user_numero = scanner.nextInt();
        scanner.nextLine();
        tabuada(user_numero);
        scanner.close();
    }
    static void tabuada(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " - " + n * i);
        }
    }
}
