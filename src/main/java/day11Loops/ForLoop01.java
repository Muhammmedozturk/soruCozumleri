package day11Loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //example 1. 3ten 6 ya kadar tamsayıların toplamını bulan kodu yazınız
        int sum=0;
        for (int i=3; i<7;i++){
            sum=sum+i;

        }//System out Println loopun dışına yazılırsa sum ın sadece son değerini
        // ekrana yazdırır. loop un içine yazılırsa her bir loop için sum ın hangi değerleri aldığını
        // yazdırı.
        System.out.println(sum);


        //example 2: 6 dan 3 e kadar olan tamsayıların çarpımını bulan kodu yazınız.
        int multiply=1;
        for (int i=6; i>2;i--){
            multiply=i*multiply;
        }
        System.out.println(multiply);

        //example 3: sie verilen bir tamsayının rakamları toplamını bulunuz


        int num=385252;
        Math.abs(num);//negatif sayılarla çalışması için mutlak değeri yapılır
        int sonuc=0;
        for (int i=num; i>0; i=i/10){
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);

//interview sorusu
        //example 4:Size verilen bir stringi ters çeviren kodu yzınız
        //  "kaba" verilen stringi "abak" a çeviriniz
        String ters="";//concatination yapacaksanız boş string kullanılır
        String str="muhammed Öztürk";
        for (int i=str.length()-1;            i>=0;          i--    ){
            char c =str.charAt(i);
            ters=ters+c;
        }
        System.out.println(ters);
    }
}
