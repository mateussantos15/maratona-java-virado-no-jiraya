package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    // Aula 141 - Classes Utilitárias - IO pt 05 - FileReader

    /**
     * A classe FileReader é usada para ler caracteres de um arquivo de texto.
     * Ela herda da classe InputStreamReader, que é usada para converter bytes em caracteres.
     * FileReader é particularmente útil quando você precisa ler dados de um arquivo de texto de forma eficiente..
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Exemplo 02:
        // Usando a  classe FileReader para ler o conteúdo de um arquivo de texto chamado "exemplo.txt":
        /**
         * Neste exemplo, o programa abre o arquivo "exemplo.txt", lê seus caracteres um por um usando
         * o método read() e os imprime na tela. O loop continua até que o método read() retorne -1,
         * indicando que o final do arquivo foi alcançado. Por fim, o FileReader é fechado no bloco
         * finally para liberar os recursos após a leitura.
         */
        try {
            // Cria um objeto FileReader para ler o arquivo "exemplo.txt"
            FileReader fileReader = new FileReader("exemplo.txt");

            int caractere;

            // Lê cada caractere do arquivo e imprime na tela
            while ((caractere = fileReader.read()) != -1) {
                System.out.print((char) caractere);
            }

            // Fecha o FileReader após a leitura
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
