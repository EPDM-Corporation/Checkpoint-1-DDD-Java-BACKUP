package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double user_a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Insira o segundo número: ");
        double user_b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Insira o terceiro número: ");
        double user_c = scanner.nextDouble();
        scanner.nextLine();

        double result = media(user_a,user_b,user_c);
        System.out.println("A média é  " + result);
    }
    static double media(double a, double b, double c){
         return (a + b + c)/3;
    }
}
