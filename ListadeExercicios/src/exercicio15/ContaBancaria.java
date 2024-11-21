package exercicio15;

public class ContaBancaria {
    private double saldo;
    private int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public int getNumero() {
        return numero;
    }
}