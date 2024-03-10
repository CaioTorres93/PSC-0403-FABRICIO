import java.util.Scanner;

public class Exercicio04037 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salario;
        float ajuste;

        System.out.println("Qual é o seu salário?");
        salario = input.nextFloat();

        ajuste = salario * 1.07f; // Aumento de 7%

        System.out.println("Salário reajustado é: R$" + ajuste);
    }
}