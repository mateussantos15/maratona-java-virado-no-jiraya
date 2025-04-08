package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAjustersTest01 {
    // Aula 126 - Classes Utilitárias - TemporalAjusters

    /**
     *
     A classe TemporalAdjusters no Java faz parte do pacote java.time introduzido no Java 8,
     que fornece classes para manipulação de data e hora. Esta classe é responsável por
     fornecer métodos estáticos para ajustar objetos Temporal, que são representações
     de pontos de tempo, como LocalDate, LocalDateTime, ZonedDateTime, entre outros.

     Os métodos na classe TemporalAdjusters são geralmente utilizados em conjunto com a classe
     LocalDate, LocalDateTime, ou qualquer outra classe Temporal, para realizar ajustes comuns,
     como "próximo dia útil", "último dia do mês", "próximo domingo", e assim por diante.
     * @param args
     */
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 18);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        // Exemplo 02: obter o próximo domingo a partir de uma data específica:
        // Data atual
        LocalDate hoje = LocalDate.now();

        // Próximo domingo a partir da data atual
        LocalDate proximoDomingo = hoje.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        // Exibindo o resultado
        System.out.println("Data atual: " + hoje);
        System.out.println("Próximo domingo: " + proximoDomingo);


    }
}
