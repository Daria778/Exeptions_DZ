package Seminar_3.Model.File;

import Seminar_3.Model.Human;

import java.io.*;


public class FileHandler implements Workable {

    @Override
    public void fileWD(Human h, String path) {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(h.toString() + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fileR(String path) {
//        try (FileReader fileReader = new FileReader(path)) {
//            int ch = fileReader.read();
//            while (ch != -1) {
//                System.out.print((char) ch);
//                fileReader.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
