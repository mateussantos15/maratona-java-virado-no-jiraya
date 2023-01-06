package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void criarNovoArquivo() throws IOException {
//        File file = new File("arquivo\\teste.txt");
//        boolean isCriado = file.createNewFile();
//        System.out.println("Arquivo Criado "+isCriado);

        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado "+isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
