package Seminar_3.Presenter;

import Seminar_3.Model.Human;
import Seminar_3.Model.Service;
import Seminar_3.View.View;

public class Presenter {
    View view;
    Service service;


    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
    }

    public void addHuman(String name, String surname, String patronymic, String birthdate, String tel, String gender) {
        service.newHuman(name, surname, patronymic, birthdate, tel, gender);
    }

    public void read(String path){
        service.read(path);
    }
}
