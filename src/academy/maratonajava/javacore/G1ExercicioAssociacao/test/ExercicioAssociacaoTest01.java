package academy.maratonajava.javacore.G1ExercicioAssociacao.test;

import academy.maratonajava.javacore.G1ExercicioAssociacao.dominio.Aluno;
import academy.maratonajava.javacore.G1ExercicioAssociacao.dominio.Local;
import academy.maratonajava.javacore.G1ExercicioAssociacao.dominio.Professor;
import academy.maratonajava.javacore.G1ExercicioAssociacao.dominio.Seminario;

public class ExercicioAssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Complexo do Alemao 981");
        Aluno aluno = new Aluno("Mauro", 24);
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Cantor Oruan", local, alunosParaSeminario);
        Seminario[] seminariosProfessor = {seminario};
        Professor professor = new Professor("Felipe RET", "Cantor", seminariosProfessor);

        professor.imprime();
    }
}
