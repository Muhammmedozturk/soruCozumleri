package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {
    /*

     */
    public static void main(String[] args) {
        PriorityQueue<String> myQueue=new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue);//Javann kendisine göre belirlediği önceliğe göre sıralama yapar
        //bu List metodunda kendimiz sıralama mantığı geliştirebiliriz. onu lambda da görecez
    }
}
