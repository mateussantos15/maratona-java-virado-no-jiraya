package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerTest01 {
    // Aula 137 - Classes Utilitárias - Scanner - Tokens e Delimitadores

    /**
     * Em Java, tokens e delimitadores são frequentemente utilizados em operações de parsing de strings.
     *
     * Tokens: São partes individuais de uma string que são separadas por delimitadores. Por exemplo, se
     * tivermos a string "Olá,mundo!", os tokens seriam "Olá" e "mundo", com a vírgula sendo o delimitador.
     *
     * Delimitadores: São caracteres ou strings utilizadas para separar tokens em uma string. No exemplo
     * acima, a vírgula é o delimitador.
     * @param args
     */
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        String[] nomes = texto.split("\\d");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

        // Exemplo 02:
        // usando StringTokenizer:
        /**
         * Suponha que você tenha uma string que representa uma lista de nomes separados por
         * vírgulas, e você deseja dividir essa string em tokens, onde cada token é um nome.
         * Você pode usar a classe StringTokenizer ou o método split() da classe
         * String para fazer isso.
         */
        texto = "João, Maria, Pedro, Ana";

        // Criando um StringTokenizer com vírgula como delimitador
        StringTokenizer tokenizer = new StringTokenizer(texto, ",");

        // Iterando sobre os tokens e imprimindo cada nome
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken().trim()); // trim() remove espaços em branco extras
        }
    }
}
