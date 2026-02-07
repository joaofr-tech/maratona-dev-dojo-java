package academy.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d -> Todos os digitos
        // \D -> Tudo o que nao for digito
        // \s -> Espacos em branco
        // \S -> Todos os caracteres excluindo os brancos
        // \w -> Todos: a-z A-Z, digitos, _
        // \W -> Tudo o que nao for incluso no \w
        // []
        // String regex = "[a-zA-C]";
        // ? Zero ou um
        // * Zerou ou mais
        // + uma ou mais
        // {n, m} de n ate m
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . 1.3
        // ^
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()){
            System.out.println("Position: "+matcher.start()+" "+"Was Found: "+matcher.group());
        }
        int numeroHex = 0X59F86A;
        System.out.println(numeroHex);
    }
}
