package tests;
import java.util.Scanner;
public class arrays02 {

    public static void main(String[] args) {
        Scanner Load = new Scanner(System.in);

        String[] jogos = {"aoe", "ror", "aoe2", "aoe3", "aom"};

        System.out.println(jogos.length);

        System.out.println("Digite a posição do array: ");
        int pos = Load.nextInt();

        System.out.println("Voce procurou pela posição: " + jogos[pos]);





    }
}
