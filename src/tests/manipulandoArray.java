package tests;

public class manipulandoArray {
    public static void main(String[] args) {

        int[] arrayInt = new int [10];
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 12;
        arrayInt[4] = 30;
        arrayInt[5] = 30;
        arrayInt[6] = 9;
        arrayInt[7] = 30;
        arrayInt[8] = 31;
        arrayInt[9] = 10;

        int soma = arrayInt[0]+arrayInt[1]+arrayInt[2];
        System.out.println(soma);

        int somaarray = 0;
        for (int cont = 0; cont < 10; cont++){
            somaarray = somaarray + arrayInt[cont];


        }

        System.out.println("A soma de todos os número é: "+ somaarray);

    }


}
