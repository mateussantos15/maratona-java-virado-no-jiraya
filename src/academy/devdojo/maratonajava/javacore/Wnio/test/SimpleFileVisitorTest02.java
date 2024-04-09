package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre visit: "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Post visit: "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    // 155 - Classes Utilitárias - NIO pt 11 - SimpleFileVisitor pt 02

    /**
     * A classe SimpleFileVisitor faz parte do pacote java.nio.file do Java e é utilizada para percorrer uma
        hierarquia de arquivos em um sistema de arquivos. Ela é frequentemente usada em conjunto com a
        classe Files.walkFileTree() para visitar cada arquivo e diretório dentro de uma determinada raiz.

     * Essa classe é uma implementação simples da interface FileVisitor, que define métodos para lidar com
        diferentes eventos durante a travessia da árvore de arquivos, como entrada em um diretório, visita
        de um arquivo ou falha ao acessar um arquivo.
     */
    public static void main(String[] args) throws IOException{
        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
