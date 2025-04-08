package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    // 150 - Classes Utilitárias - NIO pt 07 - BasicFileAttributes pt 02
    // BasicFileAttributesView, DosFileAttributesView, PosixFileAttributesView [disponibilizam metodos que podem fazer alteração]

    /**
     * as classes BasicFileAttributesView, FileAttributesView, e PosixFileAttributesView fazem parte do pacote
     * java.nio.file.attribute. Elas fornecem interfaces para visualização e manipulação de atributos de
     * arquivos em sistemas de arquivos. Aqui está uma breve descrição de cada uma:
     *
     * BasicFileAttributesView: Esta interface fornece acesso somente leitura a um conjunto básico de atributos
        de arquivo. Esses atributos incluem informações como a última data de modificação, a data de criação,
        o tamanho do arquivo, se é um diretório ou não, entre outros. É útil para operações básicas de
        leitura de atributos de arquivo.
     *
     * FileAttributesView: Esta é uma interface pai para todas as visualizações de atributos de arquivo específicas.
        Ela estende BasicFileAttributesView e adiciona métodos para definir e atualizar atributos de arquivo.
     *
     * PosixFileAttributesView: Esta é uma subinterface de BasicFileAttributesView que fornece acesso a um conjunto
        de atributos de arquivo típicos em sistemas POSIX (Portable Operating System Interface), como Unix e Linux.
        Além dos atributos básicos, ela oferece acesso a permissões de arquivo, proprietário, grupo e outras
        informações específicas do sistema POSIX.
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime "+ creationTime);
        System.out.println("lastModifiedTime "+ lastModifiedTime);
        System.out.println("lastAccessTime "+ lastAccessTime);
        System.out.println("------------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("CreationTime "+ creationTime);
        System.out.println("lastModifiedTime "+ lastModifiedTime);
        System.out.println("lastAccessTime "+ lastAccessTime);
        System.out.println("------------------------------------------");

        // Exemplo 02
        /**
         * Este exemplo usa Files.getFileAttributeView() para obter uma instância de BasicFileAttributesView
         * para o arquivo especificado. Em seguida, lê os atributos básicos do arquivo, como a última data
         * de modificação, a data de criação, o tamanho do arquivo e verifica se é um diretório ou
         * um arquivo regular.
         */
        Path pathh = Paths.get("pasta2/novo_path.txt");

        try {
            BasicFileAttributeView view = Files.getFileAttributeView(pathh, BasicFileAttributeView.class);
            BasicFileAttributes attributes = view.readAttributes();

            System.out.println("Última data de modificação: " + attributes.lastModifiedTime());
            System.out.println("Data de criação: " + attributes.creationTime());
            System.out.println("Tamanho do arquivo: " + attributes.size());
            System.out.println("É um diretório? " + attributes.isDirectory());
            System.out.println("É um arquivo regular? " + attributes.isRegularFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}