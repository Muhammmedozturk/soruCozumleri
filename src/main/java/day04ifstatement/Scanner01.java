package day04ifstatement;

import java.util.Scanner;
import java.util.StringJoiner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ilk orta ve soy ismini alınız ve aşağdaki formatta ekrana yazdırınız
         */
        Scanner input =new Scanner(System.in);
        System.out.println("İlk İsmini gir:");
        String ilkisim= input.next();//next() metodu kullanıcıdan string datası almak için kullanılır
        System.out.println("Orta isminizi giriniz.:");
        String ortaisim = input.next();
        System.out.println("Soyisminizi giriniz:");
        String soyisim= input.next();
        System.out.println("Tck no Gir:");
        String kimlikNo= input.next();
        System.out.println(ilkisim+" "+ortaisim+" "+soyisim);
        System.out.println(kimlikNo);
        //2. yol
        System.out.println("ilk orta ve soyisminizi ve kimlik numaranızı giriniz....:");
        String ilk= input.next();
        String orta= input.next();
        String soy= input.next();
        String kimlik=input.next();
        System.out.println(ilk+" "+orta+" "+soy);
        System.out.println(kimlik);
        /*
        next() ile nextline() farkı nedir
        next() metodu kullanıcıdan gelen stringin sadece ilk kelimesin alır
        nextLine() metodu kullanıcıdan gelen stringin tamamını alır
         */

        //3.yol
        System.out.println("İlk orta ve Soyisminizi giriniz...:");
        String tamisim= input.nextLine();//Nextline() kullanıcının girdiği bütün satırı alır Next sadece tek kelime alır
        System.out.println(tamisim);

        System.out.println("Kimlik numaranızı giriniz:");
        String kimliknumarası= input.next();
        System.out.println(kimliknumarası);

    }
}
