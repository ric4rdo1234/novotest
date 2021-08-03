package tests;

public class Aula0040continue {

    public static void main(String[] args) {
        System.out.println("segue os números pares de 0 até 100 ");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 00)
                System.out.print(i + " ");
            else
                continue;

            int a = 0, soma = 0;
            while (a < i) {
                a++;
                soma += a;
            }

            System.out.println("A soma de todos os números é "+ soma);
        }
    }
}