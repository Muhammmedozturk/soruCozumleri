package day03typecastinggweapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //kullanıcıdan bir dikdörtgenin en ve boyunu alıp alan ve çevresini hesaplayan kodu giriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarını giriniz.:");
        int en= input.nextInt();


        System.out.println("Dikdörtgenin uzun kenarını giriniz.:");
        int boy= input.nextInt();

        System.out.println("Alan..:" +en*boy);
        System.out.println("Çevre..:"+ 2*(en+boy));
    }
}
