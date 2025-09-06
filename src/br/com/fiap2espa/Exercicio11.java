package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome1 = inputNome(scanner);
        int idade1 = inputIdade(scanner);
        String nome2 = inputNome(scanner);
        int idade2 = inputIdade(scanner);
        String nome3 = inputNome(scanner);
        int idade3 = inputIdade(scanner);

        encontrarVelha(nome1,idade1, nome2,idade2,nome3,idade3);

    }
    static String inputNome(Scanner s){
        System.out.println("Insira o nome da pessoa: ");
        String nome = s.next();
        s.nextLine();
        return nome;
    }
    static int inputIdade(Scanner s){
        System.out.println("Insira a idade da pessoa: ");
        int idade = s.nextInt();
        s.nextLine();
        return idade;
    }
    static void encontrarVelha(String nome1, int idade1, String nome2, int idade2, String nome3, int idade3){
        if(idade1 >= idade2 && idade1 >= idade3){
            System.out.println("A pessoa mais velha é " + nome1);
        } else if (idade2 >= idade1 && idade2 >= idade3){
            System.out.println("A pessoa mais velha é " + nome2);
        } else {
            System.out.println("A pessoa mais velha é " + nome3);
        }
    }
}
