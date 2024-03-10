import java.util.Scanner;

public class Exercicio04038 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float metros;
        float centimetros;

        System.out.println("Quantos metros deseja converter?: ");
        metros = input.nextFloat();

        centimetros = metros * 100f;

        System.out.println("Você tem: " + centimetros + " centímetros");
    }
}