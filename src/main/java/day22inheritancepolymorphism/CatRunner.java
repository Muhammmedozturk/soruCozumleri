package day22inheritancepolymorphism;

public class CatRunner {
    /*
    1) Java da object oluştururken  constructerlar parentten childe doğru çalıştırılır
    2) Java en üst parent constructıra çıkabilmek için super() kodunu kullanır
    3) super() kodu her constructerin ilk satırında gizl olarak bulunur
    4)super() kodunu isterseniz görünür şekilde de yazabilirsiniz
    5)Super() kodunu görünür şekilde yazarsanız sakın ha ilk satır dısında bir satıra koymayınız hata verir
    6)Super kodu parent class tan constructer cağırmaya yarar
     */
    public static void main(String[] args) {
        Cat cat1=new Cat();

    }
}
