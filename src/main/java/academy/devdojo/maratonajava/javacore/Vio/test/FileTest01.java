package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    // Aula 1378 - Classes Utilitárias - IO pt 01 - File

    /**
     * A classe File é parte do pacote java.io e é utilizada para representar e manipular caminhos de arquivos
     * e diretórios no sistema de arquivos do computador. Essa classe fornece métodos para criar, excluir,
     * renomear, verificar a existência, entre outras operações com arquivos e diretórios.
     * @param args
     */
    public static void main(String[] args) {
        File file = new File(("file.text"));
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsoluteFile());
            System.out.println("Is directory "+file.isDirectory());
            System.out.println("Is File "+file.isFile());
            System.out.println("Is hidden "+file.isHidden());
            System.out.println("Last Modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted "+file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
