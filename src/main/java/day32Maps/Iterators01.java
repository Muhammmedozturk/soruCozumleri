package day32Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();

        myList.add("A");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
       //for each loop kullanarak her elemanın sonuna "!" ekleyiniz
        //Note: Looplar kendi başlarına collectionları update edemezler bu yuzden java Iteratorları oluşturdu
        //Iteratorlar collectionları update etmek için kullanılır

        for (String w: myList){
            w=w+"!";
        }
        ListIterator<String>itr=myList.listIterator();
        while (itr.hasNext()){//hasNext bir sonraki eleman var mı diye kontrol eder
            String el=itr.next();//next metodu pointırı alır bir sonraki elemanın önüne getirir ve üztünden atladığı elemanı size verir"Z" yi verir
            itr.set(el+"!");

        }
        System.out.println(myList);
    }
}
