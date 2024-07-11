//Crie um programa que solicite ao usuário digitar um número.
//Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.printf("Digite um número inteiro: ");
        int numero = leitura.nextInt();

        if (numero < 0){
            System.out.println("Número negativo");
        } else if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número nulo");
        }
    }
}