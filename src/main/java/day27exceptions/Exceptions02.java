package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
    1) FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
     new den sonraki FileInputStream hata verir çünkü biz javaya verilen adresteki dosyaya git dedik
     java iki endişeye kapıldı i) ya adres yanlışsa ii) ya verilen adreste dosya yoksa
     biz metod isminden sonra "throws FileNotFoundException" yazarak bu iki endişe duyduğun durum oluşursa
     eception at dedik.

     2)     while((k = fis.read()) != -1){ yazdığımızda read metodu hata verir. Çunku biz javaya
     dosyadaki karakterleri oku dedik. Java bir endişeye kapıldı i)ya okuması gereken karakterler Javanın
     bilmediği karakterlerse Biz method isminden sonra "throws IOException" yazarak bu durumla karşılaştığında
     exception at dedik.

     3) Method isminden sonra "throws IOException" yazarsanız java "throws FileNotFoundException" nı siler çünkü
     "throws IOException", "throws FileNotFoundException" i kapsar. IOException FileNotFoundException in parentidir.
     onun yaptığı herşeyi yapabilir. o yüzden IOException varken FileNotFoundException a gerek yoktur


     IOException input output exception demektir.

    4)Gördüğünüz gibi IOException ve FileNotFoudException biz kod yazarken ortaya çıktı daha run butonuna basmadan
    ortaya çıktı bu tarz exceptionlara compile time Exception denir diğer adları checked exceptiondur.

    compile time exceptionlar kesinlikle halledilmelidir(Exception Handling) halletmeden kod yazmaya devam etmeyiniz

     */

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();
        readTheText();

    }

    //Bir text file'daki text'i okuyan kodu yaziniz.
    //1.yol
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

        int k = 0;


        while((k = fis.read()) != -1){


            System.out.print((char)k);


        }

    }
    //2.yol
    public static void readTheText() {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }

    }}