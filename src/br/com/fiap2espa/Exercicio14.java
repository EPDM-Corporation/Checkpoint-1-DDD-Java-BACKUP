package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura que queira converter de Fahrenheit para Celsius: ");
        double user_f = scanner.nextDouble();
        double resultado = converter(user_f);
        System.out.println(user_f + "F° em Celsius é " + resultado + "C°");
    }
    static double converter(double user_input){
        return ((user_input - 32) * 5)/9;
    }
}
