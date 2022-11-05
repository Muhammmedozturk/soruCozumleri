package day18arraylistspassbyvalue;

public class Varargs01 {

    //1)ffarklı sayılardaki parametrelerle çalışabilen bir metod oluşturmak isterseniz varargs kullanmalısınız
    //2)"varargs" arka tarafta array kullaır bu yüzden varargslarla çalışırken arraylarla çalışıyormus gibi davranabilirsiniz
    //3)varargs oluşturmak için "data tipi... <varargs ismi> veya data tipi ...<varargs ismi>
    //4)Bir metodta varargs'ın yanında başka bir parametre kullanılabilir mi? varargs en sonda olmak şartı ile kullanılabilir
    //5)Bir metodda birden fazla varargs kullanılabilir mi? kullanılamaz çünkü varags en sonda olmalı dolayısıyla birden fazla
    //kullanıldığı taktirde en az biri en sonda olmayacaktır bu da 4. kural ile çelişir
    public static void main(String[] args) {

//        int r1=add(2,3);
//        System.out.println(r1);//5 verir
//
//        int r2=add(2,3,4);
//        System.out.println(r1);//9 verir
//
//        int r3=add(2,3,4,10,23,56,85);
//        System.out.println(r3);//
        //iki sayının toplamını return eden
        //iki sayının toplamını return eden bir metod oluşturunuz
    }

//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int add(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    //istediğimiz kadar sayıyı toplayabileceğimiz bir metod oluşturalım
    public static int add(String str, int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
    }
       return sum;
    }
}