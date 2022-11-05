package day06nestedifswitch;

import java.util.Scanner;

public class ifStatement01 {
    public static void main(String[] args) {
        //kullanıcıdan yaş değerini alan kodu yazınız ve yaşın hangi evrede olduğunu aşağıdaki tabloya göre ekrana yazdırınız
        //0-4 bebek
        //5-12 çocuk
        //13-20 genc
        //21-30 yetişkin
        //tanımlanmamış evre
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz..:");//baundary value analyze test: bütün değerlerle test etmek(BVA)
        byte yas=input.nextByte();
        if (yas<0) {
            System.out.println("geçerli yaş giriniz");
        }else if (yas<5){
            System.out.println("bebek");
        } else if (yas<13) {
            System.out.println("çocuk");

        } else if (yas<21) {
            System.out.println("genç");
        } else if (yas<31) {
            System.out.println("yetişkin");
        }else {
            System.out.println("tanımlanmamış bölge");
        }

    }
}
