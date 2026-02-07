package academy.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter br = new BufferedWriter(fw)) {
            br.newLine();
            br.write("I will be the GOAT");
            br.newLine();
            br.write("YES SIIIR");
            br.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
