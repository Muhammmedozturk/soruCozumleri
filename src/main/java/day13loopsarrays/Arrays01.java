package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {
    /*
    aynı data tipinde çoklu data yı depolamak için java nın oluşturduğu yapılar vardır
    bu yapılardan birisi arraylardir

     */
    public static void main(String[] args) {
        //array nasıl oluşturulur
        int stdAges[]=new int[7];//[0, 0, 0, 0, 0, 0, 0, ] bu şekilde java yedi yer ayırır
        //array nasıl yazdırılır
        System.out.println(Arrays.toString(stdAges));
        //Arraylara elemanlar nasıl eklenir
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));

        //Arraydaki herhangi bir elemanı nasıl yazdırabiliriz?
        System.out.println(stdAges[4]);

        //example 1:arraydaki en küçük ve en büyük elemanı ekrana yazdırınız
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk=stdAges[0];
        //Not: Length () striglerde kullanılır "length" arraylarda kullanılır
        int son=stdAges[stdAges.length-1];

        System.out.println(ilk +son);

       // example 2: stdAges Array içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız.
       int sum=0;
        //for ile çözelim 1.yol
        for (int i=0; i<stdAges.length; i++){
            sum=sum+stdAges[i];
        }
        System.out.println(sum);

        //while ile çözelim 2.yol
        int sum1=0;
        int i=0;
        while (i<stdAges.length){
            sum1=sum1+stdAges[i];
            i++;


        }
        System.out.println(sum1);


        //do whilee yöntemi ile 3.yol

        int toplam=0;
        int a=0;
        do {
            toplam=toplam+stdAges[a];
            a++;

        }while (a<stdAges.length);
        System.out.println(toplam);

        //For each loop ile yapalım 4.yol
        //bu loop arraylarda ve collectionslarla kullanılır
        int sum2=0;
        for (int w: stdAges){
            sum2=sum2+w;
        }
        System.out.println(sum2);
        //example 3: String bir array oluşturunuz bu arraya 5 tane isim yerleştiriniz bu
        // isimerdeki krakter sayılarınıntoplamını ekrana yazdırınız
        String isimler[]=new String[5];
        //array nasıl yazdırılır
        System.out.println(Arrays.toString(stdAges));
        //Arraylara elemanlar nasıl eklenir
        isimler[0]="Ali";
        isimler[1]="Tom";
        isimler[2]="Veli";
        isimler[3]="Kemal";
        isimler[4]="Cem";

        System.out.println(Arrays.toString(isimler));

        int toplamKarakter=0;
        for (String w:isimler) {
            toplamKarakter= toplamKarakter+w.length();

        }
        System.out.println(toplamKarakter);


        //example 4:char bir array oluşturunuz
        //bu arraya 5 eleman ekleyiniz sonra da bu arraydaki sadece büuük harfleri ekrana yazdırınız.

        char ch[]={'A', 'c', 'D', 'k', 'm'};
        for (char w: ch){
            if (w>='A' && w<='Z'){
                System.out.println(w);
            }
        }

    }
}
