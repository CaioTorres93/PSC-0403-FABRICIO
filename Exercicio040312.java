import java.util.Scanner;

public class Exercicio040312 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Digite um número inteiro: ");
        num1 = input.nextInt();

        num2 = (num1 - 1);
        num3 = (num1 + 1);

        System.out.println("Antecessor é: " + num2 + "\n Sucessor é: " + num3 );
 
 
    }
}