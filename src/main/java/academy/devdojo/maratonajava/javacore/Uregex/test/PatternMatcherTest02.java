package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    // Aula 132 - Classes Utilitárias - Regex pt 3 - Pattern e Matcher

    /**
     * Regex, abreviação de "expressões regulares", é uma poderosa ferramenta utilizada para encontrar
     * padrões em strings. No Java, você pode usar a classe Pattern para criar um objeto de expressão
     * regular e a classe Matcher para aplicar essa expressão regular a uma string e realizar
     * operações como encontrar correspondências, substituir partes da string que correspondem
     * ao padrão, etc.
     * @param args
     */
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \W = a-ZA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        String regex  = "\\w";
        String texto = "@#hh_j2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
