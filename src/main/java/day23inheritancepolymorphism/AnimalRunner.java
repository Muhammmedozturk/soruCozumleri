package day23inheritancepolymorphism;

public class AnimalRunner {
    public final int age=12;//final inglizcede son haldir
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        //parent classta uygulamasını beğenmediğimiz metodun değiştirerek kendi clasımızda kullanmak için yaptığımız
        //güncelleme overriding olur
    }
}
