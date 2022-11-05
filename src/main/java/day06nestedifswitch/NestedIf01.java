package day06nestedifswitch;

public class NestedIf01 {
    /*
    passwordun ilk harfi büyük harf ise
    'A' olursa geçerli password aksi halde geçersiz password
    passwordun ilk harfi küçük harf ise
    'z' olursa geçerli password aksi halde gecersiz password
    Note:java nested kodları çalıştırırken çok zaman harcar time complexity denir
    bu yüzden mümkünse nested kod yazmamaya çalışınız
     */
    public static void main(String[] args) {

        String pwd = "5xy12!";
        char ilkharf=pwd.charAt(0);
        if (ilkharf>= 'A' && ilkharf <= 'Z') {
            if (ilkharf == 'A') {
                System.out.println("geçerli");
            } else {
                System.out.println("geçersiz");
            }
        } else if (ilkharf >= 'a' && ilkharf <= 'z') {
            if (ilkharf == 'z') {
                System.out.println("geçerli");
            }else {
                System.out.println("geçersiz");
            }
        }else {
            System.out.println("ilk karakter harf olmalıdır");
        }
    }}
