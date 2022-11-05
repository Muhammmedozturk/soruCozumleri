package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
        //method overloading nasıl yapılır?
        //1-metod isimleri aynı olmalıdır
        //2-method parametreleri farklı olmalıdır
        // --parametre sayıları değiştirilebilir
        // --parametrelerin data tipleri değiştirilebilir
        // --parametrenin yerleri değiştirilebilir ancak data tipleri farklı ise
        //3-Metod ismi + parametreler =Metod signature metod signature dışında
        // ne değiştirirseniz değiştirin java o metodları farklı kabul etmez.
        add(3,5);
      add(3,5.0);
        System.out.println();
    }

        //add(3.0,4.0);//hiçbir metodu kullanamaz onun için hata veriyor metodlar içinde iki sayının
        // da double olduğu metod yok buna "MethodOverLoading" (aşırı yüklenme) vardır





    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void add(int a, double b) {
        System.out.println(a + b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
}
}