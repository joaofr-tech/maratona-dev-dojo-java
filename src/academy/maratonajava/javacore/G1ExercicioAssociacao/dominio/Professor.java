package academy.maratonajava.javacore.G1ExercicioAssociacao.dominio;

public class Professor {
    private String name;
    private String specialty;
    private Seminario[] seminarios;

    public Professor(String name, String specialty, Seminario[] seminarios) {
        this.name = name;
        this.specialty = specialty;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("==============");
        System.out.println("Professor: " + this.name);
        System.out.println("Professor Especialidade: " + this.specialty);
        if (this.seminarios == null) {
            return;
        }
        System.out.println("## Seminarios ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println("Titulo: "+seminario.getTitle());
            System.out.println("Endereco: "+ seminario.getLocal().getAdress());
            if (seminario.getAluno() == null || seminario.getAluno().length == 0){
                continue;
            }
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAluno()) {
                System.out.println("Aluno: "+ aluno.getName());
                System.out.println("Idade: "+ aluno.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
