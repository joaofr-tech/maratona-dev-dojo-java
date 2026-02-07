package academy.maratonajava.javacore.Csobrecargametodos.Test;

import academy.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("JoJo", "TV", 169, "Fantasia");
        anime.imprimi();
    }
}
