package day27exceptions;
//Eğer exception classa extend ederseniz sizin classınız compile time exception olur
public class IllegalGradeException extends Exception {

    public IllegalGradeException(String message){
        super(message);
    }
}
