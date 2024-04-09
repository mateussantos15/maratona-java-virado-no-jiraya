package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {
    // 152 - Classes Utilitárias - NIO pt 09 - PosixFileAttributes

    /**
     * A classe PosixFileAttributes faz parte do pacote java.nio.file.attribute em Java e é usada para representar
        os atributos de arquivos em sistemas de arquivos que seguem os padrões POSIX (Portable Operating System
        Interface). Esses sistemas incluem a maioria das variantes Unix, como Linux e macOS.

     * Essa classe fornece métodos para acessar informações específicas do POSIX, como permissões de arquivo,
        proprietário, grupo, entre outros.
     */
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("/home/mateus/workspace/maratona-java-virado-no-jiraya/home/mateus/dev/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        fileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(fileAttributeView.readAttributes().permissions());
        System.out.println("---------------------------------------");

        // Exemplo 02:
        // Caminho do arquivo
        Path path1 = Paths.get("/home/mateus/workspace/maratona-java-virado-no-jiraya/home/mateus/dev/file.txt");

        try {
            // Obter atributos do arquivo
            PosixFileAttributes attrs = Files.readAttributes(path1, PosixFileAttributes.class);

            // Imprimir informações
            System.out.println("Permissões: " + attrs.permissions());
            System.out.println("Proprietário: " + attrs.owner());
            System.out.println("Grupo: " + attrs.group());
            System.out.println("Tipo: " + (attrs.isDirectory() ? "Diretório" : "Arquivo"));
            System.out.println("Última modificação: " + attrs.lastModifiedTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
