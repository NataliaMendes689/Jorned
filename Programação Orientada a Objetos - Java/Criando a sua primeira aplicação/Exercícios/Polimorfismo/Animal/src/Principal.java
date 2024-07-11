public class Principal {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom(); // Saída: Au au!
        animal2.emitirSom(); // Saída: Miau!

        // Para acessar métodos específicos de Cachorro e Gato,
        // é necessário fazer casting para o tipo correto.
        if (animal1 instanceof Cachorro) {
            ((Cachorro) animal1).abanarRabo();
        }

        if (animal2 instanceof Gato) {
            ((Gato) animal2).arranharMoveis();
        }
    }
}
