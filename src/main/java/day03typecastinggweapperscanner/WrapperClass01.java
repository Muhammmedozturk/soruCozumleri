package day03typecastinggweapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        //Primitive + Method===>Wrapper Class
        /*
        Java primitivelere metotlar ekleyerek yeni bir yapı oluşturdu. Bu yapıya "Wrapper Class" diyor.
        Primitive   Wrapper Class
            byte   ==>  Byte
            short  ==>  Short
            ***int   ===> Integer
            long  ===> Long
            float ===> Float
            double===> Double
            boolean==> Boolean
            ***char   ==> Character

            note:Wrapper Classlar Non Primitivedir.
         */
    byte primitiveByte = 12;//primitiveByte yazıp nokta koyduğumuzda hiç metod göremezsiniz.
        // Çünkü primitiveler method içermez.

    Byte wrapperByte =12;//"wrapperByte" yazıp nokta koyduğumuzda birçok metod görürüz.
        // Çünkü wrapperlar metod içerir.

        //byte data tipinin en küçük ve en büyük değerini ekrana yazdırınız.
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
    //example 2 short int long data tiplerinin en küçük ve an küçük değerlerini yazdırınız

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //primitiveler nasıl wrapperlara çevrilir bu işleme "Autoboxing" denir.
        float f1 = 13.99F;
        Float wrapperF1 = f1;
        //wrapperlar primitivlere nasıl çevrilir bu işleme "unboxing" denir
        Character w1 ='s';
        char primitiveW1 = w1;
        //Autoboxing ve Unboxing java tarafından otomtik olarak yapılır

    }

}
