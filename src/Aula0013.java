import java.util.Scanner;
public class Aula0013 {

    public static void main(String[] args) {
        Scanner Load = new Scanner(System.in);

        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");

        int i = Load.nextInt();

        System.out.print("Digite o primeiro número ");
        double num1 = Load.nextDouble();

        System.out.print("Digite o segundo número ");
        double num2 = Load.nextDouble();

        if (i == 1) {
            System.out.println(num1 + num2);
        } else if (i == 2) {
            System.out.println(num1 - num2);
        } else if (i == 3) {
            System.out.println(num1 * num2);
        } else if (i == 4) {
            System.out.println(num1 / num2);
        }
    }
}