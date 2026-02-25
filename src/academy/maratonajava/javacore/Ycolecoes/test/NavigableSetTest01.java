package academy.maratonajava.javacore.Ycolecoes.test;

import academy.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoCompartor implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoCompartor());
        mangas.add(new Manga(6L, "Berserk", 29.9));
        mangas.add(new Manga(7L, "Pokemon", 14.9));
        mangas.add(new Manga(8L, "Dragon Ball Z", 24.9));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(9L, "Attack on Titan", 22.9));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
