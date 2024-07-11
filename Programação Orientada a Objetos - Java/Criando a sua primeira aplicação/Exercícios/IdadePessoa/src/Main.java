//Crie uma classe idadePessoa com os atributos privados nome e idade
//Utilize métodos getters e setters para acessar e modificar esses atributos
//Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe IdadePessoa
        IdadePessoa pessoa = new IdadePessoa("Ana Maria", 25);

        // Exibindo informações da pessoa
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Verificando se a pessoa é maior de idade
        pessoa.verificarIdade();
    }
}
