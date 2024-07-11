//Desenvolva uma classe Livro com os atributos privados titulo e autor
//Utilize métodos getters e setters para acessar e modificar esses atributos
//Adicione um método exibirDetalhes que imprime o título e o autor do livro

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe Livro
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        // Exibindo detalhes do livro
        System.out.println("Detalhes do Livro:");
        livro.exibirDetalhes();
    }
}
