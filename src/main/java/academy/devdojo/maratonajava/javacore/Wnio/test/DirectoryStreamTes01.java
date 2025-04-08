package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class DirectoryStreamTes01 {
    // 153 - Classes Utilitárias - NIO pt 10 - DirectoryStream

    /**
     * DirectoryStream é uma interface no Java que representa um conjunto de entradas em um diretório.
        Ele fornece uma maneira de iterar sobre os arquivos e subdiretórios em um determinado diretório.
        Essa interface é útil quando você precisa listar o conteúdo de um diretório e manipular os
        arquivos e subdiretórios contidos nele.
     */
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------");

        // Exemplo 2:
        // Diretório que queremos listar
        Path directory = Paths.get(".");

        try (DirectoryStream<Path> stream1 = Files.newDirectoryStream(directory)) {
            // Iterando sobre cada entrada no diretório
            for (Path entry : stream1) {
                // Verificando se é um arquivo
                if (Files.isRegularFile(entry)) {
                    System.out.println("Arquivo: " + entry.getFileName());
                }
                // Verificando se é um diretório
                else if (Files.isDirectory(entry)) {
                    System.out.println("Diretório: " + entry.getFileName());
                }
                // Podem ser adicionadas outras verificações aqui conforme necessário
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
