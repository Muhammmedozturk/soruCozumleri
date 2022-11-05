package day05ifstatement;

import java.util.Scanner;

public class ifStatement01 {
    //example 1 kullanıcıdan alınan sayının tek miçiftmi olduğunu ekrana yazan kodu yazınız
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz...:");
        int s = input.nextInt();
        if (s % 2 == 0) {
            System.out.println("çift sayı");
//1. yol
        }
        if (s % 2 != 0) {//"!=" manası eşit değil anlamına gelir
            System.out.println("tek sayı");
        }
        //2.yol
        if (s%2==0) {
            System.out.println("çift sayı");
        }else{
                System.out.println("tek sayı");
            }
        //example 2 bir sayının negatif pozitif veya nötr olduğunu söyleyen kodu yazınız.
        System.out.println("bir sayı giriniz...:");
        double d=input.nextDouble();
        if (d>0){
            System.out.println("pozitif");
        } else if(d==0) {
            System.out.println("nötr");

        }else {
            System.out.println("negatif");
        }
    }
    }
