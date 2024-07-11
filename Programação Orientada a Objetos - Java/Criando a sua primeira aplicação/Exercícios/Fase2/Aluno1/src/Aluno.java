//Desenvolva uma classe Aluno com os atributos privados nome e notas
//Utilize métodos getters e setters para acessar e modificar esses atributo
//Adicione um método calcularMedia que retorna a média das notas do aluno

public class Aluno {
    private String nome;
    private int[] notas;

    // Construtor da classe Aluno
    public Aluno(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // Métodos getters e setters para nome e notas
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    // Método para calcular a média das notas do aluno
    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
