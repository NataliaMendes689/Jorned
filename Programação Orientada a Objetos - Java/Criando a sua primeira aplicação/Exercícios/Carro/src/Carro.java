//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica
// e calcular a idade do carro

import java.time.Year;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    // Construtor da classe Carro
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Método para exibir a ficha técnica
    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    // Método para calcular a idade do carro
    public int calcularIdade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - ano;
    }
}
