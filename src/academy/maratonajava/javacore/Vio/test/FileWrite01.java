package academy.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("I will be the GOAT");
            fw.flush();
            fw.write("\nYES SIIIR");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
