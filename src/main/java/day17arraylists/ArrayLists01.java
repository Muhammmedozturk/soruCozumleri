package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);
        List<String> cities=new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Tacettin");
        names.removeAll(cities);//remove all kullandığınızda ilklist değişir parantezin içindeki list değişmez
        System.out.println(names);


        List<String> mynames=new ArrayList<>();
        mynames.add("Thomas");
        mynames.add("Tahsine");
        boolean sonuc1=names.containsAll(mynames);//bir listiniçinde çoklu elemanların var olup olmadığını kontrol eder.
        //hepsi varsa true en az biri yoksa false verir
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        //example 1: a listinde "shoes" elemanının ilk görünümünü siliniz

        a.remove("Shoes");//ilk görünüm shoes i sildi
        System.out.println(a);

        //example 2: "shoes" elemanının tüm görünümlerini siliniz
        List<String> silinecekler =new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);

        //example 3 bir salary lşsti oluşturun eğer salary 10000 den az ise %20 10000 den çok ise %10 zam yapınız
        List<Double> salary=new ArrayList<>();
        salary.add(12345.00);
        salary.add(8675.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        for (Double w:salary){
            if (w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            }else {
                salary.set(salary.indexOf(w),w*1.1);
            }
        }
        System.out.println(salary);
        //example 4: iki arrayin eşit olup olmadığını kontrol eden kodu yazınız
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        //1.yol
        //iki arraylistin eşit olması için hem elemanlar eşit olmalı hem de elemanlar aynı indexte olmalı
        int counter=0;
        for (int i=0;i<m.size();i++){
            if (m.size()!= n.size()){
                System.out.println("listler eşit değil");
                counter++;
                break;
            }
           else if( m.get(i)!=n.get(i)){
           counter++;
            System.out.println("eşit değildir");
            break;
            }
        }if (counter==0){
            System.out.println("Listler eşittir");
        }
        //2.yol
        boolean esitmi=m.equals(n);
        if (esitmi){
            System.out.println("listler eşittir");
        }else System.out.println("listler eşit değil");

    }

}
