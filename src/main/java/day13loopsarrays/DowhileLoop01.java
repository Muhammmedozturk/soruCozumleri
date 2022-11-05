package day13loopsarrays;

import java.util.Scanner;

public class DowhileLoop01 {
    //example: ullanıcıdan bir sayı alınız sayı 100 den küçük ise ekrana kazandın yazdırınız
    //aksi halde ekrana kaybettin yazdırınız
    //kullanıcı kazandıkça oyun devam etmeli
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//        do {
//            System.out.println("bir sayı giriniz:");
//            sayi = input.nextByte();
//
//            if (sayi < 100) {
//                System.out.println("kazandınız....");
//            }
//        } while (sayi < 100);
//        System.out.println("kaybettiniz...");
        //example 2:kullanıcıdan ismini alınız ilk harfinin büyük harf olup olmadığını kontrol ediniz.

        do {
            System.out.println("isminizi giriniz:");
            char ilkharf = input.next().charAt(0);
            if (ilkharf >= 'A' && ilkharf <= 'Z') {
                System.out.println("ismi doğru girdiniz...");
            } else {
                System.out.println("ismi yanlış girdiniz");
                break;
            }

        } while (true) ;
        //infinite loop: Sonsuz döngü. Loop oluştururken sonsuz olmamasına dikkat edilmelidir.
        //arttırma azaltma kısmında hata yaparsanız infinite loop sorunsalı oluşur
        //arttırma azaltma kısmını yazmazsak yine sonsuz döngüye girer
        //for (int i=1;i<4;i--){
           // System.out.println("hi");
        }
    }
