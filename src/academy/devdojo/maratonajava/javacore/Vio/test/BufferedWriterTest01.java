package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    // Aula 141 - Classes Utilitárias - IO pt 04 - FileWriter

    /**
     * A classe BufferedWriter no Java é usada para escrever texto em um fluxo de saída com buffering de caracteres,
     * o que pode melhorar significativamente o desempenho ao escrever grandes quantidades de dados.
     * Ela fornece métodos para escrever sequências de caracteres em um fluxo de saída, além de
     * facilitar o armazenamento temporário dos dados em um buffer antes de escrevê-los no destino final.
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DeveDojo é o melhor curso sobre java do Brasil");
            bw.newLine();
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Exemplo 02:
        // Usando a classe BufferedWriter para escrever texto em um arquivo:
        /**
         * Um objeto FileWriter é criado para escrever no arquivo especificado (exemplo.txt).
         * Um objeto BufferedWriter é criado, passando o FileWriter como argumento.
         * O texto é escrito no arquivo usando o método write() do BufferedWriter.
         * O método close() é chamado no BufferedWriter para garantir que todos os dados sejam
            escritos no arquivo e que os recursos sejam liberados corretamente. Isso também fecha
            automaticamente o FileWriter.
         */
        String textoParaEscrever = "Olá, mundo! Este é um exemplo de escrita usando BufferedWriter.";

        // Nome do arquivo onde o texto será escrito
        String nomeDoArquivo = "exemplo.txt";

        try {
            // Cria um FileWriter para escrever no arquivo
            FileWriter fileWriter = new FileWriter(nomeDoArquivo);

            // Cria um BufferedWriter, passando o FileWriter como argumento
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escreve o texto no arquivo usando o BufferedWriter
            bufferedWriter.write(textoParaEscrever);

            // Fecha o BufferedWriter (isso também fecha o FileWriter automaticamente)
            bufferedWriter.close();

            System.out.println("Texto foi escrito no arquivo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

}
