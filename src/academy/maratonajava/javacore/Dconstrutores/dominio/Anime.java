package academy.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String type;
    private int eps;
    private String genre;

    public Anime(String name){
        this.name = name;
    }

    public void imprimi(){
        System.out.println(this.type);
        System.out.println(this.eps);
        System.out.println(this.name);
        System.out.println(this.genre);
    }

    public void init(String name, String type, int eps){
        this.name = name;
        this.type = type;
        this.eps = eps;
    }

    public void init(String name, String type, int eps, String genre){
        init(name, type, eps);
        this.genre = genre;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void setEps(int eps){
        this.eps = eps;
    }
    public int getEps(){
        return this.eps;
    }
}
