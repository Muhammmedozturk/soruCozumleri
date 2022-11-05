package day12Loops;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        //Example 1:aşağıdaki şekli ekrana yazdıran kodu yazınız
        // ****
        // ****
        // ****
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını gir:");
        int satir= input.nextInt();
        System.out.println("Sütun sayısını gir:");
        int sutun= input.nextInt();
        System.out.println("karakter seçiniz:");
        char ch=input.next().charAt(0);
        for (int i=1;i<satir;i++){
            for (int k=1;k<sutun;k++){
                System.out.print(ch);
            }
            System.out.println();
        }//example 2: aşağıdaki şekli çizen kodu yazınız
        //          1
        //          1 2
        //          1 2 3
        //          1 2 3 4
        //          1 2 3 4 5
        for (int i=1;i<6;i++){
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }//example 3: aşağıdaki şekli çizen kodu yazınız
        //        * * * *
        //        * * *
        //        * *
        //        *
        int row=5;
        for (int i=1;i<=row;i++){
            for (int k=row; k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
