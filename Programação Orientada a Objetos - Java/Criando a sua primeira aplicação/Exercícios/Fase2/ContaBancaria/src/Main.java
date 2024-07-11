//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado)
// e titular (publico). Implemente métodos getters e setters para os atributos privados.

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria(123456, 1000.0, "João Silva");

        // Exibindo informações da conta
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        // Modificando o saldo da conta
        conta.setSaldo(1500.0);

        // Exibindo o saldo atualizado
        System.out.println("Novo Saldo: R$ " + conta.getSaldo());
    }
}
