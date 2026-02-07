package academy.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String name;
    private int[] eps;
    {
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i+1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime(){
        for(int eps: this.eps){
            System.out.print(eps + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEps() {
        return eps;
    }
}
