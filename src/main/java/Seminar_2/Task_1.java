package Seminar_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        floatText();
    }
    public static  float floatText(){
        System.out.println("Enter a float type number: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Float num = null;
        try {
            num = Float.parseFloat(str);
            System.out.println("WOW");
        }
        catch (NumberFormatException e){
            System.err.println("You should enter a float type number.");
            System.err.println("Try again: ");
            floatText();
        }
        catch (NullPointerException e){
            System.err.println("Try again: ");
            floatText();
        }
        return num;
    }
}
