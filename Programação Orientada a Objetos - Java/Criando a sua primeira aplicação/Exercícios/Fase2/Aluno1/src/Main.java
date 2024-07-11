//Desenvolva uma classe Aluno com os atributos privados nome e notas
//Utilize métodos getters e setters para acessar e modificar esses atributo
//Adicione um método calcularMedia que retorna a média das notas do aluno

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe Aluno
        int[] notas = { 7, 8, 9, 6, 8 };
        Aluno aluno = new Aluno("Maria Silva", notas);

        // Exibindo informações do aluno
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Notas: " + java.util.Arrays.toString(aluno.getNotas()));

        // Calculando e exibindo a média das notas
        double media = aluno.calcularMedia();
        System.out.println("Média das notas: " + media);
    }
}
