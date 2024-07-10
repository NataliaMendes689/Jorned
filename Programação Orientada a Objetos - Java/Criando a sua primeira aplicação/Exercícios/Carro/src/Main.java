//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica
// e calcular a idade do carro

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira os valores do carro
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt()

        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();

        // Criando uma instância da classe Carro
        Carro carro = new Carro(modelo, ano, cor);

        // Exibindo a ficha técnica
        carro.exibirFichaTecnica();

        // Calculando e exibindo a idade do carro
        int idade = carro.calcularIdade();
        System.out.println("Idade do carro: " + idade + " anos");

        scanner.close();
    }
}

    //public class Main {
    //    public static void main(String[] args) {
    //        // Criando uma instância da classe Carro
    //        Carro carro = new Carro("Fusca", 1976, "Azul");
    //
    //        // Exibindo a ficha técnica
    //        carro.exibirFichaTecnica();
    //
    //        // Calculando e exibindo a idade do carro
    //        int idade = carro.calcularIdade();
    //        System.out.println("Idade do carro: " + idade + " anos");
    //    }
    //}