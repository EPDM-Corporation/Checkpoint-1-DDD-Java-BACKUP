package br.com.fiap2espa;

public class Exercicio13Main {
    public static void main(String[] args) {
        Car carro1 = new Car("Fiat","Uno",1983);
        Car carro2 = new Car("Toyota","Corolla",1998);
        System.out.println("Brand carro 1: " + carro1.brand);
        System.out.println("Model carro 1: " + carro1.model);
        System.out.println("Year carro 1: " + carro1.year);

        System.out.println("Brand carro 2: " + carro2.brand);
        System.out.println("Model carro 2: " + carro2.model);
        System.out.println("Year carro 2: " + carro2.year);
    }
}
