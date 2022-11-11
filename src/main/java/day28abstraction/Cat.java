package day28abstraction;

public class Cat extends Mammal{
    /*
    bir metod parent classta abstract ise child class o metodu override edip kullamak zorundadır
    bu yüzden herhangi bir fonksyonu child class için mecburi yapmak isterseniz o metodu abstract yapmalısınız
     */

    @Override
    public void eat() {
        System.out.println("cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }
}
