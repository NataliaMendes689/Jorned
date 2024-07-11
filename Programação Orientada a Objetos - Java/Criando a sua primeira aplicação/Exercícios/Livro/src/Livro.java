//Desenvolva uma classe Livro com os atributos privados titulo e autor
//Utilize métodos getters e setters para acessar e modificar esses atributos
//Adicione um método exibirDetalhes que imprime o título e o autor do livro

public class Livro {
    private String titulo;
    private String autor;

    // Construtor da classe Livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos getters e setters para titulo e autor
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
