package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> names =new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

       String firste= names.peek();//bu metod sana ilk elemanı verir eğer list boş ise sana null veriyor elemanı silmez
        System.out.println(firste);

        LinkedList<String> myList =new LinkedList<>();
        String bos=myList.peek();

        System.out.println(bos);
        String x=names.poll();//listedeki ilk elemanı hem silmek hemde görmek için kullanılır. list boşken null return eder
        System.out.println(x);
        System.out.println(names);


        String f=names.element();//listenin ilk elemanını verir, silmez, liste boşsa exception atıyor
        System.out.println(f);

        //examle1: A ile başlayan tüm isimleri "*****" e ceviriniz

        LinkedList<String> name =new LinkedList<>();
        name.add("Chris");
        name.add("Alexandre");
        name.add("Mark");
        name.add("Tom");
        name.add("Jeremy");
        name.add("Hans");

        for (String w: name){
            if (w.startsWith("A")){
                name.set(name.indexOf(w),"*****");
            }
        }
        System.out.println(names);
//interview sorusu
        //example 2: Listteki dört hrften çok harf içeren isimleri siliniz
        LinkedList<String> nam =new LinkedList<>();
        nam.add("Chris");
        nam.add("Alexandre");
        nam.add("Mark");
        nam.add("Tom");
        nam.add("Jeremy");
        nam.add("Hans");

        for (int i=0; i<nam.size();i++){
            if (nam.get(i).length()>4){
                nam.remove(nam.get(i));
                i--;

                }
            }
        System.out.println(nam);
        }




    }


