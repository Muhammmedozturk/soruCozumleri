package day03typecastinggweapperscanner;

public class TypeCasting01 {
    //type casting:bir numerik data tipini diğer nümerik data tipine çevirmek demektir.
    //              byte<short<int<long<float<double

    // Auto widening: Küçükten büyüğe gtmeye denir.otomatik genişletme.
    //Explicit Narrowing:Açıkça daraltma anlamına gelir.
    //küçük data tipini büyük data tipine çevirmeye "Auto widening denir"
    //büyük data tipini küçük data tipine çevirmeye "Explicit Narrowing denir.

    public static void main(String[] args) {
        byte age=23;
        int newAge = age;//Auto Widening

        long population = 1234;
        int newPopulation = (int)population;//Explicit Narrowing

        //example 1 Shortu dubleye çeviren kodu yazınız
        short sayi=15;
        double yenSayı=sayi;

        // example 2 floatı byte yapan kodu yazınız
        float sayi1 =3.14f;
        byte yeniSayi1= (byte)sayi1;


        System.out.println(yeniSayi1);//ondalıklı sayıyı tam sayıya çevirirken yuvarlama işlemi yapmaz.
        // Java Çevirirken ondalıklı kısmı siler. Tamsayı kısmını alır.

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);//sonuç 3// java 515 i 256(byte ki sayıların adeddi) ya böldü kalanı yazdı

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);//Sonuç -2
    }
}
