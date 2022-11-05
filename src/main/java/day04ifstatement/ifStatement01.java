package day04ifstatement;

public class ifStatement01 {
    public static void main(String[] args) {
        //if it rains I will cancel the picnic
        //if teki şart doğru olursa sonuç akve olur
        //if teki şart yanlış olursa sonuç deactive olur
    //if statement belli kodları belli şartlara bağlı olarak çalıştırmaya yarar
        //example 1:sayı pozitif ise ekrana pozitif yazdırın.
        int s=12;
        if(s>0){
            System.out.println("positive");

        }
        //example 2: verilen karakter büyük harf ise ekrana büyük harf yazdırın
        char a='B';
        if (a>='A'&& a<'Z') {// &&(and) anlamı ve olarak kullanılır && işlemi sadece boolean larla kullanılır
            System.out.println("Büyük harf");

        }
        /*
        && işlemi sadece boolean ile kullanılır
        true && true =true
        true && false=false
        false && true= false
        false && false= false
        && işlemi mükemmeliyetçidir true sonucunu alabilmek için herşey true olmalıdır
        bir tane false varsa sonuç falsedir
         */
        //verilen bir sayı üç basamaklı ise ekrana üç basamaklı yazdırınız
        int sayi=-213;
        sayi=Math.abs(sayi);//matematik fonksyonunu kullanarak negatif olan sayının mutlak değerini (abs)
        // alır ve sayi değişkenine atar
        if(sayi>99 && sayi<1000){
            System.out.println("sayı üç basamaklıdır");

        }
        //example 4 verilen bir sayı çift sayı ise ekrana çift sayı yazdırınız
        int p=-14;
       p= Math.abs(p);
        if (p%2==0){//javada tek eşittir işareti atama öperatörüdür. matematikteki eşittir anlamına gelmez
            // javada iki eşittir yanyana konulduğunda eşittir anlamına gelir.
            System.out.println("çift sayıdır");
            //javada p%2 demek p yi ikiye böl kalanını al demektir

        }
        //example 5:verilen bir sayı 300 den küçük veya 1200 den büyük ise ekrana harika sayı yazdırın
        int r=250;
        if (r<300 || r>1200){// javada || veya anlamına gelir bu işaret sadece booleanlar ile kullanılır
            System.out.println("harika sayı");
            // true || true =true
            // true ||false=true
            //false ||true=true
            //false ||false=false
        }
    }

}
