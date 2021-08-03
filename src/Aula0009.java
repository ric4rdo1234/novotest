import java.util.Scanner;

public class Aula0009 {
    public static void main (String[] args){
    Scanner Load = new Scanner(System.in);

    double num1, num2, soma, subtracao, multi, div;

        System.out.print("Insira um número: ");
    num1 = Load.nextDouble();

    System.out.print("Insira outro número: ");
    num2 = Load.nextDouble();

    subtracao = num1 - num2;
    soma = num1+num2;
    multi = num1 * num2;
    div = num1 / num2;

    System.out.println("A soma entre "+ num1+" + "+ num2+ " é: "+ soma );
    System.out.println("A subtração entre "+ num1+" - "+ num2+ " é: "+ subtracao );
    System.out.println("A multiplicação entre "+ num1+" x "+ num2+ " é: "+ multi );
    System.out.println("A divisão entre "+ num1+" / "+ num2+ " é: "+ div );


    }
}
