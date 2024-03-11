import java.util.Scanner;

public class Exerciocio040318 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a altura dos degraus? ");
        double alturaDegrau = input.nextDouble();

        System.out.print("Quantos metros de altura você deseja alcançar? ");
        double alturaDesejada = input.nextDouble();

        int numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau); 
        

        System.out.println("Para alcançar " + alturaDesejada + " metros, você deve subir " + numeroDegraus + " degraus.");

        input.close();
    }

}