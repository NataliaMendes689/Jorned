//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna
// o dobro desse número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int resultado = calculadora.dobrar(numero);

        System.out.println("O dobro de " + numero + " é " + resultado);

        scanner.close();
    }
}
