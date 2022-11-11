package day28abstraction;

public abstract class Animal {

    //body si olmayan metotlar abstract metod olarak adlandırılır
    //bir metodu abstract yapmak için 1) metod body i sil 2)abstract keyword kullan
    //abstract metodlar abstract class içinde olmalıdır
    public abstract void eat ();

//abstract classlarda hem abstract metod hemde "concrete"(non-abstract) metod kullanılabilir
    public void drink (){
        System.out.println("animals drink");
    }
    //abstract "move" metod oluşturunuz
    public abstract void move ();
}
