package academy.devdojo.maratonajava.javacore.Wnio.test;

import javax.crypto.spec.PSource;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    // 148 - Classes Utilitárias - NIO pt 05 - Relativize

    /**
     * O método relativize() em Java faz parte da classe Path no pacote java.nio.file. Ele é usado para
     * criar um caminho relativo entre dois caminhos fornecidos.
     *
     * Suponha que você tenha dois caminhos absolutos, path1 e path2. O método relativize() cria um caminho
     * relativo entre esses dois caminhos. Se path2 estiver dentro da hierarquia de path1, o método
     * retornará um caminho relativo que, quando resolvido a partir de path1, levará a path2.
     * @param args
     */
    public static void main(String[] args) {
        Path dir = Paths.get("/home/mateus");
        Path clazz = Paths.get("/home/mateus/devdojo/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/mateus");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/mateus/devdojo/OlaMundo.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.2021921");

        System.out.println("1 "+absolute1.relativize(absolute3));
        System.out.println("2 "+absolute3.relativize(absolute1));
        System.out.println("3 "+absolute1.relativize(absolute2));
        System.out.println("4 "+relative1.relativize(relative2));
//        System.out.println("5 "+absolute1.relativize(relative1));


    }

}
