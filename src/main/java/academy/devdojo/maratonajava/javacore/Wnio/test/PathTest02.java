package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    // 145 - Classes Utilitárias - NIO pt 02 - Path, Paths, Files pt 02

    /**
     * Em Java, a classe Paths está localizada no pacote java.nio.file. Ela é usada para criar instâncias
        da interface Path, que representa um local no sistema de arquivos. Path é uma representação
        abstrata de um arquivo ou diretório no sistema de arquivos.

     * Paths fornece métodos estáticos para criar instâncias de Path. Ele fornece uma maneira conveniente
        de criar caminhos para arquivos e diretórios no sistema de arquivos.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        if (Files.notExists(subPastaPath)) {
            Path subPastaDirectory = Files.createDirectory(subPastaPath);
        }
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * O método getParent() em Java é um método da classe File, que é usada para
     * representar os nomes de arquivos e diretórios em um sistema de arquivos.
     * Este método retorna um objeto File que representa o diretório pai do
     * arquivo ou diretório atual.
     */
     // Exemplo de como usar o método getParent():
    public static void getParentEX() {
        // Criando um objeto File para representar um arquivo
        File arquivo = new File("C:/MeusDocumentos/Arquivo.txt");

        // Obtendo o diretório pai do arquivo
        File diretorioPai = arquivo.getParentFile();

        // Verificando se o diretório pai existe e imprimindo seu caminho
        if (diretorioPai != null && diretorioPai.exists()) {
            System.out.println("O diretório pai é: " + diretorioPai.getPath());
        } else {
            System.out.println("O diretório pai não existe ou ocorreu um erro.");
        }
    }
}