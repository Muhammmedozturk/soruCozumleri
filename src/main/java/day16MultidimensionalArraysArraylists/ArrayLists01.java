package day16MultidimensionalArraysArraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*
        ArrayListler aynı data tipine sahip birden fazla datayı depolamak için kullanılır
        array ile arrayListin farkı nedir? interview sorusudur
        1) array oluştururken arrayin içine kaç tane eleman koymamız gerektiğini söylemeliyiz
        ve söyledğimiz eleman sayısından fazla elean koyamayız. Arraylar eleman sayısında "fixed" dirler.
        ArrayList oluştururken eleman sayısı belirtmeye gerek yok çünkü arrayListler eleman sayısında flexibe dirler
        2)Array'ların içine "primiteve" ve referanceler konabilir.
        ArrayListlerin içine ise sadece "Non Primitiveler" konabilir
        3)Arraylar super fast, çok hızlıdır, Arraylar memory çok az kullanır.
        Not: eleman sayısı kesin belli olan çoklu dataları depolamak için array kullanırız, ama eleman sayısı değişken olan
        çoklu datalar için array kullanma riskini almayın.
         */

        //Arraylist nasıl oluşturulur?
        //1.yol
        ArrayList<Integer>ages= new ArrayList<Integer>();
        //2.yol
        ArrayList<Integer>heights= new ArrayList<>();
        //3.yol
        List<Integer> nums= new ArrayList<>();


        //ArrayListler nasıl yazdırılır
        System.out.println(nums);

        //ArrayListe nasıl eleman eklenir
        //Add metodu her zaman elemanı en sona ekler buna (insertion order yani yerleştirme sırasına göre)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);
        nums.add(1,50);//index 1 e 50 yi yerleştir demek// bunda java hiçbirşey return etmez
        //add metodu boolean return eder yani tru veya false. true görev tamam demek. false yerleştirilemedi demektir
        List<Integer> prices=new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);//AddAll metodu başka bir listi yazdığınız (nums) listin içine ekler. ama alınan list aynı kalır
        System.out.println(nums);

        nums.addAll(2,prices);//nums ın içine istenieln indexin arasına başka bir list eklenebilir
        System.out.println(nums);

        //ArrayListlerin eleman sayısı nasıl bulunur
        int elemanSayisi=nums.size();
        System.out.println(elemanSayisi);

        //Arraylarda eleman sayısını length() Listlerin eleman sayısı ise size() ile öğrenilebilir

        //ArrayListlerde herhangi bir eleman nasıl seçilir
        //Get metodu istenen bir indexteki elemanı verir
       int el1= nums.get(3);
        System.out.println(el1);

        //ArrayList'in boş olup olmadığını nasıl anlarız
        boolean bos1=nums.isEmpty();
        System.out.println(bos1);

        boolean bos2=ages.isEmpty();
        System.out.println(bos2);

        //ArrayListte bir eleman nasıl değiştirilir

        nums.set(3,200);
        System.out.println(nums);

        //example 1: nums arraList deki tüm tek sayıları 11 arttırdıktan sonra ekrana yazdırınız
        for (int w: nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);// (nums.indexOf(w) komutu w ya atanan sayının indexini verir
            }
        }
        System.out.println(nums);

        //remove metodunun içine tam sayı koyarsanız java onu index olarak kabul eder.
        //Example 2:ArrayList ten 200 elemanını siliniz
        //Not: tüm tamsayılar java için aksi söylenmedikçe "primitivedir" yani "int" dir
        //not:"Primitive" ler array Listlerin elemanı olamazlar
        //not: Primitive yi Wrapper Clasa çevirirseniz non primitive olur ve non primitiveler arrayListlerin elemanı olur.

        //ArraayListten 200 elemanının ilk görünümünü siliniz
        Integer sayi=200;
        nums.remove(sayi);
        System.out.println(nums);

    }
}
