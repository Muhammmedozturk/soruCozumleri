package day30collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*
İlk giren elemanı ilk kullanmanız (FİFO) gerektiğinde Queue en iyi seçimdir

Queue da elemanlar insertion ordera göre dizilirler

Queue da  peek() poll() element() remove() gibi ilk elemanı ilgilendiren birçok metod vardır

Offer() metodu kapasite kontrolü yapıldıktan sonra eleman ekleme durumlarında kullanılır

 */

public class Queue01 {
    public static void main(String[] args) {
        Queue<String> wareHouse=new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("tomatoes");

        wareHouse.offer("Potetoes");//kapasite uygunsa ekleme yapar
        System.out.println(wareHouse);
    }
}
