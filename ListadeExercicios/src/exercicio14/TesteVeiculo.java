package exercicio14;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Bicicleta();

        System.out.println("Movendo o veiculo1 (Carro):");
        veiculo1.mover();

        System.out.println("Movendo o veiculo2 (Bicicleta):");
        veiculo2.mover(); 
    }
}