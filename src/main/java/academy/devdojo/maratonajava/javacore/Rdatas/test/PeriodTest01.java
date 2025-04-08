package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    // Aula 124 - Classes Utilitárias - Period

    /**
     * A classe Period em Java é parte do pacote java.time, introduzido no Java 8 para manipulação de datas
     * e tempos. Ela representa um período de tempo entre duas datas ou tempos, com uma precisão de dias.
     * Um período é definido como uma quantidade de tempo que pode ser expressa em termos de anos, meses e dias.
     * É diferente de um intervalo de tempo específico, como uma duração de horas, minutos e segundos.
     *
     * A classe Period é imutável e pode ser usada para realizar operações como adição ou subtração de
     * períodos de datas. Ela oferece uma maneira fácil de trabalhar com períodos de tempo,
     * especialmente quando você precisa lidar com a diferença entre datas.
     *
     * Aqui está exemplos simples de como usar a classe Period:
     * @param args
     */

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p3.getMonths());
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths()); // Não é possovel
        System.out.println(now.until(now.plusDays(p3.getDays())));

        // Exemplo 02

        // Definindo duas datas
        LocalDate dataInicial = LocalDate.of(2020, 1, 1);
        LocalDate dataFinal = LocalDate.of(2024, 3, 21);

        // Calculando o período entre as duas datas
        Period periodo = Period.between(dataInicial, dataFinal);

        // Extraindo os componentes do período
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Exibindo o período entre as datas
        System.out.println("Período entre " + dataInicial + " e " + dataFinal + ":");
        System.out.println(anos + " anos, " + meses + " meses, e " + dias + " dias.");
    }
}
