//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

