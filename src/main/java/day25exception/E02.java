package day25exception;

public class E02 {
    public static void main(String[] args) {
        /*
        bir string array den index girerek eleman elde edebilmek için metod oluşturun
         */

        String arr[]={"Ali", "Can", "Veli", "Han"};
        getElementFromArray(arr,2);
        getElementFromArray(arr,0);
        getElementFromArray(arr,4);
    }
    public  static void getElementFromArray(String arr[], int idx){

        try{
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array indexte bir problem meydana geldi"+e.getMessage());

            //exceptionla ilgili detaylıca teknik mesaj ver
            e.printStackTrace();

            //hata mesajını diğer mesajlardan ayırmak için kullanırız
            System.err.println("Array indexte bir problem meydana geldi");
        }


    }
}
