//Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
//Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

import java.util.Scanner;

    //public class Main {
    //    public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //
    //        // Solicitando ao usuário que insira os valores do aluno
    //        System.out.print("Digite o nome do aluno: ");
    //        String nome = scanner.nextLine();
    //
    //        System.out.print("Digite a idade do aluno: ");
    //        int idade = scanner.nextInt();
    //
    //        // Criando uma instância da classe Aluno
    //        Aluno aluno = new Aluno(nome, idade);
    //
    //        // Exibindo as informações do aluno
    //        aluno.exibirInformacoes();
    //
    //        scanner.close();
    //    }
    //}

public class Main {
    public static void main(String[] args) {
        // Inserindo dados fixos do aluno
        String nome = "Natalia Mendes";
        int idade = 22;

        // Criando uma instância da classe Aluno
        Aluno aluno = new Aluno(nome, idade);

        // Exibindo as informações do aluno
        aluno.exibirInformacoes();
    }
}

