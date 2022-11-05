package day18arraylistspassbyvalue;

public class POstPreIncrimentDeccrement {
    public static void main(String[] args) {
        int a=5;

        //Post increment
        int b =a++;
        System.out.println(b);//5 verir
        System.out.println(a);//6 verir

        //pre increment
        int c=10;
        int d=++c;
        System.out.println(d);//11 verir
        System.out.println(c);//11 verir

        //post Decrement
        int e=20;
        int f= e--;

        System.out.println(f);//20 verir
        System.out.println(e);//19 verir

        //pre decrement
        int h =30;
        int i=--h;
        System.out.println(i);//29 verir
        System.out.println(h);//29 verir
    }
}
