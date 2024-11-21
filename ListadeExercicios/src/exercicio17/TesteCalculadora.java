package exercicio17;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double soma = calculadora.somar(10, 5);
        System.out.println("Soma: " + soma);

        double subtracao = calculadora.subtrair(10, 5);
        System.out.println("Subtração: " + subtracao);

        double multiplicacao = calculadora.multiplicar(10, 5);
        System.out.println("Multiplicação: " + multiplicacao);

        double divisao = calculadora.dividir(10, 5);
        System.out.println("Divisão: " + divisao);

        double divisaoPorZero = calculadora.dividir(10, 0);
        System.out.println("Divisão por zero: " + divisaoPorZero);
    }
}