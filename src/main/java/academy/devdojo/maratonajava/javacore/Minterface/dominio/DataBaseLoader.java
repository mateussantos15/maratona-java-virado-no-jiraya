package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do bando de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão no banco de dados");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize da classe DataBaseLoader");
    }
}
