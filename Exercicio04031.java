import java.util.Scanner;

public class Exercicio04031 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int numTotal;

        System.out.println("Digite um número: ");
        num1 = input.nextInt();

        System.out.println("Digite outro número: ");
        num2 = input.nextInt();

        numTotal = num1 + num2;

        System.out.println("O resultado é: " + numTotal);
    }
}


    
2