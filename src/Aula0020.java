import java.util.Scanner;
public class Aula0020 {

    public static void main(String[] args) {
        Scanner Load = new Scanner(System.in);
        int cont, num, comeco;

        System.out.print("Digite um número para tabuada regressiva: ");
        num = Load.nextInt();

        System.out.print("Digite um começo: ");
        comeco = Load.nextInt();

        cont = comeco;
        while(cont >= 0){
            System.out.println(num +" x "+ cont+ " = "+ cont*num);
            cont = cont - 1;
        }


    }
}
