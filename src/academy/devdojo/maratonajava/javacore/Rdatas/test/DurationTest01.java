package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    // Aula 123 - Classes Utilitárias - Duration

    /**
     * A classe Duration no Java é usada para representar uma quantidade de tempo em termos
     * de horas, minutos, segundos e nanossegundos. Ela é parte do pacote java.time
     * introduzido no Java 8, que oferece uma API mais moderna para manipulação de datas e horas.
     *
     * A classe Duration é útil quando você precisa medir um intervalo de tempo entre dois pontos
     * em seu código ou quando precisa realizar operações matemáticas com durações de tempo.
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime timeMinus7Hours = LocalDateTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

    }
}
