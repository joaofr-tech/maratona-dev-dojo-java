package academy.maratonajava.javacore.Zgenerics.test;

import academy.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> listaCarro = criarArrayComUmObjeto(new Carro("Test BYD"));
        System.out.println(listaCarro);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        System.out.println(list);
        return list;
    }
}
