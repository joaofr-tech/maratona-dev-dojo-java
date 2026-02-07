package academy.maratonajava.javacore.Eblocosinicializacao.test;

import academy.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int eps : anime.getEps()) {
            System.out.print(eps + " ");
        }


    }
}
