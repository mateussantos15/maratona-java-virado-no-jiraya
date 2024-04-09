package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    // 158 - Classes Utilitárias - NIO pt 15 - ZipOutputStream
    public static void main(String[] args) {
        Path arquivoParaZipar = Paths.get("pasta/arquivo.zip");
        Path arquivoZip = Paths.get("pasta/subpasta/subsubpasta/file.txt");
        zip(arquivoZip, arquivoParaZipar);
    }
    private static void zip (Path arquivoZip, Path arquivoParaZipar) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream((arquivoZip)));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com Sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao Criar o arquivo! ");
            e.printStackTrace();
        }
    }
}
