package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    // 159 - Classes Utilitárias - Serialization pt 01

    /**
     * Em Java, a serialização é o processo de converter um objeto em uma sequência de bytes, que podem ser
        facilmente salvos em um arquivo ou transmitidos por uma rede. A classe de serialização em Java é a
        Serializable.

     * A interface Serializable é uma marcação que indica que a classe pode ser serializada. Não há métodos
        a serem implementados, é apenas uma marcação para o compilador Java entender que essa classe pode
        ser serializada.

     * A serialização é frequentemente usada em situações onde é necessário persistir objetos em disco,
        transmitir objetos pela rede ou em sistemas distribuídos. Ao serializar um objeto, ele pode
        ser facilmente reconstruído posteriormente, recriando o estado do objeto original.
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Mateus Santos", "123456789");
        Turma turma = new Turma("Maratona Java Virado no Jiraya em Breve Ricos!");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
//        serializandoDeserializando();
    }
    private static void serializar(Aluno aluno) {
        Path path = Paths.get("/home/mateus/workspace/maratona-java-virado-no-jiraya/pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("/home/mateus/workspace/maratona-java-virado-no-jiraya/pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Exemplo 2
    private static void serializandoDeserializando() {
        // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa("João", 30);

        // Serializando o objeto
        try {
            FileOutputStream fileOut = new FileOutputStream("pessoa.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(pessoa);
            out.close();
            fileOut.close();
            System.out.println("Objeto Pessoa serializado com sucesso.");
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Desserializando o objeto
        Pessoa pessoaDesserializada = null;
        try {
            FileInputStream fileIn = new FileInputStream("pessoa.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            pessoaDesserializada = (Pessoa) in.readObject();
            in.close();
            fileIn.close();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Exibindo os dados da Pessoa desserializada
        System.out.println("Exibindo os dados da Pessoa desserializada:");
        System.out.println("Nome: " + pessoaDesserializada.getNome());
        System.out.println("Idade: " + pessoaDesserializada.getIdade());
    }
}
