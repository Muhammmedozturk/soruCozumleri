package day05ifstatement;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {
        //example kullanıcı gün numarası girsin kod gün ismini yazsın
        Scanner input = new Scanner(System.in);
        System.out.println("gün numarasını giriniz");
        byte gunNo = input.nextByte();
        if (gunNo == 1) {
            System.out.println("pazar");
        } else if (gunNo == 2) {
            System.out.println("pzartesi");
        } else if (gunNo == 3) {
            System.out.println("salı");
        } else if (gunNo == 4) {
            System.out.println("çarşamba");
        } else if (gunNo == 5) {
            System.out.println("perşembe");
        } else if (gunNo == 6) {
            System.out.println("cuma");
        } else if (gunNo == 7) {
            System.out.println("cumartesi");
        } else {
            System.out.println("geçerli bir gün numarası giriniz");
        }
    }
}