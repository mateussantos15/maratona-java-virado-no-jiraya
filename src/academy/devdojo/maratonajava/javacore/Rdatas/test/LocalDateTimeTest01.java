package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    // Aula 121 - Classes Utilitárias - LocalDateTime
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2023-04-06");
        LocalTime time = LocalTime.parse("23:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldr1 = time.atDate(date);
        LocalDateTime ldt2 = date.atTime(time);
        System.out.println(ldr1);
        System.out.println(ldt2);

    }
}
