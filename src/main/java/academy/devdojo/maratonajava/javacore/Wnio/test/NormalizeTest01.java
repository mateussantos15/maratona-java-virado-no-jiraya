package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    // 146 - Classes Utilitárias - NIO pt 03 - Normalização

    /**
     *
     No Java, o método normalize() é utilizado para normalizar um caminho fornecido como uma string.
     Normalizar um caminho implica em remover qualquer redundância ou ambiguidade no caminho, como
     eliminar pontos '.' que referem-se ao diretório atual ou eliminar referências aos diretórios
     pai '..', entre outras ações para simplificar o caminho.

     Este método é útil quando você está lidando com caminhos de arquivos ou diretórios e deseja
     garantir que estejam em um formato consistente e utilizável.
     * @param args
     */
    public static void main(String[] args) {
        String diretorioProjeto = "home/mateus/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./mateus/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());

        // Exemplo 02:
        // Usando o método normalize():
        System.out.println("Exemplo 02");
        String path = "/usr/local/bin/../lib";
        Path normalizedPath = Paths.get(path).normalize();
        System.out.println("Caminho original: " + path);
        System.out.println("Caminho normalizado: " + normalizedPath.toString());
    }
}
