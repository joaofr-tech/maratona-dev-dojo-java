package academy.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(200);
        nomes.add("William");
        nomes.add("Joao");
        nomes.remove("snart");

        for (String nome: nomes) {
            System.out.println(nome);
        }
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
