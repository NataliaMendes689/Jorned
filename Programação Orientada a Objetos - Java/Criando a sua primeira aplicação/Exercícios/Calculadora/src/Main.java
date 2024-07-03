//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna
// o dobro desse número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = leitura.nextDouble();

        double resultado = calculadora.dobrar(numero);

        System.out.println("O dobro de " + numero + " é " + resultado);

        leitura.close();
    }
}
