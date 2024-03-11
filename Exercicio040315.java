import java.util.Scanner;

public class Exercicio040315 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = input.nextDouble();

        double delta = (B * B) - (4 * A * C);


        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } 

            else{ 

            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("As raízes da equação são:");
            System.out.println("Raiz 1 = " + raiz1);
            System.out.println("Raiz 2 = " + raiz2);
                }

        input.close();
    }

}

