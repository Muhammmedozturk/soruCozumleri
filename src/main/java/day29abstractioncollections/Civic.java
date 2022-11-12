package day29abstractioncollections;
/*
        Abstract metodlar sadece ne yapılacağını söyler (what to do)
        concrete metodlar ne yapılacağı (what to do) ile birlikte nasıl yapılacağını(How to do) da söyler

        interfaceler aslında yapılacak işler listesidir(to do list)

        "multiple parent interfce" kullandığınızda aynı metod ismi ile birden fazla metod oluşturursanız
        bu metodların return typeleri aynı olmalıdır. aksi taktirde hata verir

        interfacelerde constructer olmadığı için interfacede obje oluşturulamaz
        "Abstract" classlarda class oldukları için constructor vardır. Ama constructorlar abstrac classlarda
        obje oluşturamazlar

        SORU: "Abstract class ile interfacenin farkları nelerdir?"

        1)method:
        Abstract class hem abstract hem de concrete metodlar içerebilir
        interfaceler ise sadece abstract metodlar içerir. Ama istersek interfaceler içinde de default ve static
        keywordler kullanarak concrete metodlar oluşturabiliriz

        2)Variable
        Abstract claslarda normal claslardaki gibi her türlü variable oluşturulabilir
        interfacelerde ise variableler public static ve final olmak zorundadır

        3)Inheritance
        Abstract claslar class oldukları için multiple inheritance musade etmezler
        interfaceler ise multiple inheritanceyi desteklerler

        4)Object creation
        Abstract classlarda constructor vardır ama object oluşturmada kullanılmazlar
        interfacelerde ise constructer olmadığından object oluşturulmaz

        Soru:Object oriented programing lnguage prensipleri nelerdir
        1)inheritance
        2)Polimorphism
        3)Encapsulation
        4)Abstraction


 */
public class Civic implements Ac, Engine {
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }



}
