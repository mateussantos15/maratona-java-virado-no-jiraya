package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Paths;
import java.nio.file.Path;

public class ResolveTest01 {
    // 147 - Classes Utilitárias - NIO pt 04 - Resolvendo Paths

    /**
     * Em Java, o método resolve() é utilizado para converter um caminho relativo em um caminho absoluto.
     * Ele faz parte da classe Path do pacote java.nio.file.
     *
     * Quando você tem um caminho relativo e deseja obter seu equivalente absoluto, você pode usar o
     * método resolve(). Se o caminho inicial não for absoluto, o método resolve() combina o caminho
     * relativo com o caminho de trabalho atual para formar um caminho absoluto.
     * @param args
     */
    public static void main(String[] args) {
        Path dir = Paths.get("home/mateus");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/mateus");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.text");

        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));
        System.out.println("3 "+relativo.resolve(absoluto));
        System.out.println("4 "+relativo.resolve(file));
        System.out.println("5 "+file.resolve(absoluto));
        System.out.println("6 "+file.resolve(relativo));
    }
}
