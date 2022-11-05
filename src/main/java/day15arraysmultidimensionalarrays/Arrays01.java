package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    /*
    binarySearch() method: bu metodu kullanarak bir elemanın arrayda olup olmadığın anlarız
    bu metodu kullanmadan önce mutlaka Arrays.sort() kullanılmalıdır
   binary search metodu aradığınız eleman varsa o elemanın indeksini verir
       binarySearch() method u aradığımız eleman yoksa ne yapar? olmayan eleman için -a değerini verir
       burada a nın anlamı olsaydı kacıncı sırada olduğunu gösterir
       binarySearch metodu tekrarlayan elemanlar için kullanılmaz

     */
    public static void main(String[] args) {
        int arr[]={12,31,43,14};
   int sayi=43;
        Arrays.sort(arr);
        int idx1 =Arrays.binarySearch(arr, sayi);
        System.out.println(idx1);

        int sayi2=58;
        int snc=Arrays.binarySearch(arr, sayi2);
        System.out.println(snc);
    }
}
