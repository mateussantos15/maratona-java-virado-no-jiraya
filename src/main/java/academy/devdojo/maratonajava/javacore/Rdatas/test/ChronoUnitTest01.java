package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    // Aula 125 - Classes Utilitárias - ChronoUnit

    /**
     * A classe ChronoUnit faz parte do pacote java.time em Java e é usada para representar
     * unidades de tempo, como dias, meses, anos, horas, etc. Essa classe é útil
     * para realizar operações de data e hora, como adicionar ou subtrair
     * quantidades específicas de tempo de uma data ou hora.
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
