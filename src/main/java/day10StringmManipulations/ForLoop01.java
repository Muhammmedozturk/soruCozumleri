package day10StringmManipulations;

public class ForLoop01 {
    public static void main(String[] args) {
        //example 1: Ekrana 5 kere "hi" yazdırımız.
        //tekrarlı işler için loop kullanırız
        //4 çeşit loop varbır birincisi 1-for loop  2- while loop  3- do while loop 4-for each loop

        //1.for loop:
        //example ekrana 5 kere "hi" yazdırını
        //     başlangıç değeri     loop hangi şart altında çalışacak    incriment(arttırma) veya decrement(azaltma)
        for (   int i=1           ;           i<6                    ;        i=i+1                                    ){
            System.out.println("hi");
        }

        //example 3: 4 ten 7 ye kadar tüm tamsayıları ekrana yazdıran kodu yazınız
        for (int i=4; i<8; i=i+1){//i+=1 de aynı anlama gelir birde sadece 1 ile arttırmada kullanılan yöntem i++
            System.out.print(i+" ");
        }
        System.out.println();

        //example 4:14 ten 5 e kadar tüm tamsayıları ekrana yazdıran kodu yazınız
        for (int i=14; i>4; i--){
            System.out.print(i+" ");


        }
        //example 5: 14 ten 5 e kadar tüm çift sayıları yazdırınız
        for (int i=14; i>4; i-=2){
            System.out.print(i+" ");


        }
        //2.yol:
        for (int i=14;i>4;i--){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        //example 6:28 den 157 ya kadar tüm tek ayıları ekrana yazdıran kodu yazınız
        for (int i=28; i<158;i++){
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        //example 7: "java" stringini j*a*v*a* a çeviren kodu yazınız
        String str="java";
        for (int i=0    ;  i<str.length()       ;  i++){
            System.out.print(str.charAt(i)+ "*");
        }
        //example 8:size verilen stringte tekrarsız karakterleri ekrana yazdırınız
        //  helloooo Ali==>HeAi

        String s = "Hellooo Ali";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);//He Ai
        }}
    }
}
