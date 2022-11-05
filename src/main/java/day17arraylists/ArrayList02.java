package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
       // example 1: verilen bir listteki elemanları tekrarsız olarak yazınız
        // {2,3,2,2,5}  ==> {2,3,5}

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer> yeni = new ArrayList<>();//tekrarsız yazılacak olan list oluşturulur ve boştur
        for (Integer w:a){
            if (!yeni.contains(w)){//eğer yeni list w değerini içeriyorsa
                yeni.add(w);//yeni listin içine at
            }
        } System.out.println(yeni);


        //example 2: kullanıcıdan bir harf alınız harf sizdeki listin içinde varsa o harfi bulundu ya çeviriniz yoksa
        // o harfi liste ekleyiniz {A K R S} ==> R verdi  {A K Bulundu S}
        Scanner input=new Scanner(System.in);
        String harf="";
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        do {


        System.out.println("lütfen bir harf giriniz");
        harf= input.next().substring(0,1);



        if (c.contains(harf)){
            c.set(c.indexOf(harf),"bulundu");
        }else if (!harf.equals("Q")){
            c.add(harf);
        }System.out.println(c);
        }while (!harf.equals("Q"));

    }
}
