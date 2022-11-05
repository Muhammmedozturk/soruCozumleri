package day03typecastinggweapperscanner;

import java.util.Scanner;

public class Scanner01 {

    /*
    Scanner kullanıcıdan data almaya yarar. Scanner kullanıcı ile etkileşim kurmamızı sağlar..
    Scanner bir java clasıdır. b clası kullanabilmek için "inport" etmek gerekir.
    scanner clası javanın util kütüphanesindedir.
     */
    public static void main(String[] args) {

        //Kullanıcıdan data almak için yapılması gerekenler
        //1.adım scanner clasıda n object oluşturun

        Scanner input = new Scanner(System.in);
        //2. adımda kullancıya ne yapacağını söylemem gerekiyor
        System.out.println("Yaşını gir :");
        //adımda kullanıcıdan aldığımız datayı bir variablenin içine koyun
        byte age = input.nextByte();
        System.out.println("Hey kullanıcı senin yaşın :"+age);
    }
}
