package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    // Aula 131 - Classes Utilitárias - Regex pt 3 - Pattern e Matcher

    /**
     * Regex, abreviação de "expressões regulares", é uma poderosa ferramenta utilizada para encontrar
     * padrões em strings. No Java, você pode usar a classe Pattern para criar um objeto de expressão
     * regular e a classe Matcher para aplicar essa expressão regular a uma string e realizar
     * operações como encontrar correspondências, substituir partes da string que correspondem
     * ao padrão, etc.
     * @param args
     */
    public static void main(String[] args) {
        String regex  = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" ");
        }


        // Exemplo 02:
        //Verificar se uma string contém apenas números:
        String input = "12345";
        String regex1 = "\\d+"; // \d representa um dígito decimal e + indica uma ou mais ocorrências
        boolean match = Pattern.matches(regex, input); //Pattern.matches(regex, input) verifica se a
        // string input corresponde ao padrão representado por regex

        if (match) {
            System.out.println("A string contém apenas números.");
        } else {
            System.out.println("A string contém caracteres não numéricos.");
        }
    }
}
