package academy.maratonajava.javacore.Npolimorfismo.servico;

import academy.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
