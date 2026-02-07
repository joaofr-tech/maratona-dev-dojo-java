package academy.maratonajava.javacore.Gassociacao.test;

import academy.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor1 = new Professor("Kakashi");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();

    }
}
