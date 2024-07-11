//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
//Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double resultado = 0;
        double pi = 3.1416;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("""
                ----------------------------------------
                    1 - Calcular área de um quadrado
                    2 - Calcular área de um círculo
                ----------------------------------------
                """);
        int escolha = leitura.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a medida de um dos lados do quadrado: ");
            double ladoQuad = leitura.nextDouble();
            resultado = Math.pow(ladoQuad,2);
            System.out.println("A área do quadrado é: " + df.format(resultado));
        } else if (escolha == 2){
            System.out.println("Digite a medida do raio do círculo: ");
            double raio = leitura.nextDouble();
            resultado = pi * Math.pow(raio,2);
            System.out.println("A área do círculo é: " + df.format(resultado));
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
}