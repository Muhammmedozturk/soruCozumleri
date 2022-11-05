package day03typecastinggweapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Example 1:sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız
        //1.adım Scanner clasında object oluştur
        Scanner input = new Scanner(System.in);
        //2. adımda kullanıcıya ne yapacğını söyle
        System.out.println("İlk sayıyı giriniz..:");
        double sayi1= input.nextDouble();

        System.out.println("İkinci sayıy giriniz..:");
        double sayi2 = input.nextDouble();

        System.out.println("iki sayının toplamı..:"+ (sayi1 +sayi2));
    }
}
