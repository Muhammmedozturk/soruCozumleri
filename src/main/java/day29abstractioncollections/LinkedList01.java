package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    ArrayListler index kullanır. Ama index kullanmak eleman ekleme ve eleman silme işlemlerinde bize zaman
    kaybettirir. Çünkü birçok elemanın reindex edilmesi gerekir

    *LinkedListlerde her bir eleman iki bölümden oluşur ilk bölümde data ikince bölümde de pointer var.
    pointer sonraki variableyi işaret eder.
    LinkedListin iki böümden oluşan yapısına NODE denir. Linkedlistin en son elemanına "tail"
    denir. Son eleman pointeri de null'ı işaret eder. ilk elemandan öncede head denen bir yapı var oda ilk elemanı
    işaret eder

    LinkedList eleman ekleme ve silmede çok başarılır bir yapıya sahiptir

    LinkedList eleman arama da başarılı değil ancak arraylist çok başarılıdır

    Eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda linkedlist kullanılmalıdır

    Arraylistler index kullanır linked listler index kullanmaz

    İndex kullanmak eleman bula işlemlerinde çok başarılıdır bu yüzden eleman bulma işlemlerini çok
    yapacaksanız arraylist kullanmalısınız
     */
    public static void main(String[] args) {
        LinkedList<String> visitors=new LinkedList<>();
        visitors.add("muhammed");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad pitt");
        visitors.add(2,"Angelina Julie");
        visitors.add("Brad pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors);
//LinkedListler ekleme ve silme işlemlerinde çok başarılı olduklarından ekleme ve silme ile alakalı çok fazla metod içerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cüneyt Arkın");
        System.out.println(visitors);

        visitors.removeLast();
        visitors.removeFirst();
        visitors.removeFirstOccurrence("Tom Hanks");//Tom'un ilk görünümünü siler
        System.out.println(visitors);

        visitors.removeLastOccurrence("Brad pitt");//Btad'in son görünümünü siler
        System.out.println(visitors);

        String firstEl=visitors.pop();//ilk elemanı önce konsolda gösterir ve siler
        System.out.println(firstEl);//cut+paste yapıyor

        LinkedList<String> visitor=new LinkedList<>();
        //visitor.pop();//liste boşsa exception atar
    }
}
