package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    //Not: char variableleri matematiksel işlemlerde kullanırsak java onların asci değerlerini
    // kullanır. Örneğin System.outprintln('A'+'C') ekrana AC yerine 132 yazdırır.
    //Java da + sembolunun 2 anlamı vardir birinci anlam toplama işlemi ikinci anlam birleştirme işlemi
    //java + sembolunu görünce önce toplama işlemi yapmaya çalışır. yapamazsa birleştirme işlemi
    // yapmaya çalışır o da olmazsa hata verir.
    public static void main(String[] args) {
        //kullanıcıdan ilk ve soyismini alınız ilk ve soyisminin ilk harflerini ekrana yazdırınız
        //Ali Can==> AC görev

        //1. yol
        Scanner input=new Scanner(System.in);
        System.out.println("İlk isminizi giriniz:");
        char ilk =input.next().charAt(0);//CharAt(0) komutu ilk değişkeninin ilk harfini verir.
        System.out.println("Soyismini gir:");
        char soy =input.next().charAt(0);
        System.out.println(""+ilk+soy);//burada tırnak koymamızın nedeni javanın + işaretini gördüğünde matematiksel
        // işlem yapmaya çalısır. ancak stringle toplama yapamayacağı için stringle birleştirme yapar ve aski kodu yerine
        //harfi algılar

        //2. yol
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();// Ali Can

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);

    }
}
