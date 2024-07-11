public class Principal {
    public static void main(String[] args) {
        // Criando instância de ModeloCarro
        ModeloCarro meuCarro = new ModeloCarro("Sedan");

        // Definindo preços médios para cada ano
        meuCarro.setPrecoMedioAno(1, 50000.0);
        meuCarro.setPrecoMedioAno(2, 55000.0);
        meuCarro.setPrecoMedioAno(3, 60000.0);

        // Exibindo menor e maior preço
        meuCarro.exibirMenorPreco();
        meuCarro.exibirMaiorPreco();
    }
}
