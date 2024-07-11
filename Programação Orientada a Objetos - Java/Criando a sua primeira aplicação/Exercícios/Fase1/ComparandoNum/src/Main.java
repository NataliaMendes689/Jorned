//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
// iguais, diferentes, o primeiro é maior ou o segundo é maior.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Vamos comparar dois números!");

        System.out.println("Digite o primeiro número: ");
        int primeiroNum = leitura.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNum = leitura.nextInt();

        if (primeiroNum == segundoNum) {
            System.out.println("Os Números são iguais.");
        } else if (primeiroNum < segundoNum) {
            System.out.println("Os Números são diferentes e o segundo é maior que o primeiro.");
        } else{
            System.out.println("Os Números são diferentes e o primeiro é maior que o segundo.");
        }
    }
}