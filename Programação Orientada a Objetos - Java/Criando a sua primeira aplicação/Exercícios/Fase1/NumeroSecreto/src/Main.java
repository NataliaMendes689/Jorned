import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random numGerado = new Random();
        int numSecreto = numGerado.nextInt(100);
        int tentativas = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                              Bem vindo ao jogo do número secreto!
                              Tente adivinhar o número entre 0 e 100.
                           """);

        while (tentativas < 5) {
            System.out.println("Digite um número: ");
            int palpite = leitura.nextInt();

            tentativas++;

            if (palpite == numSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas");
                break;
            } else if (palpite < numSecreto) {
                System.out.println("Número secreto maior que " + palpite);
            } else {
                System.out.println("Número secreto menor que " + palpite);
            }

            // Mensagem caso o jogador não tenha acertado em 5 tentativas
            if (tentativas == 5) {
                System.out.println("""
                                    Você não conseguiu adivinhar o número secreto em 5 tentativas.
                                    O número secreto era: """ + numSecreto);
            }
        }
    }
}
