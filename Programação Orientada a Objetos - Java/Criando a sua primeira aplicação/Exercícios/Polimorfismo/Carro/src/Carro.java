import java.util.Arrays;

public class Carro {
    private String nomeModelo;
    private double[] precosAno;

    public Carro(String nomeModelo) {
        this.nomeModelo = nomeModelo;
        this.precosAno = new double[3]; // Array para armazenar preços dos anos 1, 2 e 3
    }

    public void setPrecoMedioAno(int ano, double precoMedio) {
        if (ano >= 1 && ano <= 3) {
            precosAno[ano - 1] = precoMedio;
        } else {
            System.out.println("Ano inválido. Insira um valor entre 1 e 3.");
        }
    }

    public double getPrecoMedioAno(int ano) {
        if (ano >= 1 && ano <= 3) {
            return precosAno[ano - 1];
        } else {
            System.out.println("Ano inválido. Insira um valor entre 1 e 3.");
            return 0.0;
        }
    }

    public void exibirMenorPreco() {
        double menorPreco = Arrays.stream(precosAno).min().orElse(0.0);
        System.out.println("Menor preço do " + nomeModelo + ": R$ " + menorPreco);
    }

    public void exibirMaiorPreco() {
        double maiorPreco = Arrays.stream(precosAno).max().orElse(0.0);
        System.out.println("Maior preço do " + nomeModelo + ": R$ " + maiorPreco);
    }
}
