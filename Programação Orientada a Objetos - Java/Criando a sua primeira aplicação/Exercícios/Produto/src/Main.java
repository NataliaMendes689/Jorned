//Desenvolva uma classe Produto com os atributos privados nome e preco
//Utilize métodos getters e setters para acessar e modificar esses atributos
//Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe Produto
        Produto produto = new Produto("Celular", 1500.0);

        // Exibindo informações do produto
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());

        // Aplicando desconto de 10%
        produto.aplicarDesconto(10);

        // Exibindo preço com desconto
        System.out.println("Preço com desconto: R$ " + produto.getPreco());
    }
}
