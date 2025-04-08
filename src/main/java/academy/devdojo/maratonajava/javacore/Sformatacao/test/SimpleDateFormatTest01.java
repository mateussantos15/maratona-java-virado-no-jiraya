package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    // Aula 118 - Classes Utilitárias - SimpleDateFormat
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Brasil 19 de Março de 2024"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
