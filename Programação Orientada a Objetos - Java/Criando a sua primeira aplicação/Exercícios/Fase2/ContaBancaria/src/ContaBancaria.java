//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado)
// e titular (publico). Implemente métodos getters e setters para os atributos privados.

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    // Construtor da classe ContaBancaria
    public ContaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Métodos getters e setters para numeroConta e saldo
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
