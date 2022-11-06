package day27exceptions;

public class Exceptions03 {

    /*
    1)Java exceptionlar oluşturarak developerların java kurallarına uymalarını temin etmiştir.
    2)Biz de application üretirken kendi exceptionlarımızı üreterek oluşturarak diğer developerların
    bizim koyduğumuz kurallara uymalarını temin ederiz
    3)bizim üretiiğimiz(Developerların) exceptionlara Custom exception denir.
    4)Custom exceptionlarda RunTimeException ve CompileTimeException olabilir
    5)Custom RunTimeException üretmek için extend RunTimeException deriz
    6)Custom CompileTimeException üretmek için extends exception deriz
     */
    public static void main(String[] args) throws IllegalGradeException {
        IllegalGradeException ige=new IllegalGradeException("abc");
        printGrades(10);
        checkNameFormat("muhammed");
    }

    //Öğrenci notlarını yazdıran bir metod oluşturunuz
    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den fazla olamaz");
        }else {
            System.out.println(grade);
        }

    }
    //Verilen ismin ilk harfinin büyük harf olmaması durumunda exception atan metod yazınız
    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllagelNameException("İsiler büyük harfle başlmalıdır");
        }
    }
}
