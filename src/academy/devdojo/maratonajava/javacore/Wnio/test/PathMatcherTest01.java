package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;

public class PathMatcherTest01 {
    // 156 - Classes Utilitárias - NIO pt 13 - PathMatcher pt 01

    /**
     * A classe PathMatcher no Java é uma parte da API do Java NIO (New I/O), introduzida no Java 7. Ela é utilizada
        para realizar comparações de padrões em caminhos de arquivos ou diretórios, permitindo que você verifique se
        um caminho corresponde a um determinado padrão especificado.

     * O principal método dessa classe é o matches(), que verifica se um determinado caminho corresponde ao padrão
        especificado.
     */
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:**/*.{bkp,txt,java}");
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path3, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");

// Exemplo 2, como usar a classe PathMatcher para encontrar todos os arquivos com a extensão ".txt" em um diretório:
        /**
         * Primeiro cria-se um Path representando o diretório onde queremos procurar os arquivos. Em seguida,
           utilizamos um DirectoryStream para iterar sobre os arquivos no diretório. Para cada arquivo,
           usamos um PathMatcher para verificar se o nome do arquivo corresponde ao padrão "*.txt". Se corresponder, o nome do arquivo é impresso.
         */
        Path directory = Paths.get("/home/mateus/workspace/maratona-java-virado-no-jiraya/pasta"); // Diretório onde queremos buscar os arquivos

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory, "*.txt")) {
            PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");

            for (Path file : stream) {
                if (matcher.matches(file.getFileName())) {
                    System.out.println(file.getFileName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob = ": " + matcher.matches(path));
    }
}
