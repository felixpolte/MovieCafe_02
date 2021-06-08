package Java.Exceptions;

public class LoginFailedException extends RuntimeException{
    public LoginFailedException(String Error){
        super(Error);
    }
}
