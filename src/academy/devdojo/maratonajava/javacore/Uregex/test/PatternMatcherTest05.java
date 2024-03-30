package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    // Aula 135 - Classes Utilitárias - Regex pt 5 - Pattern e Matcher

    /**
     * Regex, abreviação de "expressões regulares", é uma poderosa ferramenta utilizada para encontrar
     * padrões em strings. No Java, você pode usar a classe Pattern para criar um objeto de expressão
     * regular e a classe Matcher para aplicar essa expressão regular a uma string e realizar
     * operações como encontrar correspondências, substituir partes da string que correspondem
     * ao padrão, etc.
     * @param args
     */
    public static void main(String[] args) {
//        String regex  = "aba";
//        String texto = "abababa";
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \W = a-ZA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | condicional ou
        // $ fim da linha
        // . = Tudo que estiver no intervalo entre algumas coisa . alguma coisa || exemplo: 1.3 = 123, 133, 1@3, 1A3 ||
        String regex  = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email Valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
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
