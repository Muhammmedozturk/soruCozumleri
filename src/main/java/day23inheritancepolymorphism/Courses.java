package day23inheritancepolymorphism;

public class Courses {
    public void liveSessions(){
        System.out.println("Courses are live");
    }
    public Courses() {
        System.out.println("Constructer A");
    }
    public Courses(String s) {

        System.out.println("Constructer B");
    }
}
