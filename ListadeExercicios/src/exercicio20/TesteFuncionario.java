package exercicio20;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 2500.00);
        System.out.println("Salário do funcionário: " + funcionario.calcularSalario());

        Gerente gerente = new Gerente("Ana", 4000.00, 1500.00);
        System.out.println("Salário do gerente (com bônus): " + gerente.calcularSalario());
    }
}