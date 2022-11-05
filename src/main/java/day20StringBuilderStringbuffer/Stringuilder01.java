package day20StringBuilderStringbuffer;

public class Stringuilder01 {
    /*
    1)StringBuilder Java da bir class'dır.
    2)StringBuilder string oluşturmaya yarar
    3)"String" class varken niçin stringBuilder'e ihtiyaç duyarız Çünkü String Immutable Class'tır. Ama biz bazen
    Mutable stringlere ihtiyaç duyarız stringBuilder "Mutable" string verir
    Mutable ==> değişime açık demek
    4)Immutable Class larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde
       ---memoryde yeni bir variable yeni değerle oluşturulur
       ---eski variablenin pointeri yeni variable'a döndürülür
       ---eğer bir variableyi hiçbir pointer göstermiyorsa o variable garbace collector tarafından silinir

       Mutable classlarda var olan değer değiştirilebilir orjinal değer korunmaz
    5)String classların Immutable yapısı security için önemlidir.
        aynı değer sahip birden fazla string olduğunda java bir tane conteyner oluşturur ve aynı değere sahip
        stringlerin bu conteyneri kullanmasını temin eder. Bu memory korumak için iyidir. Ancak onteynerdeki
        değeri bir variable için değiştirdiğimizde tüm variablelerin etkilenmesi tehlikesi vardır. Bu tehlikeden
        kurtulmak için java stringleri immutable yapmıştır. Fakat herhangi bir variablenin değerini
        değiştirmek için java bir yol bulmuştur. Değiştirmek istediğimiz variable için yeni bir conteynir oluşturur.
        ve variablenin pintırını bu yeni variableye yönlendirir. böylelikle hem değişim sağlanmış hem de
        diğerleri etkilenmemiş olur
     */
    public static void main(String[] args) {
String str="Java";


//StringBuilder nasıl oluşturulur
        //1.yol
        StringBuilder strb1=new StringBuilder("Java");
        // 2.yol
        StringBuilder strb2=new StringBuilder();

        //Yol A:
        strb2.append("Java");//append metoduyla stringe ekleme yapılabilir
        strb2.append(" is easy");
        strb2.append("!!!!");
        System.out.println(strb2);

        //Yol B:
        strb2.append("Learn").append(" java earn").append(" money");//metod Chain(zinciri)
        System.out.println(strb2);

        //StringBuilder larda karakter sayısı nasıl bulunur?
        StringBuilder strb3=new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");
        int numOfChar =strb3.length();
        System.out.println(numOfChar);

        //Capacity aşımlarında capacity var olanın iki katının iki fazlasına çıkar 16+16+2 =34 verir
        int capasty =strb3.capacity();//normal kapasite 16 dır 16 yı aşınca 16+2 ekliyor
        System.out.println(capasty);


        strb3.setCharAt(2,'r');//setCharAt==index 2 deki karakteri "r" ye çevirir.
        System.out.println(strb3);

        strb3.delete(3,18);//delete (3, 18) index 3 ten 3 dahil index 18 e kadar tüm karakterleri siler
        System.out.println(strb3);

        strb3.deleteCharAt(2);//deleteCharAt(2)==index 2 deki karakteri siler
        System.out.println(strb3);
//mutable lerde sadece metod kullanmak orjinal değeri değiştirmek için yeterlidir.
        strb3.reverse();//reverse() metodu string builderi ters çevirir. Ali==ila
        System.out.println(strb3);


//immutablelerde orjinal değeri değiştirmek için metodu kullanmak yeterli olmaz bir de atama işlemi yapmalısınız
        String abc="Java";
        abc.replace("a","i");
//toString metodu strinbuildeleri stringe çevirir.
        String stringStrb3=strb3.toString();
            System.out.println(stringStrb3);
            //stringden de StringBuildere aşağıdaki gibi dönebilirsiniz
            StringBuilder strb4=new StringBuilder(stringStrb3);//stringe çevirdiğimiz variableyi tekrar StringBuildere çevirdik
            System.out.println(strb4);

            strb4.insert(2,"XXX");//ınsert ilk 3 karakteri atla sonrasına da "XXX" koyar
            System.out.println(strb4);

            //insert 3. karakterden sonra "Kmm" nin 0. karakterinden 3. karakterlerini yerleştirir.
            strb4.insert(3,"Kmm",0,3);
            System.out.println(strb4);
            //ComppareTo metodu: StringBuilderler tamamıyla aynı ise 0 verilir
            //a alfabetik sırada b den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir.
            //a alfabetik sırada b den önce gelirse negatif olarak aradaki alfabetik sıralama farkını gösterir
           StringBuilder a=new StringBuilder("java");
           StringBuilder b=new StringBuilder("Java");
           int snc=a.compareTo(b);
            System.out.println(snc);




    }
}
