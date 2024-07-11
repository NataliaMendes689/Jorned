public class Principal {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        // Verificação de primalidade
        int numeroVerificar = 13;
        if (verificador.verificarSeEhPrimo(numeroVerificar)) {
            System.out.println(numeroVerificar + " é primo.");
        } else {
            System.out.println(numeroVerificar + " não é primo.");
        }

        // Geração de próximos primos
        int inicio = 20;
        int proximoPrimo = gerador.gerarProximoPrimo(inicio);
        System.out.println("O próximo primo após " + inicio + " é " + proximoPrimo);

        // Listagem de primos até um limite
        int limite = 30;
        System.out.print("Números primos até " + limite + ": ");
        gerador.listarPrimos(limite);
    }
}
