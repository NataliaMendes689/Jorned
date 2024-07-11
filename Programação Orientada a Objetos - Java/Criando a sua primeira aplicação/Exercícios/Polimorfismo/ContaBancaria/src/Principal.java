public class Principal {
    public static void main(String[] args) {
        // Criando uma conta corrente
        ContaCorrente minhaConta = new ContaCorrente();

        // Realizando operações bancárias
        minhaConta.depositar(1000.0);
        minhaConta.sacar(500.0);
        minhaConta.cobrarTarifaMensal();

        // Consultando saldo
        double saldoAtual = minhaConta.consultarSaldo();
        System.out.println("Saldo atual: R$ " + saldoAtual);

        // Exemplo de alteração da tarifa mensal
        minhaConta.setTarifaMensal(15.0);
        minhaConta.cobrarTarifaMensal();

        saldoAtual = minhaConta.consultarSaldo();
        System.out.println("Saldo atual após nova tarifa: R$ " + saldoAtual);
    }
}
