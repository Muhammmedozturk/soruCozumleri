package day11Loops;

public class ForLoop02 {
    //example 1: bir stringteki m karakteri hariç tüm karakterleri yazdırınız
    public static void main(String[] args) {
        String str = "muhammed";
        for (int i = 0; i < str.length(); i++) {//burada str ilk indexindeen başlar
            char c = str.charAt(i);//örneğin 0 daki harfi alır chardeğişkenine atar
            if (c != 'm') {//burada c nin içindeki karakter m ye eşit değilse yazdır anlamına gelir
                System.out.print(c);
            }
            //2. yol
            //Loop'un içinde bazı değerler için Loop'un çalışmamasını isterseniz continue kullanırız
            for (int a = 0; a < str.length(); a++) {
                char c1 = str.charAt(a);
                if (c1 == 'm') {
                    continue; // eger 'c' 'm' ye eşitse boş ver onu diyecem
                }
                System.out.println(c1);
            }
            //example 2: birden 100 e kadar tüm tamsayıları ekrana yazdırınız
            //6 ile bölünenler hariç
            for (int b = 1; b < 101; b++) {
                if (b % 6 == 0) {
                    continue;

                }
            }System.out.print(i);
        }
//examle 3: verilen bir stringteki 'm' den önceki karakterleri yazdırınız.
        //Luksemburg ==>Lukse
        String s="Luksemburg";
        for (int i=0; i<s.length(); i++){
            char k=s.charAt(i);
            if (k=='m'){
                break;//Loop'u kırar burda keser ve Loop'un dışına atar
            }
            System.out.println(k);
        }

    }}
