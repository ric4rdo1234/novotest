import java.util.Scanner;

public class DetectorDePrimo01 {

    public static void main(String[] args) {
        Scanner Load = new Scanner(System.in);

        int NumX, cont, Tdiv;
        System.out.print("Entre com um número: ");
        NumX = Load.nextInt();
        Tdiv = 0;
        cont = 0;
        while (cont <= NumX) {
            cont = cont+1;

            if (NumX % cont == 0) {
                Tdiv = Tdiv + 1;
            }
        }
        if (Tdiv == 2){
            System.out.println("O número é primo. ");
        }else{
            System.out.println("O número NÃO é primo. ");
        }
    }
}