package day08StringManipulations;

public class StringManipultions02 {
    //bir stringdeki space hariç kaç tane karakter kullanıldığını gösteren kodu yazınız
    public static void main(String[] args) {
        String str="Ali okula gitti";
        // replace metodu bir stringteki herhangi bir karakteri veya karakterleri değiştirmek için kullanılır
       int num= str.replace(" ", "").length();
        System.out.println(num);

        //example 2: bir stringteki tüm 'a' harlerini büyük 'A' ya çeviriniz
        String s="Ankara'nın taşın gözlerimin yaşına bak.";
        String yeniS=s.replace("a", "A");
        System.out.println(yeniS);

        //example 3:bir stringdeki kara kelimelerinin yerine * koyunuz
        String t="kara kara düşünme ankara";
        String yenit=t.replace("kara", "*");
        System.out.println(yenit);

        //example 4:bir  Stringteki tüm sayıları * a çeviriniz
        String stdId="AC202117004";
        String yeniId=stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniId);
        /*
        bir grup datayı ifade eden kodlara "regex" denir.
        "regex" regular expression'un kısaltılmışıdır.
        1) tüm rakamları ifade etmek için == [0-9]
        2) tüm küçük harfler  == [a-z]
        3) tüm büyük harfler == [A-Z]
        4) tüm harfler [a-zA-Z]
        5)  sesli harfler == [aeiouAEİOU]
        6)  Space == [ ]
        7)tüm rakamlar ve tüm harfler == [0-9a-zA-Z]
        8) tüm noktalama işaretleri == \\p{punct}

        1) rakamlar hariç tüm karakterler ==> [^0-9]
        2) küçük harfler hariç tüm karakterler .== [^a-z]
        3) büyük harfler hariç tüm karakterler == [^A-Z]
        4) tüm harfler hariç tüm karakterler  == [^a-zA-Z]
        5) Space hariç == [^ ]


         */
        //example 5: verilen bir stringte kullanılan noktalama işareti, rakamlar ve space karekterleri hariç
        // tüm karakterlerin sayısını bulan kodu yazınız
        String u ="Ali 13 yaşında, dersem inanma!...";
       int sonu= u.
               replaceAll("[0-9]", "").replace(" ", "")
               .replaceAll("\\p{Punct}", "").length();
        System.out.println(sonu);
        //example 6: bir passwordun geçerli olup olmadığını aşağıdaki kurallara göre test eden kodu yazınız
        //    **space hari.en az 8 karakter olmalı
        //    ** en az  1 sembol içermeli
        //    ** en az bir rakam içermeli
        //    ** en az bir büyük harf içermeli
        //    ** en az bir küçük harf içermeli
        String pwd="B78c? Km";
        //    **space hari.en az 8 karakter olmalı
        boolean first=pwd.replace(" ", "").length()>7;
        //    ** en az  1 sembol içermeli
        boolean second=pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;
        //    ** en az bir rakam içermeli
        boolean third= pwd.replaceAll("[^0-9]", "").length()>0;
        //    ** en az bir büyük harf içermeli
        boolean fourth=pwd.replaceAll("[^A-Z]", "").length()>0;
        //    ** en az bir küçük harf içermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;
        boolean pwdGecerli=first && second && third && fourth && fifth;
        if (pwdGecerli){
            System.out.println("şifre geçerli");
        }else {
            System.out.println("geçersiz şifre");

        }
        //wexample : bir stringteki noktama işsaretleri hariç karakter sayısını gösteren kodu yazınız
        String cumle="sen yapmazsan, ben yapmazsam, o yapmazsa, kim yapacak?...";
        int number=cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);
        //example 8:  verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa ekrana harika yazdırın
        //aksi halde normal yazın
        String v="Alex";
        boolean baslagic= v.startsWith("Al");
        boolean son= v.endsWith("x");
        String result= baslagic && son ? "harika": "normal";
        System.out.println(result);
    }

}
