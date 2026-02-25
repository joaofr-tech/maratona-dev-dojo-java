package academy.maratonajava.javacore.Ycolecoes.test;

import academy.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(6L, "Berserk", 29.9));
        mangas.add(new Manga(7L, "Pokemon", 14.9));
        mangas.add(new Manga(8L, "Dragon Ball Z", 24.9));
        mangas.add(new Manga(9L, "Attack on Titan", 22.9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
