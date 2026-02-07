package academy.maratonajava.javacore.Bintroducaometodos.test;

import academy.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Zoro";
        estudante01.age = 23;
        estudante01.sex = 'm';

        estudante02.name = "Kuina";
        estudante02.age = 19;
        estudante02.sex = 'f';
    }
}
