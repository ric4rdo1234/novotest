import java.util.Scanner;
public class Aula0016 {
    public static void main(String[] args) {
        Scanner Load = new Scanner(System.in);
        final double vsom = 340.28; // m/s

        System.out.print("Digite o espaço de tempo em segundos: ");
        double tempo = Load.nextDouble();

        System.out.println("A distância é de "+ tempo * vsom + " metros");

        System.out.println("A distância é de "+ (tempo * vsom)/1000 + " kilometros");


    }


}
