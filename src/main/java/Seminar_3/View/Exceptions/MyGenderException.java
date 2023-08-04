package Seminar_3.View.Exceptions;

public class MyGenderException extends RuntimeException{
    public MyGenderException() {
        super("The gender should be m or f");
    }
}
