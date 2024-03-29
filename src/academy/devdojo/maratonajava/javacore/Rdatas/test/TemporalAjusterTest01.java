package academy.devdojo.maratonajava.javacore.Rdatas.test;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {
    // Aula 127 - Classes Utilitárias - Interface TemporalAjuster
    /**
     * A interface TemporalAdjuster é uma parte da API de Data e Hora introduzida no Java 8.
     * Ela define um único método, adjustInto(Temporal temporal), que ajusta uma instância
     * de Temporal para um novo valor. Essa interface permite manipular datas e horas de
     * forma flexível, adicionando ou subtraindo unidades de tempo, alterando campos
     * específicos como dia, mês ou ano, entre outras operações.
     *
     * A principal utilidade da interface TemporalAdjuster é facilitar a manipulação de datas
     * e horas de forma mais expressiva e legível, especialmente ao lidar com ajustes
     * complexos que não são facilmente realizados com métodos diretos em instâncias de Temporal.
     * @param temporal
     * @return
     */

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case TUESDAY: addDays = 4;
            break;
            case FRIDAY: addDays = 3;
            break;
            case SATURDAY: addDays = 2;
            break;
            default: addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
public class TemporalAjusterTest01 {
    // Aula 127 - Classes Utilitárias - TemporalAjuster
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(19).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(21).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
