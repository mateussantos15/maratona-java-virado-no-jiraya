package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public interface DataLoader {
    public static final int MAX_DATEA_SIZE = 10;
    public void load(); // metodos abstratos que deveram ser obrigatoriamente implementados pelas classes
    default void checkPermission() { // Metodo que não precisa ser obrigatoriamente implementado pelas classes que iram implementar essa interface
        System.out.println("Fazendo checagem de Informações");
    }

    public static void retriveMaxDataSize() { // matodo de (classe), interface. Não pode ser sobre escrito.
        System.out.println("Dentro do retriveMaxDataSize da Interface DataLoader");
    }
}
