package Seminar_3.View.Exceptions;

public class BirthdateException extends RuntimeException{
    public BirthdateException() {
        super("The birthdate should be dd.mm.yyyy");
    }
}
