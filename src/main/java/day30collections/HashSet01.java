package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        //Hash bir tekniktir birbirine benzemeyen kodlar oluşturmaya yarar. bu kodlar datayı unike yapar.
        // herbir dataya özel bir kod üretir
        //Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
        //Hashsetler eklenen elemanların sıralaması ile uğraşmaz. sıralama ile ilgili zaman harcamaz çok hızlı çalışır
        //HashSetler index kullanmazlar. Çünkü sıralama rastgele yapıldığı için index manalı olmaz
       // Hashsetler ne zaman kullanılır
                //tekrarsız elemanlar
               // sıralama önemli değilse
                //hız çok önemliyse
               // index kullanılmayacaksa

        HashSet<String> emails=new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);
        emails.add("Mango");//setlere aynı elemanı bir daha eklerseniz hata vermez bir öncekinin üstüne aynısını ekler
        //var olan elemanı eklerseniz hata vermez. Son ekleneni var olan datanın üstüne yazar(override)
        System.out.println(emails);


        emails.add(null);//null ı listeye ekler
        System.out.println(emails);


    }
}
