package academy.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }
}
