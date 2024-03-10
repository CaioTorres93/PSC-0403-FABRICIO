import java.util.Scanner;

public class Exercicio04035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float dollar;
        float real;
        float total;

        System.out.println("Quantos dolares voce tem?: " );
        dollar = input.nextFloat();

        total = dollar * 4.95f;

        System.out.println("Voce tem:"  + total + "real");
    }
}