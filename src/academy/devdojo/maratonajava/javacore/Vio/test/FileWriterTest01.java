package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    // Aula 139 - Classes Utilitárias - IO pt 02 - FileWriter

    /**
     * A classe FileWriter no Java é utilizada para escrever dados em um arquivo de texto.
     * Ela é usada para criar um novo arquivo ou para sobrescrever um arquivo existente.
     * Esta classe é parte do pacote java.io e é especialmente útil quando você precisa
     * escrever sequências de caracteres em um arquivo de texto.
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DeveDojo é o melhor curso sobre java do Brasil\nContinuando na proxima linha\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
