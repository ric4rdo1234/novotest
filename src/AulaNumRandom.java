import java.util.Random;

public class AulaNumRandom {
    public static void main(String[] args) {

        Random num = new Random();

        for (int i = 0; i < 20; i += 1) {
            //System.out.println(num.nextInt(6) + 1);
            //System.out.println(num.nextDouble()*40);
            System.out.println(num.nextBoolean());

        }


    }
}
