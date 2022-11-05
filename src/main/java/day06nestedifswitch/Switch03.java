package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    //switchte sadece int byte short char ve string data tipleri kullanlabilir
    //eğer 3 ten fazla durum varsa switch tercih ederim
    /*
    kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinası yapınız
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("işlem giriniz(+,-,*,/,%)");
        char islem=input.next().charAt(0);
        System.out.println("ilk sayıyı giriniz:");
        double ilk=input.nextDouble();
        double ikinci=input.nextDouble();
        switch (islem){
            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("bu işlem tamamlanmıştır");
        }

    }
}
