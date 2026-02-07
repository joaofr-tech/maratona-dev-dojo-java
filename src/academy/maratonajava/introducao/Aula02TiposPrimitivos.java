package academy.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    //psvm == tecla de atalho
    //sout == atalho print
    // int, double, float, char, byte, short, long, boolean
    public static void main(String[] args){
        int age = 10; // 4 bytes
        long NumeroGrande = 10000; // 8 bytes
        float NumeroDecimal = 100; // 4 bytes
        double NumeroDecimalGrande = 1000; // 8 bytes
        byte UmByte = 127; // 1 byte
        short DoisBytes = 10; // 2 byte
        boolean Verdadeiro = true; // 1 bit
        boolean Falso = false; // 1 bit
        char Caractere = 'a'; // 2 bytes // Unicode, ASCII
        String name = "Doesnt have a limit of charactere";
        System.out.println("This age is: "+age);
        System.out.println(name);
    }
}
