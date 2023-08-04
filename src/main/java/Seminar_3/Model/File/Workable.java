package Seminar_3.Model.File;


import Seminar_3.Model.Human;

import java.io.IOException;

public interface Workable {
    void fileWD(Human h, String path) throws IOException;
    void fileR(String path) throws IOException, ClassNotFoundException;
}