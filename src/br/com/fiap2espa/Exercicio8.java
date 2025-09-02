package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a sua altura em metros: ");
        double user_altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira o seu peso em kilos: ");
        double user_peso = scanner.nextDouble();
        scanner.nextLine();
        double IMC = user_peso/(user_altura * user_altura);

        if (IMC < 18.5){
            System.out.println("Seu IMC é " + IMC + " e a classificação é: abaixo do peso");
        } else if (IMC >= 18.5 && IMC <=24.9){
            System.out.println("Seu IMC é " + IMC + " e a classificação é: peso normal");
        } else if (IMC >= 25 && IMC <= 29.9){
            System.out.println("Seu IMC é " + IMC + " e a classificação é: Sobrepeso");
        }else{
            System.out.println("Seu IMC é " + IMC + " e a classificação é: Obesidade");
        }
        scanner.close();
    }
}
