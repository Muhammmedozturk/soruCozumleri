package day25exception;

public class E03 {
    public static void main(String[] args) {
        String str="Ali";
        getNumOfChars(str);

        String s=null;
        getNumOfChars(s);//NullPointerException
        //Eğer length metodunda null kullanırsanız bu exceptionu alırsınız

    }
    //bir stringte bulunan karakterlerin sayısını bulabilmek için bir metod oluşturunuz
    public static void getNumOfChars(String str){
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Length metodunda bir problem oluştu");

            e.printStackTrace();
            //bu metodu kullandığımız zaman sout kullanmamıza gerek yok
        }

    }
}
