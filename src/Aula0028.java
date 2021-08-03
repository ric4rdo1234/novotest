import java.util.Scanner;

public class Aula0028 {
    public static void main(String[] args) {
        Scanner Load = new Scanner(System.in);
        int x = 0;
        double num1, num2, resultado;

        num1 = num2 = resultado = 0;

        do {
            System.out.println("1) Somar");
            System.out.println("2) Subtrair");
            System.out.println("3) multiplicar");
            System.out.println("4) dividir");
            System.out.println("0) sair");
            System.out.print("Digite o código da operação desejada: ");
            x = Load.nextInt();

            if (x != 0) {
                System.out.println("Digite o primeiro número: ");
                num1 = Load.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = Load.nextDouble();

                if (x == 1) {
                    resultado = num1 + num2;
                } else if (x == 2) {
                    resultado = num1 - num2;
                } else if (x == 3) {
                    resultado = num1 * num2;
                } else if (x == 4) {
                    resultado = num1 / num2;
                }
                System.out.println("O resultado é: " + resultado);
            }
        }while(x!=0);



    }
}
