import java.util.Scanner;

public class Exercicio040317 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas canetas foram compradas? ");
        int nCanetas = input.nextInt();

        System.out.print("Quantos reais custaram as canetas? ");
        System.out.print("Qual nota foi utilizada para pagar o valor cobrado? ");
        double zReais = input.nextDouble();

        System.out.print("Qual foi o troco recebido: ");
        double yTroco = input.nextDouble();
        
        double custoTotal = zReais - yTroco;
        double unitCaneta = custoTotal / nCanetas;
        
        System.out.println("Cada caneta custou: R$" + unitCaneta);
        
        input.close();
    }
}
