package academy.maratonajava.javacore.Bintroducaometodos.test;

import academy.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Leandro");
        funcionario.setAge(21);
        funcionario.setSal(new double[]{1500, 3000, 4200});
        funcionario.imprimi();
    }
}
