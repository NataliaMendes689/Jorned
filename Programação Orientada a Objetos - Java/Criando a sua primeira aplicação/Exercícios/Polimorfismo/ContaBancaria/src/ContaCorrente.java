public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente() {
        super();
        this.tarifaMensal = 10.0; // Exemplo de tarifa mensal padrão
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$ " + tarifaMensal + " cobrada.");
    }

    // Método adicional específico de Conta Corrente (opcional)
    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }
}
