package academy.maratonajava.javacore.G1ExercicioAssociacao.dominio;

public class Seminario {
    private String title;
    private Local local;
    private Aluno[] aluno;

    public Seminario(String title, Local local, Aluno[] aluno) {
        this.title = title;
        this.local = local;
        this.aluno = aluno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
}
