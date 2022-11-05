package day07ternarystringmanipulation;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*
        string class metodları
        1)equals():iki stringin aynı olup olmadığını anlamamıza yarıyor
                  : equals metodu "boolean" return eder
        2)equalsIgnoreCase: iki stringin aynı olup olmadığını buyuk küçük harfe dikkat etmeden anlamamızı sağlar.
                           :equalsIgnorecase metodu boolean return eder
        3)toLowerCase: bir stringteki tüm harfleri küçük harfe çevirmek için kullanılır
                     :toLowerCase metodu string return eder
        4)toUpperCase: bir stringteki tüm harfleri büyük harfe çevirmek için kullanılır
                     :toLowerCase metodu string return eder
        5)chatAt: bir stringden belli bir indexdeki karekteri almak için kullanılır
                :char return eder
        6)length:Bir stringte kaç tane karakter kullanıldığını öğrenmek için kullanılır
                :length metodu int return eder
        7)contains:Bir stringte belli bir karakterin veya veya karakterlerin var olup olmadığını anlamak için kullanılır.
                  :contains metodu boolean return eder.
        8)split:bir stringi istediğimiz karekterden parçalamaya yarar.
               :split metodu array return eder
         */
        //bir passwordun geçerli olup olmadığını aşağdaki kurallara göre kontrol eden kodu yazınız
        //en az sekiz karakter içermeli
        //space karakteri içermemeli
        //ilk harfi "M" veya "m" olmalı
        //son karakteri "?" olmalı
        String pwd="Manisa12?";

        boolean first= pwd.length()>7;  //en az sekiz karakter içermeli
        //space karakteri içermemeli
        boolean second=!pwd.contains(" ");//"!" ünlem olumsuzluk anlamı katar
        //ilk harfi "M" veya "m" olmalı
        boolean third= pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
        //son karakteri "?" olmalı
        boolean fourth= pwd.charAt(pwd.length()-1)=='?';
        System.out.println(first && second && third && fourth);


    }
}
