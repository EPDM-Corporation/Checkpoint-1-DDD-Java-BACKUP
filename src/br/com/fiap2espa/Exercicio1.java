package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número em metros que quer converter: ");
        double user_numero = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite 'CM' para centimetros ou 'MM' para milimetros: ");
        String user_string = scanner.next();

        if (user_string.equals("CM")){
            double result = user_numero * 100;
            System.out.println("O número " + user_numero + " foi convertido para " + result + " centimetros.");
        } else if(user_string.equals("MM")){
            double result = user_numero * 1000;
            System.out.println("O número " + user_numero + " foi convertido para " + result + " milimetros.");
        } else{
            System.out.println("Não foi possível entender a resposta");
        }

        scanner.close();
    }
}
