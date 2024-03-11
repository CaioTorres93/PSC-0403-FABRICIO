import java.util.Scanner;

public class Exercicio040316 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida em km: ");
        double distancia = input.nextDouble(); 
        

        System.out.print("Digite a quantidade de combustivel consumido: ");
        double combustivel = input.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio de combustível foi de: " + consumoMedio + " km/l");

        input.close();
    }
}