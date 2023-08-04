package Seminar_3.View;

import Seminar_3.Presenter.Presenter;
import Seminar_3.View.Exceptions.BirthdateException;
import Seminar_3.View.Exceptions.MyGenderException;
import Seminar_3.View.Exceptions.MyLettersException;
import Seminar_3.View.Exceptions.MySizeException;

import java.util.Objects;
import java.util.Scanner;

public class Console implements View {
    private Presenter presenter;
    private Scanner scanner;
    boolean work;


    public Console() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
    }

    @Override
    public void start() {
        System.out.println("Hello, what can i help you?");


        while (work) {
            System.out.println("1. Add Human\n" +
                "2. Read file\n" +
                "3. Exit\n");
            String t = scanner.nextLine();
            int e = Integer.parseInt(t);
            if (e == 1) addHuman(rightHuman());
            else if (e == 2) {
                System.out.println("Enter the name of the file");
                String x = scanner.nextLine();
                read(x);
            }

            else if (e == 3) finish();
            else {
                System.out.println("Try again");
                start();
            }
        }
    }
    public void finish() {
        System.out.println("GoodBye!");
        work = false;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public String[] rightHuman() {
        System.out.println("Enter the human's name, surname, patronymic, birthdate, tel number and gender separated by a space.");
        String data = scanner.nextLine();
        String[] data1 = data.split(" ");
        if (notRightSize(data1.length)) throw new MySizeException(data1.length);
        if (!isAlpha(data1[0])) throw new MyLettersException(data1[0]);
        if (!isAlpha(data1[1])) throw new MyLettersException(data1[1]);
        if (!isAlpha(data1[2])) throw new MyLettersException(data1[2]);
        if (!isBirthdate(data1[3])) throw new BirthdateException();
        telTry(data1[4]);
        if (!Objects.equals(data1[5], "m") & !Objects.equals(data1[5], "f")) throw new MyGenderException();
        return data1;
    }

    public void read(String path){
        presenter.read(path);
    }


    public void addHuman(String[] data){
        String name = data[0];
        String surname = data[1];
        String patronymic = data[2];
        String birthdate = data[3];
        String tel = data[4];
        String gender = data[5];
        presenter.addHuman(name, surname, patronymic, birthdate, tel, gender);
    }

    private boolean notRightSize(int size){
        if(size != 6) return true;
        return false;
    }
    private boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }
    private boolean isBirthdate(String birthdate){
        return birthdate.matches("\\d{2}.\\d{2}.\\d{4}");
    }
    private boolean telTry(String text){
            try {
                Double.parseDouble(text);
                return true;
            } catch(NumberFormatException e){
                return false;

        }
    }

}
