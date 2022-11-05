package day07ternarystringmanipulation;

public class ternary01 {
    public static void main(String[] args) {
        //examle 1: bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız
        //1.yol
        int a=12;
        if (a>0){
            System.out.println("pozitif");
        }else{
            System.out.println("pozitif değil");
        }
        //2yol                  condition                      condition doğru ise      condition yanlış ise
        String sonuc =               a>0               ?              "pozitif" :          "pozitif değil";
        //example: iki sayıdan küçük olanı seçen kodu yazınız
        int b=12;
        int c=23;
        int min= b<c ? b: c;
        System.out.println(min);
        //verilen bir sayının mutlak değerini hesaplayan kodu yazınız
        //pozitif sayıların ve 0 ın mutlak değeri kendileridir. negatif sayıların mutlak değeri -1 ile çarpılmış halleridir
        int d=-45;
        int abs =d<0 ?-1*d :d;
        System.out.println(abs);

        //example 4: iki tane sayı aynı işaretli ise bu sayıları çarpınız. farklı işaretli ise "işlem yapamam" mesajı ver
        int e =12;
        int f=10;
        Object snc = (e>0 && f>0)||(e<0 && f<0) ? e*f : "işlem yapamam";
        System.out.println(snc);//turnery farklı data tiplerinde sonuç return ederse sonucun data tipini object yapınız
        //not java'da her class'ın en az bir tane parent class'ı vardır
        //sadece object class2ın parent class'ı yoktur
    }

}
