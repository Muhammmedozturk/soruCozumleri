package day32Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
//ITERVİEW SORUSU
    //Size verilen bir kelimede kullanılan harflerin kacar kere kullanıldığını gösteren kodu yazınız
    //abbcaa==>a=3, b=2, c=1
    public static void main(String[] args) {
        String kelime="abbcaa";
        HashMap<String, Integer>gorunum=new HashMap<>();

        String []harfler=kelime.split("");
        System.out.println(Arrays.toString(harfler));

        for (String w: harfler){
            Integer gorunumSayisi=gorunum.get(w);
            if (gorunumSayisi==null){
                gorunum.put(w,1);

            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);
    }

}
