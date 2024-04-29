import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaBancaria {

    // Atributos da conta
    private static String nomeCliente;
    private static String tipoConta;
    private static double saldo;

    // Método para inicializar os dados do cliente
    public static void inicializarDadosCliente() {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe o nome do cliente: ");
        nomeCliente = leitura.nextLine();

        System.out.print("Informe o tipo de conta (corrente/poupança): ");
        tipoConta = leitura.nextLine();

        System.out.print("Informe o saldo inicial: ");
        saldo = leitura.nextDouble();
    }

    // Método para exibir o menu de opções
    public static void exibirMenu() {
        System.out.println("***********************");
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo Conta: " + tipoConta);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedSaldo = decimalFormat.format(saldo);
        System.out.println("Saldo: R$ " + formattedSaldo);
        System.out.println("***********************");

        System.out.println("    Operações:");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - Transferir Valor");
        System.out.println("4 - Sair");

        System.out.print("Digite a opção desejada: ");
    }

    // Método para consultar saldo
    public static void consultarSaldo() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedSaldo = decimalFormat.format(saldo);
        System.out.println("Saldo atual: R$ " + formattedSaldo);
    }

    // Método para receber valor
    public static void receberValor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor a receber: ");
        double valorReceber = scanner.nextDouble();

        saldo += valorReceber;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedSaldo = decimalFormat.format(saldo);
        System.out.println("Saldo atualizado: R$ " + formattedSaldo);
    }

    // Método para transferir valor
    public static void transferirValor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor a transferir: ");
        double valorTransferir = scanner.nextDouble();

        if (valorTransferir > saldo) {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
        } else {
            saldo -= valorTransferir;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedSaldo = decimalFormat.format(saldo);
            System.out.println("Saldo atualizado: R$ " + formattedSaldo);
        }
    }

    // Método para sair da aplicação
    public static void sair() {
        System.out.println("Obrigado por usar o nosso sistema de gerenciamento de conta bancária!");
        System.exit(0); // Encerra a aplicação
    }

    // Método principal (ponto de entrada)
    public static void main(String[] args) {
        inicializarDadosCliente(); // Inicializa dados do cliente

        while (true) { // Loop principal
            exibirMenu(); // Exibe o menu de opções

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    receberValor();
                    break;
                case 3:
                    transferirValor();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}