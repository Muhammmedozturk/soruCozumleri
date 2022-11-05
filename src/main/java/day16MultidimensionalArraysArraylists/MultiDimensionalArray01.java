package day16MultidimensionalArraysArraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        //array veya collection varsa for each loop kullanmak ilk tercihiniz olsun
        //array ve collection var ama index kullanmak zorundaysanız for each loop çalışmaz for loop kullanmak durumundasınız

        //bir tane multidimensional array oluşturunuz
        //bu arraydaki tümsayıların toplamını veren kodu yazınız

        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int sum=0;
        for (int[] w:arr){
            for (int k:w){
                sum=sum+k;
            }
        }
        System.out.println(sum);
        //bir multidimensional arrayı normal arraya çeviren kodu yazınız
        //{{2,5,1}, {32,75}} ==> {2,5,1,32,75}

        //öncelikle multidimensional arraydaki eleman sayısını bulunuz
        //çünkü yeni bir array oluşturmalıyız ve bu yeni arrayın uzunluğu (length) orjinal arrayın eleman sayısına eşit olmalıdır
        int brr[][]={{2,5,1},{32,75}};
        int toplam=0;
        for (int [] w:brr){
            toplam=toplam+w.length;
        }
        int idx=0;
        int crr[]=new int[toplam];
        for (int [] w:brr){

            for (int k: w){
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));
    }
}
