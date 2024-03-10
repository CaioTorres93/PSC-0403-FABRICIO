import java.util.Scanner;

public class Exercicio040313 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valorHoras;
        int numeroHoras;
        float inss;
        float totalSalarial;
        float percentual;

        System.out.println("Quanto você ganha por hora trabalhada?: ");
        valorHoras = input.nextInt();

        System.out.println("Quantas horas você trabalhou este mês?: ");
        numeroHoras = input.nextInt();

        System.out.println("Qual porcentagem do seu INSS?: ");
        inss = input.nextFloat();

        percentual = inss / 100;
        totalSalarial = (valorHoras * numeroHoras) * (1 - percentual);

        System.out.println("Valor líquido de salário é: " + totalSalarial);
    }
}