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

        compararIdade(idade1, nome1, idade2, idade3);
        compararIdade(idade2, nome2, idade1, idade3);
        compararIdade(idade3, nome3, idade1, idade2);

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
    static void compararIdade(int a, String name,int b, int c){
        if(a > b && a > c){
            System.out.println("A pessoa mais velha é " + name);
        }
    }
}
