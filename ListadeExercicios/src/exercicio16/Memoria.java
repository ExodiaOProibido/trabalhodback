package exercicio16;

public class Memoria {
    private int capacidade; 
    private String tipo;

    public Memoria(int capacidade, String tipo) {
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void exibirDetalhes() {
        System.out.println("Memória: " + capacidade + " GB " + tipo);
    }
}