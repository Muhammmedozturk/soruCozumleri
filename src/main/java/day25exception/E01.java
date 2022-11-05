package day25exception;

public class E01 {
    /*
    1)exception(istisnai hata) java da kodlarımız çalıştırırken meydana gelen beklenmedik durumlardır
    2)exceptionlar ile çalışmanın iki yolu vardır
        a)try catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme
        b)throw exception kullanarak calışmayı durdurma(mesela yazdığımız kod gereği
        bir dosya üzerinde okuma yapmamız gerekiyor ise bu dosyamız eğer silinmiş ise java dosyayı bulamaz
        ve uygulamanın devam etmesi gerekmez)
   3)eğer exceptionu handle etmez isek java çalışmayı durdurur
   4)try catch kullanırken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz
   5)try catch olmaksızın yalnız kullanılamaz
   6)Eğerki yazmış olduğunuz herhangi bir kod satırında problem olabileceğini düşünüyorsanız try catch block
   içine koymalısınız
   7)catch block parantezi içerisine olması muhtemel exception class ismi yazılır
   8)e.getMessage() metodunu kullanarak teknik mesajlar elde edebiliriz
   System.outPrintln() burada yazmıs olduğum mesajlar benim teknik olmayan
   e.printStackTrace() metodu exception ile ilgili detaylıca teknik mesaj verir. kod calışmaya devam eder
   System.err.println(): hata mesajını renkli olarak verir bu sayede consolda diğer mesajlardan ayırmak için kullanırız
   9)eğer try body içindeki kod sorunsuz çalışırsa catch block devreye girmez
     */
    public static void main(String[] args) {
        divide(6,2);
        divide(0,2);
        divide(6,0);//matematikte bir sayı 0 ile bölünemez

        divide2(5,0);
    }
    // 1.yol tavsiye edilmez
    // bir developer için tüm matematik kurallarını ezbere bilmek mümkün değildir
    public static void divide (int a, int b){
        if (b==0){
            System.out.println("bir sayı 0 ile bölünemez");
        }else
        System.out.println(a/b);

    }
    //ikinci yol try catch kullanarak exceptionu handle etmek tavsiye edilir
    public static void divide2 (int a,int b){

try {
    System.out.println(a / b);
}catch (ArithmeticException e){
    System.out.println("bölme işleminde bir problem oluştu"+e.getMessage());
}

//Java matematik ile ilgili karşılaşılması muhtemel tüm istisnaları hataları ArithmeticException classına koymuştur
// Matematikteki tüm itisnaları detayları bilmek zorunda değilim


    }
}
