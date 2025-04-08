package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    // 151 - Classes Utilitárias - NIO pt 08 - DosFileAttribute

    /**
     * DosFileAttributes é uma classe que fornece métodos para acessar atributos específicos de arquivos em
     * sistemas de arquivos que suportam atributos DOS. Esses atributos incluem informações como se um
     * arquivo é oculto, somente leitura, etc., que são comuns em sistemas de arquivos Windows.
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");
        if (Files.notExists(path)) Files.createFile(path);
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setReadOnly(true);
        fileAttributeView.setHidden(true);
        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());

        // Exemplo 02:
        Path path1 = Paths.get("pasta/exemplo2.txt");
        if (Files.notExists(path1)) Files.createFile(path1);

        try {
            DosFileAttributes attributes = Files.readAttributes(path1, DosFileAttributes.class);

            if (attributes.isHidden()) {
                System.out.println("O arquivo está oculto.");
            }

            if (attributes.isReadOnly()) {
                System.out.println("O arquivo é somente leitura.");
            }

            // Outros atributos e ações podem ser verificados da mesma forma
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
