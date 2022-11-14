package day31maps;
import com.sun.jdi.Value;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
    //metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.
    //Maplar key value srtuctor ini kullanirlar.
//Map lerde key kismi tekrarsiz data icerir(unique)
// value kismi unique olmak zorunda degildir.
//key lerde null kullanilamaz ama value lerde bu mumkundur.
//value kisminda null kullanmak munknudur.
//Null bir cok kere kullanilabilir.
//coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
//  bu iki deger depolamaya entry demisler
//mapler hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz


     1)Maplar key-value structure kullaır
     2)key ler unique dir
     3)Value ler tekrarlı dat içerebilir
     4)Maplerde eleman değil entryset kullanırız
     5)key ler null tekrarsız olarak kullanılır
     6)Valueler null kabul edr
     7)HashMapler entrySetleri herhangibir sıralamaya tabi tutmaz  rastgele sıralar
     8)sıralama ile vakit kaybetmediği için HashMapler çok hızlı çalışırlar
     */

    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 83);
        studentAges.put("null", 55);

        studentAges.put("mehmet", null);


        studentAges.put("Ali", 88);//aynı key değerini tekrar kullandığınızda hata vermez overrite yapar.
        //son girilen değeri güncelliyor
        System.out.println(studentAges);

//Maptan sadece key ler nasıl alınır
        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[Tom, null, Ajda, Brad, mehmet, Ali]

//sadece valueleri almak istersek
        Collection<Integer> values = studentAges.values();
        System.out.println(values);//[21, 55, 83, 12, null, 88]

        //belli bir key'e ait value nasıl alınır
        Integer ali = studentAges.get("Ali");
        System.out.println(ali);

        //example1: Tüm integer yaşların ortalamasını hesaplayan kodu yazınız
        int toplam = 0;
        double counter = 0;
        for (Integer w : values) {
            if (w != null) {
                counter++;
                toplam = toplam + w;


            }
        }
        System.out.println(toplam / counter);

//example 2: A ile başlamayan isimlerin içerdiği toplam karakter sayısını bulan kodu yazınız
        int toplam1 = 0;
        for (String w : keys) {
            if (w != null && !w.startsWith("A")) {
                toplam1 = toplam1 + w.length();
            }



        }System.out.println(toplam1);
//key si ajda ve valuesi 76 olan entry seti siler ve size boolean return eder
        boolean sonuc=studentAges.remove("ajda",83);
        System.out.println(sonuc);

        studentAges.remove(null);

        //Key varsa valueyi ver key yoksa bir mesaj ver
        Integer result2=studentAges.getOrDefault("brad",0);
        System.out.println(result2);

        //Value null ise ekleme yapar value null değilse ekleme yapmaz
        //key yoksa ekleme yapar
        Integer result3=studentAges.putIfAbsent("Ayhan Işık",100);
        System.out.println(result3);

        //replace metodu valueleri key e bakarak değitirdi
        studentAges.replace("Ayhan Işık",99);
        System.out.println(studentAges);
//replace metodu valueleri key ve valueyi kontrol ettikten sonra değiştirdi.
        studentAges.replace("Ayhan Işık",99,50);
        System.out.println(studentAges);

        //examle 3: Mapteki herbir entyi ekrana farklı bir satırda olacak şekilde yazdırınız

        Set<Map.Entry<String,Integer>>entries=studentAges.entrySet();
        for (Map.Entry<String,Integer> w:entries){
            System.out.println(w);
            //entryset metodu mapteki her elemanları bir setin içine koyarak size verir
        }
    }
}