package Seminar_3.Model;

import Seminar_3.Model.File.FileHandler;
import Seminar_3.Model.File.Workable;


import java.io.IOException;

public class Service {
    private Human h;
    private Workable file;


    public Service() {
        this.file = new FileHandler();
    }

    public void newHuman(String name, String surname, String patronymic, String birthdate, String tel, String gender){
         h = new Human(name, surname, patronymic, birthdate, tel, gender);
        try {
            file.fileWD(h, h.surname + ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

    public void read(String path){
        try {
            file.fileR(path);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
