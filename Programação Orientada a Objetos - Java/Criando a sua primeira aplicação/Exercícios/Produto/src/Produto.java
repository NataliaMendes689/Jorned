//Desenvolva uma classe Produto com os atributos privados nome e preco
//Utilize métodos getters e setters para acessar e modificar esses atributos
//Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto

public class Produto {
    private String nome;
    private double preco;

    // Construtor da classe Produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos getters e setters para nome e preco
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para aplicar desconto ao preço do produto
    public void aplicarDesconto(double percentualDesconto) {
        double desconto = preco * (percentualDesconto / 100);
        preco -= desconto;
    }
}
