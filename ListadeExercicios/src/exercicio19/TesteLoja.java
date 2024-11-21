package exercicio19;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();

        double preco1 = loja.calcularPreco(50.0, 3);
        System.out.println("Preço sem desconto: " + preco1);

        double preco2 = loja.calcularPreco(50.0, 3, 10); 
        System.out.println("Preço com desconto de 10%: " + preco2);
    }
}