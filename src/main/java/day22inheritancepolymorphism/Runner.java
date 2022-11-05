package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //inheritance de variableler seçilirken java objenin data tipine bakar
        //öncelikle istediğiniz variableyi objenin data tipi olan class ta arar
        //o class ta bulamaz sa parent class lara bakar
        //hiçbir parent class ta bulamaz sa hata verir
        Cat cat1=new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);
        Mamal cat2=new Cat();
        System.out.println(cat2.a);
        Animal cat3=new  Cat();
        System.out.println(cat3.a);
        //object oluştururken objectin data typı child classlardan seçilemez

        //inheritancede variableler seçilirken java constructere bakar
        // öncelikle istediğiniz metodu constructuru kullanılan class tan alır
        //o clasta bulamazsa parent clasa bakar
        //hiçbiryerde bulamazsa hata verir
        Cat cat4 =new Cat();
        cat4.eat();//cat içindeki eat metodunu kullanır
        cat4.drink();//cat içinde drink arar bulamaz ise parentin içine bakar

        Mamal cat5 =new Mamal();
        cat5.eat();//mamal içindeki metodu kullanır çunku constructer mamal
        cat5.drink();


        Animal cat6=new Animal();
        cat6.eat();
    }
}
