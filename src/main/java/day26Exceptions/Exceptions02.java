package day26Exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
    char ch1=getCharFromString("java",2);
        System.out.println(ch1);

        getCharFromString("selenium", 8);//StringIndexOutOfBoundsException: Eğer bir stringten bir karakter
        // veya kaakterler alırken olmayan bir index kullanılırsa StringIndexOutOfBoundsException alınır
    }
    //Bir stringin istediğimiz herhangi bir karakterini bize veren bir method oluşturun
    public static char getCharFromString(String str, int idx){

        char c=' ';
        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index ile ilgili bir problem oluştu"+ e.getMessage());//javanın teknik mesajını verir
           e.printStackTrace();//detaylı hata raporu veriyor
        }
       return c;
    }
}
