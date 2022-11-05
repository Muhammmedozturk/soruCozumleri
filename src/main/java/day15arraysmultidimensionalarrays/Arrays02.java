package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //size verilen pozitif ve negatif sayılar içeren bir integer araydaki en büyük negatif ve en küçük pozitif elemanı gösteren kodu yazınız
        int arr[]={-12,18,-5,23,-2,0};
        Arrays.sort(arr);
        int maxNegative=arr[0];
        int maxpositive=arr[arr.length-1];
        for (int w:arr){
            if (w<0){
               maxNegative= Math.max(maxNegative, w);
            } if (w>0){
                Math.min(maxpositive,w);
            }
        }
        System.out.println(maxNegative+" and "+maxpositive);
    }
}
