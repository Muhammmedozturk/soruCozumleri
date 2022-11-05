package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    //Example bir stringteki sesli harflerin sayısını bulan kodu yazınız
    //a-e-i-o-u A E I O U
    public static void main(String[] args) {
        String str="Java öğrenince para kazanmak kolay, öğrenmeyince ne kolay ki.";
        str=str.toLowerCase();

        String harfler []=str.split("");//split metodu her zaman array verir
        int counter=0;
        System.out.println(Arrays.toString(harfler));
        for (String w:harfler){
            switch (w){
                case "a":

                case "e":

                case "o":

                case "u":

                case "i":
                   counter++;


            }
        }
        System.out.println(counter);
    }

}
