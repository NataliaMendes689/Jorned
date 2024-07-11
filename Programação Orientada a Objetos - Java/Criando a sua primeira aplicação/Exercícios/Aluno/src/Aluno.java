//Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
//Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

public class Aluno {
    private String nome;
    private int idade;

    // Construtor da classe Aluno
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
