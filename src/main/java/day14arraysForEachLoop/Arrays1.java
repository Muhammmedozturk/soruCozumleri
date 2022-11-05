package day14arraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

    //Arrayslarin içine primitive data tipleri ve reference yerleştirilebilir
    public static void main(String[] args) {
        String str[]=new String[3];
        str[0]="Java";
        str[1]="did";
        str[2]="surprised you";
        System.out.println(Arrays.toString(str));

        //String bir array olusturunuz ve "tom" ve tomdan önceki tüm elemanları ekrana yazdırnız

        String arr []={"Jane", "Mark", "Chiristopher", "Tom", "Ali", "Rojda"};
        for (String w: arr){
            System.out.print(w + " ");
            if (w.equals("Tom")){
                break;
            }
        }

        ////String bir array olusturunuz ve "tom" ve Jane hariç tüm elemanları yazdırınız

        String brr []={"Jane", "Mark", "Chiristopher", "Tom", "Ali", "Rojda"};

        for (String w:brr){

            if (w.equals("Tom") || w.equals("Jane")){
                continue;//boşver anlamına gelir
            }System.out.print(w+" ");

        }
        //examle 3: Kullanıcı ile beraber bir array oluşturunuz ve içine data ekleyiniz
        //   bir öğretmenin sınıfındaki öğrencilerin isimlerini applcationa yüklemesini sağlayan kodu yazınız

        Scanner input =new Scanner(System.in);
        System.out.println("kaç öğenci ismi gireceksiniz..:");
        int numOfStd= input.nextInt();

        String names []=new String[numOfStd];
        System.out.println("Girişi sonlandırmak için q harfine basınız ");

        for (int i=1;i<=numOfStd;i++){

            System.out.println("Lütfen "+ i+". öğrencinin ilk ismini giriniz");


            String stdName=input.next();
         if (stdName.equalsIgnoreCase("Q")) {
             break;
         }
            names[i-1]= stdName;


            }  System.out.println(Arrays.toString(names));
        }

        }



