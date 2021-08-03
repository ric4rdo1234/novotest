import java.util.Scanner;

public class Aula0007 {
    public static void main (String[] args) {
        Scanner Load = new Scanner(System.in);
        System.out.print("Informe a idade do cachorro: ");
        int idadeCachorro = Load.nextInt();

        idadeCachorro = idadeCachorro*7;

        System.out.print("O seu cachorro tem, "+idadeCachorro+" anos.");

    }
}

