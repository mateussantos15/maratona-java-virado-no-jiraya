package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um Arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando um arquivo");
    }
}
