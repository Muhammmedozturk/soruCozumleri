package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //exmple 1:japonya ile almanya arasındaki zaman farkını saat olarak hesaplayan kodu yazınız

        LocalDateTime japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime almanya=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark =ChronoUnit.HOURS.between(almanya,japonya);
        System.out.println(fark);


        //example 2:Sabit bir tarih oluşturunız
        LocalDate myDate=LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);
        /*
        1) javada sabit dataları(gün isimleri, ay isimleri ,amerikadaki eyalet isimleri gibi) depolamak ve gerektiğinde
        kullanmak için depolar oluştururuz. bu depolara Enum denir.
         */

//example 3: USA için "Woow" Yazın UK için "big" Yazın Canada için "cold" yazın Turkey için "vatan" yazın
        //germany için "araba" rwanda için "çay" yazalım

        Countries country=Countries.USA;
        switch (country){
            case USA:
                System.out.println("woow");
                break;
            case UK:
                System.out.println("big");
            case CANADA:
                System.out.println("cold");
            case TURKEY:
                System.out.println("vaa-tan");
            case GERMANY:
                System.out.println("car");
            default:
                System.out.println("tanımlanmamış ülke");
        }
    }
}