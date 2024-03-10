import java.util.Scanner;

public class Exercicio04039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float raio;
        float diametro;

        System.out.println("Qual o raio da circunferencia?: " );
        raio = input.nextFloat();

        diametro = raio * 2f;

        System.out.println("O diametro da circunferencia é: " + diametro + "centimetros");
    }
}
