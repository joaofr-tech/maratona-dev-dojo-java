package academy.maratonajava.javacore.G1ExercicioAssociacao.dominio;

public class Aluno {
    private String name;
    private int age;
    private Seminario seminario;

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
        this.seminario = seminario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
