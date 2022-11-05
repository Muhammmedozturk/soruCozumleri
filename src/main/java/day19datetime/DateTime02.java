package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //example 1: javadan aldığınız date yi ay gün ve yıl olarak yazınız
        LocalDate currentDate=LocalDate.now();

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");// 2 M 10 dan küçük ayları 01,02,03 şeklinde yazar
        String formattedDate=dtf.format(currentDate);
        System.out.println(formattedDate);


        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MMM/dd/yyyy");// 3 M kullanınca ayın ilk 3 harfini verir
        String formattedDate1=dtf.format(currentDate);
        System.out.println(formattedDate1);

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");// 4 adet M girince ayın ful ismini verir
        String formattedDate2=dtf.format(currentDate);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("M/dd/yyyy");// tek bir m 10 dan küçük ayları 2 , 4 şeklinde yazar
        String formattedDate3=dtf.format(currentDate);
        System.out.println(formattedDate3);


        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("M/dd/yy");//yıl ın son iki hanesini yazar
        String formattedDate4=dtf.format(currentDate);
        System.out.println(formattedDate4);


        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("M/d/yyyy");// tek bir d 10 dan küçük ayları 2 , 4 şeklinde yazar
        String formattedDate5=dtf.format(currentDate);
        System.out.println(formattedDate5);

        //examle 2: javadan aldığınız time nin formatını değiştiriniz
        LocalTime myTime=LocalTime.of(16,23,54,2345);

        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("hh:mm");//Büyük HH 24 saat sistemini küçük hh 12 saat sistemini kullanır
String formattedtime6 =dtf6.format(myTime);
        System.out.println(formattedtime6);


        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("hh:mm a");//sonuna a ekleyince AM PM ekler
        String formattedtime7 =dtf7.format(myTime);
        System.out.println(formattedtime7);


    }
}
