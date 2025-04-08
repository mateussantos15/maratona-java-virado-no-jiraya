package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    // Aula 140 - Classes Utilitárias - IO pt 03 - FileReader
    /**
     * A classe FileReader em Java é usada para ler dados de um arquivo de texto.
     * Ela herda da classe InputStreamReader, o que significa que ela lê
     * caracteres a partir de um fluxo de bytes. No caso do FileReader,
     * o fluxo de bytes vem de um arquivo no disco.
     * Sendo a classe do pacote io de mais baixo nivel.
     */
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileReader fr = new FileReader(file)){
//            char[] in = new char[1];
//            fr.read(in);
//            for (char c : in) {
//                System.out.println(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
