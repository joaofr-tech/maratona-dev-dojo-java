package academy.maratonajava.javacore.Oexception.exception.test;

import academy.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TruWithResourcestest01 {
    public static void main(String[] args) {

    }
    public static void lerArquivo() throws IOException{
        try (Leitor1 leitor1= new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }
}
