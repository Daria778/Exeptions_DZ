package Seminar_3.View.Exceptions;

public class MyLettersException extends RuntimeException{
    public MyLettersException(String text) {
        super(String.format("%s should contain only letters", text));
    }
}
