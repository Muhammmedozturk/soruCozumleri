package day20StringBuilderStringbuffer;

import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    //Example 1:/example 8: Tom, Ali den 3 yıl 8 ay 13 gün sonra doğdu Ali ise veliden 1 yıl 15 gün önce doğdu
    //        //Tomun doğum tarihi 18 kasım 2011 ise veli ve alinin doğum tarihlerini bulunuz

    public static void main(String[] args) {
        LocalDate dobTom=LocalDate.of(2011, Month.NOVEMBER,18);
        LocalDate dobAli=dobTom.minusYears(3).minusMonths(8).minusDays(18);
        LocalDate dobVeli=dobAli.plusYears(1).plusYears(15);
        System.out.println(dobAli);
        System.out.println(dobVeli);
    }
}
