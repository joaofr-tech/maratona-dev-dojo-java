package academy.maratonajava.javacore.Bintroducaometodos.test;

import academy.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Joao";
        estudante01.age = 18;
        estudante01.sex = 'm';

        estudante02.name = "Jucca";
        estudante02.age = 28;
        estudante02.sex = 'm';
        
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println(estudante01.name);

    }
}
