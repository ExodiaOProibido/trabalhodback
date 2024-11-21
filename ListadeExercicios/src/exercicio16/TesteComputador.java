package exercicio16;

public class TesteComputador {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel Core i9",  5.8, 24);
        Memoria memoria = new Memoria(32, "DDR5");

        Computador computador = new Computador(processador, memoria);

        computador.exibirDetalhes();
    }
}