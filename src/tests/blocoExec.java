package tests;

public class blocoExec {


    public static void main(String[] args) {

        int a = 5;
        int as = 19;

        {
            a = 3;
            System.out.println(a);
        }

        a = 7;
        System.out.println(a);

        {
            a = 18;
        }

        {
            a = 15;
            System.out.println(a);
        }

        System.out.println(as);
    }





}
