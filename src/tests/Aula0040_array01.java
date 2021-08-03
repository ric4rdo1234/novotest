package tests;

public class Aula0040_array01 {
    public static void main(String[] args) {


        int[] rica; // declaração do nosso array
        rica = new int[10]; // cria e reserva o espaço para o nosso array

        for (int i = 0; i <= 9; i++ ){
            System.out.printf("%5d%7d\n", i, rica[i] );


        }



    }
}