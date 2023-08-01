package Seminar_2;

import java.io.FileNotFoundException;

public class Task_3 {

    public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
    }

    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        int[] array = {1, 2};
        try {
            System.out.println(a / b);
            array[1] = 9;
            printSum(a, b);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
}
