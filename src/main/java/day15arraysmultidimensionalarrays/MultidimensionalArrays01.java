package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {
        //bir arrayın elemanları array ise bu arraylar multidimentional arraydir.
        //multidimensional array nasıl oluşturulur

        int arr [][]=new int [3][2];
        System.out.println(Arrays.deepToString(arr));
        //multidimensional Array lara eleman ekleme nasıl yapılır
        arr[1][0]=6;
        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;
         //multidimensional array konsola nasıl yazdırılır
        System.out.println(Arrays.deepToString(arr));

        //multidimensional array lerde Array elemanlardan birini yazdırmak
        System.out.println(Arrays.toString(arr[1]));

        //iç arraydekileri nasıl yazdırırız
        System.out.println(arr[1][0]);

        //example 1: String bir multidimensional array oluşturunuz
        // eleman ekleyiniz sonra da toplam eleman sayısını ekrana yazdıran kodu yazınız
        String brr[][]=new String[4][3];
        brr [0][0]="A";
        brr [0][1]="B";
        brr [0][2]="C";

        brr [1][0]="D";
        brr [1][1]="E";
        brr [1][2]="F";

        brr [2][0]="G";
        brr [2][1]="H";
        brr [2][2]="I";

        brr [3][0]="J";
        brr [3][1]="K";
        brr [3][2]="L";
        System.out.println(Arrays.deepToString(brr));
        int sum=0;
        for (String[] w:brr){
            sum=w.length+sum;
        }

        System.out.println(sum);
    }
}
