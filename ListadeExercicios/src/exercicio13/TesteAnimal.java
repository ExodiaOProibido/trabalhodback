package exercicio13;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println("Som do cachorro:");
        cachorro.fazerSom();

        System.out.println("Som do gato:");
        gato.fazerSom();
    }
}