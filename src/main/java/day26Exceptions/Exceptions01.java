package day26Exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        String str="2545";
        int result=convertStringToInteger(str);
        System.out.println(result+5);

        String st="1a2b";
        int result1=convertStringToInteger(st);//NumberFormatException:Eğer için de rakamdan farklı karakter
        // barınndrıran bir stringin value of metodunu kullanarak integera çevirmeknumberFormatException hatası alınır
        System.out.println(result1+10);

    }
    public static int convertStringToInteger(String str){
        int i=0;
        try {
            //herhangi bir satırda exception atılırsa java direk catch bölümüne geçer try içindeki
            // sonraki kodları çalıştırmaz

           i= Integer.valueOf(str);
            System.out.println("burası try bölümü");
        }catch (NumberFormatException e){
            System.out.println("rakam olmayan karakter içeren stringler integera çevrilemezler");
        }
        return i;
    }
}
