package tests;

public class Aula0041_array02 {

    public static void main(String[] args) {

      int[] rica; rica = new int[10];
        System.out.printf("%s%10s\n", " _______", "  ________ ");
        System.out.printf("%s%10s\n", "| Indice" , "| Valores |");
        System.out.printf("%s%10s\n", "|-------", "||--------|");

      for (int i = 0; i <= 9; i++){
          System.out.printf("|%5d%3s%7d |\n", i, "  |", rica[i] );
      }
        System.out.printf("%s%10s\n", "|-------", "||--------|");


    }

}
