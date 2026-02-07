package academy.maratonajava.javacore.Npolimorfismo.Test;

import academy.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
