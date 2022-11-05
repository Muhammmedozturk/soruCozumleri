package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız
        not:toLoweCase metodu bir strigteki tüm karakterleri küçük harfe çevirir.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Ay ismi giriniz");
        String ayIsmi= input.next().toLowerCase();//kullanıcıdan aldığım ay ismini hemen küçük harfe çevirir
        switch (ayIsmi){
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayıs":
                System.out.println("mayıs");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "ağustos":
                System.out.println("ağustos");
            case "eylül":
                System.out.println("eylül");
            case "ekim":
                System.out.println("ekim");
            case "kasım":
                System.out.println("kasım");
            case "aralık":
                System.out.println("aralık");
                break;//break mola verir çalışma durur
            default:
                System.out.println("geçerli ay gir");
        }
    }
}
