package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();
        dataBaseLoader.checkPermission();
        DataBaseLoader.retriveMaxDataSize();
        
    }
}
