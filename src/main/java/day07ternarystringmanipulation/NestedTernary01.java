package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        verilen yılın ""leap year"(artık yıl) olup olmadığını kontrol eden kodu yazınız.
        i)yil 100 e bölünürse 400 e de bölünmelidir==>1600
        i))yıl 100 e bölünmezse 4 e bölünmelidir==>1996
          */
        int year =1600;
        String leap =year%100==0 ? (year%400==0 ? "leap year" : "leap year değil") : (year%4==0 ? "leap year" : "leap year değil");
        /*
        aşağıdaki kurallara göre passwordun geçerli olup olmadığını kontrol eden kodu yazınız
        i)8 karakterden fazla veya 8 karakter varsa ilk harfi küçük i olmalıdır
        ii)8 karakterden az karakterden az karakter varsa ilk harfi k olmalıdı

         */
        String pwd ="K23a";
        String gecerli=pwd.length()<8 ? (pwd.charAt(0)=='K' ? "geçerli" : "geçersi"):(pwd.charAt(0)=='i' ? "geçerli" : "geçersiz");
        System.out.println(gecerli);
    }
}
