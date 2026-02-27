package academy.maratonajava.javacore.Ycolecoes.test;

import academy.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoCompartor().reversed());
        mangas.add(new Manga(6L, "Berserk", 29.9));
        mangas.add(new Manga(7L, "Pokemon", 14.9));
        mangas.add(new Manga(8L, "Dragon Ball Z", 24.9));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(9L, "Attack on Titan", 22.9));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
