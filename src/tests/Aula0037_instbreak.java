package tests;

public class Aula0037_instbreak {
    public static void main(String[] args) {


        int i = 10;
        while (i <= 10000) {
           i++;
            System.out.println(i+"");
            if (i==500)
                break;

        }


    }
}