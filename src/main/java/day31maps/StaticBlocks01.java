package day31maps;

public class StaticBlocks01 {
    //static bloklar ihtiyacımız olan variablların class oluşturma safhasında elimizde olmasını sağlar.
    //static bloklar class içindeki herşeyden önce çalıştırılır "main metoddan" ve diğer tüm metodlardan önce çalıştırılır
    //static bloklar içinde sadece "statik variableler" a değer atanabilir
    //birden fazla static blok konulabilir. birden fazla static blok varsa üstteki önce çalıştırılır


    public static double pi;


    public static void main(String[] args) {
        System.out.println("main metod");

    }
    static{
        pi=3.14;
        System.out.println("static blok 1");
    }
}
