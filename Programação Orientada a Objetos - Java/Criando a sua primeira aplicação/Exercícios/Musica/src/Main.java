//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e
// numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular
// a média de avaliações.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma instância da classe Musica
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 1975);

        // Exibindo a ficha técnica
        musica.exibirFichaTecnica();

        // Avaliando a música
        System.out.print("Digite uma avaliação para a música (0 a 5): ");
        int avaliacao = scanner.nextInt();
        musica.avaliar(avaliacao);

        // Exibindo a ficha técnica atualizada
        musica.exibirFichaTecnica();

        // Calculando e exibindo a média de avaliações
        double mediaAvaliacoes = musica.calcularMediaAvaliacoes();
        System.out.println("Média de avaliações: " + mediaAvaliacoes);

        scanner.close();
    }
}

