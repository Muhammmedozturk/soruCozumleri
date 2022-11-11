package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
readFileLineByLine();
    }
    /*
    "throw" ile throws arasındaki farklar nelerdir
    1)"throw" metodun body si içinde kullanılır "throws" ie metodun isminden sonra kullanılır
    2)"throw" dan sonra obje oluşturulur "throws" tan sonra ise sadece Exception Clasın ismi yazılır
    3)"throw" metodun çinde istediğimiz yerde exception üretmek için kullanılır "throws" ise varolan
    checked exceptionu atmak için kullanılır
    4)"throw"dan sonra sadece bir tane exception olabilir
    "throws" dan sonra birden fazla exception olabilir
     */

    public static void readFileLineByLine(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt")) ;
           String line= br.readLine();

           while (line!=null){
               System.out.println(line);
               line=br.readLine();

           }


        } catch (FileNotFoundException e) {
            System.out.println("ya path yanlış ya da dosya silinmiş--");
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var --"+e.getMessage());
        }
    }
}
