package day14arraysForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        /// Example 1: [0, 2, 3, 0, 12, 0] sıfırları sona koyunuz
        //        //            [2, 3, 12, 0,  0,  0]


        //bu sorunun çözümü için yeni bir array oluşturulur eleman sayısı orjinal array le aynı olmalı
        //
int original []={0,2,3,0,12,0};
int yeni[]=new int[original.length];
int idx=0;

for (int i=0;i<original.length;i++){
    if (original[i]!=0){
        yeni[idx]=original[i];
        idx++;
    }
}
        System.out.println(Arrays.toString(yeni));


//example 2:bir arrayın içinde herhangi bir elemanın olup olmadığını kontrol eden ve kaç kere tekrarlandığını  kodu yazınız

        // [2, 1, 2 ,-3 ,2] kullanıcı 2 yi sordu == 2 elemanı var ve 3 kere tekrarlandı

        //kullanıcı 6 yi sordu == 6 elemanı yok ve 0 kere tekrarlandı

        int arr[]={2, 1, 2 ,-3 ,2};
        int eleman =2;
        int counter=0;// "flag" bazı durumların olup olmadığını kontrol etmek için flag kullanılr

        for (int w:arr){
            if (w==eleman){
                counter++;

            }
        }
        if (counter>0){
            System.out.println(eleman +" elemanı arrayde "+ counter+ " defa var");
        } else System.out.println(eleman+ " arrayda yok");


        //example 3: size verilen bir cüledeki en uzun kelimeyi bulan kodu yazınız
        //"java kolaydır çalışana, ne kolayki çalışmayana==>çalışmayana

        String sentence ="java kolaydır çalışana, ne kolay ki çalışmayana";
        sentence=sentence.replaceAll("\\p{Punct}","");//noktalama işaretlerini attım
        String words[]=sentence.split(" ");//boşluklardan cümleyi parçaladım//split depolamak için array kullnır
        Arrays.sort(words, Comparator.comparingInt(String::length));//en son eleman en uzun olur
        System.out.println(Arrays.toString(words));

        System.out.println(words.length-1);//en uzununu veriyor
    }
}
