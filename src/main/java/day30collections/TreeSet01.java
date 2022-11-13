package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        /*
        tekrarsız elemanları alfabetik sıralama veya küçükten büyüğe sıralama yapar

        alfabetik sıralama veya küçükten büyüğe sıralamaya "National Order" olarak adlandırılır

        treeSet çok yavaş çalışır

        Note:Tekrarsız elemanları naturel orderda depolama için treeSet kullanmak mantıklıdır ama treeSetler çok yavaş
        çalıştığı için biz elemanları önce hashSete depolarız sonra HashSeti TreeSete çevirerek
        TreeSetin yavaş olma problemini aşarız.
         */
        //example1: 8 tane unique String elemanı alfabetik sırada depolayınız

        //1.yol
        Long start=LocalTime.now().toNanoOfDay();
        TreeSet<String> emails=new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);
        Long start2=LocalTime.now().toNanoOfDay();
        System.out.println(start2-start);
        //2.yol burada hashsetin hızından faydalanıp tree setin sıralamasından faydalanıyorum
        HashSet<String> myemails=new HashSet<>();
        myemails.add("a@gmail.com");
        myemails.add("y@gmail.com");
        myemails.add("c@gmail.com");
        myemails.add("m@gmail.com");
        myemails.add("b@gmail.com");
        myemails.add("z@gmail.com");
        myemails.add("k@gmail.com");
        myemails.add("d@gmail.com");

        TreeSet myEmailSorted=new TreeSet<>(myemails);//hashsetin tree sete çevrilmesi// amaç treesetin yavaşlığından kurtulmak
        Long end2=LocalTime.now().toNanoOfDay();//yazdığımız kodun nekadar sürede uygulandığını ölçmek için kullanılır
        System.out.println(end2-start2);

    }
}
