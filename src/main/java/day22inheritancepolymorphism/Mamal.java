package day22inheritancepolymorphism;

public class Mamal extends Animal {
    public int a = 13;
    public int b = 34;

    public void eat() {
        System.out.println("Mamal eat");
    }

    public void drink() {
        System.out.println("Mamal drink");
    }

    public Mamal() {
        System.out.println("Mamal");
    }
}
