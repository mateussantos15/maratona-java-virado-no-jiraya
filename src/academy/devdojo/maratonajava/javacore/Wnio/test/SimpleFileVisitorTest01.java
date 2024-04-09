package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    // 154 - Classes Utilitárias - NIO pt 11 - SimpleFileVisitor pt 01

    /**
     * A classe SimpleFileVisitor faz parte do pacote java.nio.file do Java e é utilizada para percorrer uma
        hierarquia de arquivos em um sistema de arquivos. Ela é frequentemente usada em conjunto com a
        classe Files.walkFileTree() para visitar cada arquivo e diretório dentro de uma determinada raiz.

     * Essa classe é uma implementação simples da interface FileVisitor, que define métodos para lidar com
        diferentes eventos durante a travessia da árvore de arquivos, como entrada em um diretório, visita
        de um arquivo ou falha ao acessar um arquivo.
     */
    public static void main(String[] args) throws IOException{
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
        System.out.println("*****************************************");


        // Exemplo 2:
        /**
         * A classe percorre todos os arquivos dentro do diretório raiz especificado (rootPath). Para cada arquivo
            visitado com sucesso, o método visitFile() é chamado e o nome do arquivo é impresso. Se ocorrer uma
            falha ao acessar um arquivo, o método visitFileFailed() será chamado e uma mensagem de erro será impressa.
         */
        Path rootPath = Path.of("."); // Defina o caminho do diretório raiz aqui

        Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("Arquivo encontrado: " + file.getFileName());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.err.println("Falha ao acessar o arquivo: " + file);
                return FileVisitResult.CONTINUE;
            }
        });

    }
}
