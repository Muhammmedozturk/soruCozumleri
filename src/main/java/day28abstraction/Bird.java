package day28abstraction;

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("birds eat");
    }

    @Override
    public void move() {
        System.out.println("birds move");
    }
}
