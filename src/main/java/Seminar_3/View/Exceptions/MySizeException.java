package Seminar_3.View.Exceptions;

public class MySizeException extends RuntimeException {
    public MySizeException(int size) {
        super(String.format("You have entered %s data, should be %s", size, 6));
    }
}
