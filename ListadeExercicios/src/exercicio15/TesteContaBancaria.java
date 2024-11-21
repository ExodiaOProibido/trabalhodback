package exercicio15;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(40028922);

        System.out.println("Número da Conta: " + conta.getNumero());

        conta.depositar(1100.00);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.depositar(-50.00);

        System.out.println("Saldo atual após tentativa de depósito inválido: R$ " + conta.getSaldo());
    }
}