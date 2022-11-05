package day10StringmManipulations;

public class StringManipulations {

    public static void main(String[] args) {
        //Startswith kodu ilk 5 karakterden sonraki stringe bakar ve o sitringin kola ile başlayıp başlamadığını
        //kontrol eder. kola ile başlıyorsa true başlamıyorsa false return eder
        String a="Java kolaydır";
        boolean b=a.startsWith("kola", 5);
        System.out.println(b);

        //replacefirst bu kod stringteki ilk a yı "*" çevirir
        //sadece replace yazsaydım bu kod sitrinteki tüm aları "*" çevirir.
        String c= a.replaceFirst("a","*");
        System.out.println(c);//j*va kolaydır

        //concat metodu iki tane stringi birbirine yapıştırmaya yarar
        //concatination işlemi iki türlü yapılabilir birincisi + ile yapılabilir ikincisi concat ile yapılabilir.
        //java bir işlem için metod üretmisse o metodu kullanmak best practicedir.
        String d=a.concat("  anladın mı?");
        System.out.println(d);


        //trim metodu bir stringin baş ve sonundaki space karekerlerini siler aradaki space karekterlerine dokunmaz
        String e="   Tom Hanks    ";
        System.out.println(e);
        String f=e.trim();
        System.out.println(f);

//bu kod iki tane stringi alfabetik olarak (lexikografik) olarak karşılaştırır. büyük harf küçük harfe duyarlıdır.
        //büyük harf küçük harfe duyarlı olmasını istemezeniz comparetoignorecase kullanılabilir
        //bu kodda h nin alfabetik sırasından i nin alfabetik sırası çıkarılır
        String h="Java";
        String i="asla";
        int k=h.compareTo(i);
        System.out.println(k);
        //a repeat(5) kodu a stringini yan yana 5 kere yazar yapıştırır
        //java dokumantasyonuna ulaşmak içinwindow kullanıcıları Ctrly basılı tutarak metodun üzerine
        // gelerek içine girerek döndürdüğü data tipini gösterir
        String n=a.repeat(3);
        System.out.println(n);

    }
}
