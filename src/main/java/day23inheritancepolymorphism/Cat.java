package day23inheritancepolymorphism;

public class Cat extends Mamal {
    public void miyav(){
        System.out.println("miyav");

    }

    //@override komutunu kullanarak javanın yaptığımız override işlemini kontrol etmesini sağlarız
    //başında @ işareti varsa buna annotation denir

    /*
    1)Override yaparken metodun body si değiştirilir.
    2)Override yaparken asla method signature(isim ve parametre) dokunulmaz.
    3)Override yaparken "inheritance" olmak zorundadır
    4)Override yaparken acces modifierlar belli kurallara göre farklılaştırılabilirler
        i)Private metotlar override edilemezler
        ii)Chid classtaki override edilen metodun acces modifieri parent classtaki metodun access modifieri ile aynı
        veya daha geniş olmalıdır
    Not: Child classtaki metodun acces modiferi daha dar olamaz
        iii)Default meotlar aynı package içiindeyse override edilebilirler. farklı packageden override edilemezler
    5)Parent classtaki metodun return typı void ise return type değiştirilemez
    6)Parent classtaki metodun return typı primitive ise return type değiştirilemez
    7)Parent classtaki metodun return typı wrapper class ise return type değiştirilemez
    8)Parent classtaki metodun return typı cild class ise return type childlardan biri olbilir

    Not:Chid classtaki return type parent classtakinden buyuk veya geniş olamaz

    Not:Aralarında Parent child ilişkisi olmayan Classlar overridingte return type değişiminde kullanılamazlar
    Mesela "Short" Integerdan küçüktür fakat aralarından parent child ilişkisi olmadığından integer yerine
    short kullanamazsınız.
    Not: Childtaki metodun return typından parentaki metodun return typına gidişte  IS-A relationship olmalı
    aralarında IS-A HAS-A relationship ilişkisi olan data typlara COVARİANT denir

   10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
    "final" method body degistirilmesine musaade etmez.
   11)Polymorphism = Overloading + overriding
   Not=Polymorphism nedir derlerse Overloading ve overriding anlatınız
   12)Overloading ve overriding arasındaki farklar nelerdir
        --Overloading için inheritance gerekmez fakat overriding için geekir
        --private metodlar Overload edilebilir override edilemezler
        --final metodlar overload edilebilir overrride edilemezler
        --Overloading static polymopihsm olarak overriding dinamic polimotphism olarak adlandırılır
        çünkü static metotlr overload edilebilir override edilemezler
        --overloadingde metod signature değişir overridingde metod signature dokunulmaz
        */

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public Integer multply(int a, int b) {
        return a*b+1;
    }
//Aşağıdaki metod Override olarak adlandırılır
    @Override
    public Animal create() {
        return new Mamal();
    }
}
