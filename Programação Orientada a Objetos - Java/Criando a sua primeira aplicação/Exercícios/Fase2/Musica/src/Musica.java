//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e
// numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular
// a média de avaliações.

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0.0;
        this.numAvaliacoes = 0;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + (numAvaliacoes > 0 ? avaliacao / numAvaliacoes : "Nenhuma avaliação"));
    }

    public void avaliar(int avaliacao) {
        if (avaliacao < 0 || avaliacao > 5) {
            System.out.println("A avaliação deve ser entre 0 e 5.");
        } else {
            this.avaliacao += avaliacao;
            this.numAvaliacoes++;
            System.out.println("Avaliação adicionada com sucesso.");
        }
    }

    public double calcularMediaAvaliacoes() {
        return numAvaliacoes > 0 ? avaliacao / numAvaliacoes : 0.0;
    }
}

