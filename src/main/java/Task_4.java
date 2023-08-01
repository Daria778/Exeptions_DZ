import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Enter something: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.isEmpty()){
            throw new RuntimeException("you should not enter empty lines");
        }
    }

}
