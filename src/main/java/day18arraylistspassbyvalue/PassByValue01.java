package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
    1)Java vaiablelerin orjinal değerlerini korumak ister
    2)Variable metodlar içinde kullanıldığında, Java metodun içine orjinal değeri koymaz odeğerin
    kopyasını üretir ve metoda o kopyayı yollar. metod kopya üstünde değişiklik yapar dolayısıyla variable'in orjinal
    değeri korunmuş olur bu sisteme Pass By Value denir.

    Not: "Java Pass By Value" kullanır
    Not: bazı programlama dilleri orjinal değeri koruma altına almamıştır. bu işi developerlara bırakmıstır.
        bu tarz diller "Pass By Referance" kullanır
     */
    public static void main(String[] args) {
        //metotlar main metodun dışında oluşturulur
        int x=5;//gömlek

        System.out.println(x);//sonuç 5

        //statik metod olan "main metod"un içindeki herşey statik olmalıdır

        change(5);//öğrenci gömleği

        System.out.println(x);//==>5 orjinal değer

        int ucret =100;
      int kopya=  indirim(ucret);
        System.out.println(kopya);
        System.out.println(ucret);

        }
        public static void change (int a){
        System.out.println(a*5);


    }
    //void dışındaki return typlerde metod bady si içinde return keyword kullanılmalıdır
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }
}
