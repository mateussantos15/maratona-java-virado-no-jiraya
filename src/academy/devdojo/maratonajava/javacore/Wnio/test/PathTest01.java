package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    // 144 - Classes Utilitárias - NIO pt 01 - Path, Paths, Files pt 01

    /**
     * Em Java, a classe Path é parte do pacote java.nio.file, introduzido no Java 7, e é usada para representar
     * um caminho (path) para um arquivo ou diretório no sistema de arquivos. Ela fornece métodos para operações
     * de manipulação de arquivos, como criação, leitura, gravação, exclusão, entre outras.
     * @param args
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/mateus/workspace/maratona-java-virado-no-jiraya/file.text");
        Path p2 = Paths.get("/home/mateus/workspace/maratona-java-virado-no-jiraya","file.text");
        Path p3 = Paths.get("/home","mateus/workspace/maratona-java-virado-no-jiraya","file.text");
        Path p4 = Paths.get("/home","mateus","workspace","maratona-java-virado-no-jiraya","file.text");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
