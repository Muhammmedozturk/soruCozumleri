package day23inheritancepolymorphism;

public class Animal {
    public void eat(){
        System.out.println("Animals eat");
    }
    public Integer multply(int a, int b){
        return  a*b;
    }
    //Aşağıdaki metod overriden metod olarak adlandırılır
    public Animal create(){
        return new Animal();
    }//final metodlar override edilemezler
    public final double divide(int a, int b){
        return a/b;
    }
}
