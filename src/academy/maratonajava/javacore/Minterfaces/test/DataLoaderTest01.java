package academy.maratonajava.javacore.Minterfaces.test;

import academy.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    //private -> default -> protected -> public
    public static void main(String[] args) {
        DataLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }

}
