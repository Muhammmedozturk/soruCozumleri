package day32Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        // size verilen bir cümledeki her kelimenin kaç kere kullanıldığını gösteren kodu yazınız
        //"I like to move it move it"===> I =1  like=1,  to=1,  move=2, it=2

    String str="I like to move it, move it.";
    //önce noktalama işaretlerini sil
       str= str.replaceAll("\\p{Punct}","");
        System.out.println(str);
        //kelimeleri almak için split kullanalım
        String []kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        HashMap<String, Integer>gorunum=new HashMap<>();

        for (String w:kelimeler){
            Integer gorunumsayisi=gorunum.get(w);
            if (gorunumsayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumsayisi+1);
            }
        }
        System.out.println(gorunum);


    }
}
