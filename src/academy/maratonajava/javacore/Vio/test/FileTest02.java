package academy.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args){
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriated);
        File fileArquivoDiretorio = new File("C:\\Users\\João\\Intellij\\maratona-java\\pasta");
        boolean isFileCreated = false;
        System.out.println(isFileCreated);
    }
}
