package academy.maratonajava.javacore.Ycolecoes.test;

import academy.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Hellsing Ultimate");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");
        mangas.add("Attack on Titan");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23D);
        dinheiros.add(23.98);

        for (String manga: mangas){
            System.out.println(manga);
        }

        System.out.println();

        for(Double dinheiro: dinheiros){
            System.out.println(dinheiro);
        }

        new Manga(null, null, 0);
    }
}
