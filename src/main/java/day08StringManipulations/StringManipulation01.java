package day08StringManipulations;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;
//yazdığınız kod sadece belli durumlar için çalışırsa o koda hard coding(ölü kod) denir
//yazdığınız kod her durum için çalışırsa okoda dynamic kod denir
public class StringManipulation01 {
    //1.yol
    public static void main(String[] args) {
        //example 1:kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen isim giriniz");
        String isim= input.next();
        char ilkharf= isim.charAt(0);
        char sonharf=isim.charAt(isim.length()-1);//son indekse ulaşmak için toplam karekter sayısından 1 çıkarılır
        System.out.println(ilkharf+""+sonharf);
        //2.yol
        String ilk=isim.substring(0,1);
        String son=isim.substring(isim.length()-1);
        System.out.println(ilk+son);
        //example 2 verilen stringdeki tüm hayvan isimlerini ekrana yazdırınız
        //ben kedi eşim tavuk oğlum sever inek .
        String str="ben kedi, eşim tavuk, oğlum sever inek";
        String kedi =str.substring(4,8);
        String tavuk=str.substring(15,20);
        String inek=str.substring(34);
        System.out.println(kedi+tavuk+inek);

        //substringin iki kullanımı vardır
        //1)substring (başlangıç indexi, bitiş indexi) Stringin herhangi bir yerinden parça almaya yarar
        //2)substring(başlangıç indexi) Stringin verilen indexten sonuna kadar almaya yarar.

        //ilk isim ve soy ismi içeren isimlerde ilk ve soyisimlerin baş harflerini ekrana yazdırınız
        // Ali can ==> AC     Tahsin Yurdakul  ==TY

        System.out.println("ilk ve soyisminizi giriniz:");
        String tamIsim=input.nextLine();
        String a=tamIsim.substring(0,1);
        String b=tamIsim.split("")[1].substring(0,1);//(split "") demek boşluk karakterinden itibaren kes
        System.out.println(a+b);
    }
}
