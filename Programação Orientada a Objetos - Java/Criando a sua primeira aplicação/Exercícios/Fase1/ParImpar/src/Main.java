//Crie um programa que solicite ao usuário a entrada de um número inteiro.
//Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
    }
}