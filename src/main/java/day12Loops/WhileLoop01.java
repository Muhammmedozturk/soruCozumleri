package day12Loops;

import java.util.Scanner;

public class WhileLoop01 {
    //example 1:3 ten 10 a kadar tamsayıları aynı satırda ekrana yazdıran kodu yazınız
    public static void main(String[] args) {
        //1. yol
        for (int i=3; i<11; i++){
            System.out.print(i+" ");
        }//2yol
        int i=3;
        while(i<11){
            System.out.print(i+" ");
            i++;
            System.out.println();
        }//example 2: 17 de 4 e kadar tüm çift sayıları ekrana yazdıran kodu yazınız
        int a=17;
        while (a>3){
            if (a%2==0)
            System.out.print(a+" ");
            a--;
            System.out.println();
        }//example 3: 12 den 67 ye sayıların toplamını veren kodu yazınız
        int sum=0;
        int m=12;
        while (m<68){
            sum=sum+m;
            m++;
        }
        System.out.println(sum);
//example 4: size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız
        int c=385;
        int sonuc =0;
        while (c>0){

            sonuc=c%10+sonuc;

            c=c/10;

        } System.out.println(sonuc);
//example 5:kullanıcıdan aldığınız bir sayının çarpım tablosunu ekrana yazdırınız
        // kullanızı 3 verirse  3*1=3 3*2=6
        Scanner input=new Scanner(System.in);
        System.out.println("çarpım tablosunu görmek için bir sayı giriniz:");
        int s= input.nextInt();
        int n=1;
        while (n<11){

            System.out.println(s+" x "+n +"="+s*n);
            n++;
        }

    }
}
