package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //example 1: anlık tarihi ekrana yazdıran kodu yazınız.
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);

        //example 1: anlık zamanı ekrana yazdıran kodu yazınız.
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        ////example 1: anlık tarihi ve zamanı ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);
        //example: Japonyadaki anlık tarihi anlık zamanı ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTimeInJapan =LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        LocalDateTime currentDateTimeInIst =LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIst);

        //Bugünden 789 gün sonra emekli olacağınıza göre emeklilik tarihini hesaplayan kodu yazınız
        LocalDate countDate=LocalDate.of(2022,10,21);
        LocalDate retireDate =countDate.plusDays(789);
        System.out.println(retireDate);

        //example 7:iki çocuğunuzun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız
        LocalDate dAli=LocalDate.of(2005,5,17);
        LocalDate dAl=LocalDate.of(2013,2,8);

//between metodu kullanıldığında daha eski olan tarih önce yazılmalıdır
        Long yasFarkı=ChronoUnit.DAYS.between(dAli,dAl);
        System.out.println(yasFarkı);

       //example 8:İstanbulun fethi ile cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
        LocalDate ist=LocalDate.of(1453,5,29);
        LocalDate cumh=LocalDate.of(1923,11,29);
        Long ays=ChronoUnit.MONTHS.between(ist,cumh);//önce eski tarih yazılır
        System.out.println(ays);

        //example 9: Verilen tarihin hangi burçta olduğunu gösteren kodu yazınız
LocalDate myDate=LocalDate.of(1989,3,28);
int day=myDate.getDayOfMonth();
int month =myDate.getMonthValue();
        if (day>=21 && month==3) {
            System.out.println("koç");
        }else if (day<=20 && month==4) {
            System.out.println("koç");
        } else if (day>=21 && month==4) {
            System.out.println("Boğa");

        } else if (day<=20 && month==5) {
            System.out.println("boğa");
        }


        //example 8: Tom, Ali den 3 yıl 8 ay 13 gün sonra doğdu Ali ise veliden 1 yıl 15 gün önce doğdu
        //Tomun doğum tarihi 18 kasım 2011 ise veli ve alinin doğum tarihlerini bulunuz

        LocalDate tom=LocalDate.of(2011,11,18);
        LocalDate ali=tom.plusYears(3).plusMonths(8).plusDays(13);
        LocalDate veli=ali.minusYears(1).minusMonths(0).minusDays(15);
        int yas=ali.getYear();
        System.out.println(yas);
    }
}
