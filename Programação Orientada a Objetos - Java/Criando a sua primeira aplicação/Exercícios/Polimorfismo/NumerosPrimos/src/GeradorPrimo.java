public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int inicio) {
        int numero = inicio + 1;
        while (!verificarPrimalidade(numero)) {
            numero++;
        }
        return numero;
    }
}
