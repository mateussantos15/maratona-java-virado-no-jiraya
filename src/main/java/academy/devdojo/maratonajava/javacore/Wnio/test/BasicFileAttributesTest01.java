package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class BasicFileAttributesTest01 {
    // 149 - Classes Utilitárias - NIO pt 06 - BasicFileAttributes pt 01
    // BasicFileAttributes, DosFileAttributes, PosixFileAttributes

    /**
     * A interface BasicFileAttributes faz parte do pacote java.nio.file.attribute do Java e é utilizada para acessar
     * atributos básicos de um arquivo no sistema de arquivos. Esses atributos incluem informações como data de
     * criação, última modificação, tamanho e permissões de acesso.
     *
     * A interface BasicFileAttributes define métodos para acessar esses atributos básicos de um arquivo.
     * Aqui está a lista de alguns dos métodos mais comuns definidos nesta interface:
     *
     ** FileTime creationTime(): Retorna a data e hora de criação do arquivo.
     ** FileTime lastAccessTime(): Retorna a data e hora do último acesso ao arquivo.
     ** FileTime lastModifiedTime(): Retorna a data e hora da última modificação do arquivo.
     ** boolean isRegularFile(): Retorna true se o arquivo for um arquivo regular (não um diretório,
        link simbólico etc.).
     ** boolean isDirectory(): Retorna true se o arquivo for um diretório.
     ** boolean isSymbolicLink(): Retorna true se o arquivo for um link simbólico.
     *
     ** Esses métodos permitem que você obtenha informações básicas sobre um arquivo sem precisar
        abrir ou ler o próprio conteúdo do arquivo.
     */
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta2/novo_path.txt");
//        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

        // Exemplo 02:
        // Usando a interface BasicFileAttributes para obter informações sobre um arquivo:
        Path pathh = Paths.get("pasta2/novo.txt");

        try {
            BasicFileAttributes attrs = Files.readAttributes(pathh, BasicFileAttributes.class);

            System.out.println("Creation Time: " + attrs.creationTime());
            System.out.println("Last Access Time: " + attrs.lastAccessTime());
            System.out.println("Last Modified Time: " + attrs.lastModifiedTime());
            System.out.println("Is Regular File? " + attrs.isRegularFile());
            System.out.println("Is Directory? " + attrs.isDirectory());
            System.out.println("Is Symbolic Link? " + attrs.isSymbolicLink());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
