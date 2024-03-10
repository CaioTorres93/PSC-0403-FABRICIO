import java.util.Scanner;

public class Exercicio04036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        int dias;

        System.out.println("Quantos anos você tem?");
        idade = input.nextInt();

        dias = idade * 365;

        System.out.println("Dias vividos: " + dias);
    }
}


