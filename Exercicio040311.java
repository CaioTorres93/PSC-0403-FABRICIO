import java.util.Scanner;

public class Exercicio040311 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    float num1;
    float num2;
    float num3;
    float media;

    System.out.println("Digite primeiro número: ");
    num1 = input.nextFloat();

    System.out.println("Digite segundo número: ");
    num2 = input.nextFloat();

    System.out.println("Digite o terceiro número");
    num3 = input.nextFloat();

    media = (num1 + num2 + num3) / 3;

    System.out.println(" A media dos valores é: " + media);
    
    
    
    
    
    
    
    
    }
}