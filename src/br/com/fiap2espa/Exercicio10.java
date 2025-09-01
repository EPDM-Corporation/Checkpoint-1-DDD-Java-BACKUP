package br.com.fiap2espa;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int VISTA = 1;
        int PARCELADO2 = 2;
        int PARCELADO3 = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do produto: ");
        double user_preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Insira a forma de pagamento (1 - Vista, 2 - Parcelado em 2x, 3 - Parcelado em 4x): ");
        int user_opcao = scanner.nextInt();
        scanner.nextLine();

        if (user_opcao == VISTA) {
            double result = user_preco - (0.1 * user_preco);
            System.out.println("Você vai pagar R$ " + result + " à vista.");
        }else if (user_opcao == PARCELADO2){
            double result = user_preco/2;
            System.out.println("Você vai pagar em 2x Parcelado R$ " + result );
        } else if (user_opcao == PARCELADO3){
            double result = (user_preco * 1.08)/4 ;
            System.out.println("Você vai pagar cada parcela de 4x com 8% de juros: R$" + result);
        }else{
            System.out.println("Não foi entendido a forma de pagamento");
        }
        scanner.close();
    }
}
