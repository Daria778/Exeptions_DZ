package Seminar_3.Model;

public class Human {
     String name;
     String surname;
     String patronymic;
     String birthdate;
     String tel;
     String gender;

    public Human(String name, String surname, String patronymic, String birthdate, String tel, String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.tel = tel;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<"+ surname + ">" + "<"+ name + ">" + "<"+ patronymic + ">" +  "<"+ birthdate + ">" + "<"+ tel + ">" + "<"+ gender + ">";
    }
}
