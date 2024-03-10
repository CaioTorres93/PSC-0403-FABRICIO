import java.util.Scanner;

public class Exercicio04034 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String endereço;
        String telefone;

        System.out.println("Digite seu nome:");
        nome = input.nextLine();
        System.out.println("Digite seu Telefone: ");
        telefone = input.nextLine();
        System.out.println("Digite seu endereço: ");
        endereço = input.nextLine();

        System.out.println(nome);
        System.out.println(endereço);
        System.out.println(telefone);
    }
}

