package exercicio16;

public class Processador {
    private String modelo;
    private double frequencia; 
    private int nucleo; 

    public Processador(String modelo, double frequencia, int nucleo) {
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.nucleo = nucleo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public int getNucleo() {
        return nucleo;
    }

    public void exibirDetalhes() {
        System.out.println("Processador: " + modelo);
        System.out.println("Frequência: " + frequencia + " GHz");
        System.out.println("Núcleos: " + nucleo);
    }
}