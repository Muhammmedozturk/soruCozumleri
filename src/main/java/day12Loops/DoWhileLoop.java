package day12Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<1){// while loop için loop body si içindeki kodun hiç çalıştırılmama ihtimali vardır
            System.out.println("while loop");
            i++;
        }// while loop bazı durumlarda hiç çalışmayabilir. yani while loop için zero execution mümkündür.
        int k=1;
        do{
            System.out.println("do while loop");
            k++;
        }while (k<1);
        // do while loop kullandığınızda loop bady si içindeki kod en az bir kere çalışır.
        // yani do while loop için zero execution mümkün değildir.

        //example 1: bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz
        // 24.5673 sadece virgülden sonraki kısmı topliyacağız
        double num=24.5673;//noktadan sonrasını ayırmak için doubleyi stringe çviririm
        String str=String.valueOf(num);//string.valueof metodu parantezin içine konan datanın tipini string yapar

        //regex için nokta kullandığınızda önüne "\\" koyunuz yani nokta "\\." şeklinde kullanılır.
        String decimalPart=str.split("\\.")[1];
        System.out.println(decimalPart);
        int decimalınt=Integer.valueOf(decimalPart);
        System.out.println(decimalınt);
        int sum=0;

        do {

            sum=sum+decimalınt%10;
            decimalınt=decimalınt/10;
        }while (decimalınt>0);
        System.out.println(sum);
        }

}
