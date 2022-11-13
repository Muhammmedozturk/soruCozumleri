package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        /*
        Deque Double enden Queue yani iki uçlu Queue demektir.
        Deque te FİFO(first in first out) ve LİFO(Last in First out) gerektiğinde kullanılır

         */

        Deque<String> furnitureTruck=new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bad");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);

        //Deque de metotlar hep iki uçlu hem first hem de last vardır
        furnitureTruck.push("");//Push addfirstle aynıdır(ilk sıraya ekler) kapasiteyi kontrol ediyor. kapasite sınırlandırma
        //sına bakar ona göre hata mesajı verir
    }
}
