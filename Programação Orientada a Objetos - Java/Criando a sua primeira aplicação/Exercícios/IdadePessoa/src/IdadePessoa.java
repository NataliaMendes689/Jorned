//Crie uma classe idadePessoa com os atributos privados nome e idade
//Utilize métodos getters e setters para acessar e modificar esses atributos
//Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não

public class IdadePessoa {
    private String nome;
    private int idade;

    // Construtor da classe IdadePessoa
    public IdadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters para nome e idade
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para verificar se a pessoa é maior de idade
    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " não é maior de idade.");
        }
    }
}
