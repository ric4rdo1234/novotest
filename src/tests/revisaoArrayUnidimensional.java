package tests;
import java.util.Arrays;
import java.util.Scanner;

public class revisaoArrayUnidimensional {
    public static void main(String[] args) {
        Scanner Load = new Scanner(System.in);
        int[] valores = new int[7];


        for (int i = 0; i < 7 ; i++ ) {
            System.out.printf("Digite o numero da posição [%d] : ", i+1 );
            valores[i] = Load.nextInt();
        }

        System.out.println(Arrays.toString(valores));

    }


}
