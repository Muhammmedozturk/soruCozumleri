package day23inheritancepolymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Math extends Courses{
    public void practice(){
        System.out.println("solve questions");

        }
    public Math(){
        super("x");//super burada parente yönlendirir. ancak parentte 2 constructer var burada da
        // içinde string olanı secer
        System.out.println("constructer 1");


        }
    public Math(int a){
       this();//aynı classın içinde diğer konstructırı kullanmaya yarar. super
        // olsa parent classa yönlendirir ama this aynı classta diğer constructere yönlendirir
        System.out.println("Constructer 2");

    }
}
