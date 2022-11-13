package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
/*
        LinkedHashSetler elemanları ekleme sırasına göre (insertion order) yerleştirirler

        LinkedHashSet elemanları sıralamada zaman harcadığı için hashSetlere göre yavaş çalışır


 */
    public static void main(String[] args) {
        LinkedHashSet <String> emails=new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");
        System.out.println(emails);


    }
}
