package execicio11;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        Livro livro2 = new Livro("1984", "George Orwell", 328);

        System.out.println("Detalhes do Livro 1:");
        livro1.exibirDetalhes();
        
        System.out.println("\nDetalhes do Livro 2:");
        livro2.exibirDetalhes();
    }
}