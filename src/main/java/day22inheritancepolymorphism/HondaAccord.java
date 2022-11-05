package day22inheritancepolymorphism;

public class HondaAccord extends Honda{
    /*
    1)Siz class oluşturduğunuzda java otomatik olarak size görünmez bir constructer verir
    çünkü clasın bir template yani kalıp olduğunu ve object oluşturmak için
    yaratıldığını ve object oluşturmak için constructerin şart olduğunu bilir.
    2)Java nın otomatik olarak oluşturduğu bu görünmez constructura default constructer denir
    3)Siz kendiniz herhangi bir constructer oluşturduğunuzda java default constructeri siler
    4)Bir class ta birden fazla constructer olabilir. Fakat bu consturctırların paramatereleri farklı olmalıdır.
    5)This keyword bu class anlamındadır this.price demek bu classtaki price isimli variable demektir
    this.price syntaxi constructurların içinde kullanılır
    6)Constructor kullanarak variableler üzerinde yaptığınız değişimler sadece object üzerindeki
    variablelerin değerlerini değiştirir. class taki variable değerlerini değiştiremez
     */
    public int price;
    public int year;
    public String Make;
    public String Model;
    public HondaAccord(){

    }
    public HondaAccord(int price){
this.price=price;

    }
    public HondaAccord(int price, int year){

        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");
    }
    public HondaAccord(int price, int year, String Make, String Model){
        this.price=price;
        this.year=year;
        this.Model=Model;
        this.Make=Make;

    }
}
