package academy.maratonajava.javacore.Ycolecoes.test;

import academy.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(6L, "Berserk", 29.9, 5));
        mangas.add(new Manga(7L, "Pokemon", 14.9, 0));
        mangas.add(new Manga(8L, "Dragon Ball Z", 24.9, 2));
        mangas.add(new Manga(9L, "Attack on Titan", 22.9, 0));

        Iterator<Manga> mangaIterator  = mangas.iterator();
        while (mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
    }
}
