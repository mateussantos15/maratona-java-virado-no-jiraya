package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
   // Aula 127 - Classes Utilitárias - Zone

    /**
     * A classe Zone em Java é parte do pacote java.time introduzido no Java 8, que fornece
     * suporte para operações relacionadas ao tempo e datas. A classe Zone é usada para
     * representar fusos horários. Ela contém constantes que representam os fusos
     * horários suportados pelo sistema. Ela fornece métodos para obter informações
     * sobre fusos horários específicos, como nome, deslocamento em relação ao
     * Tempo Universal Coordenado (UTC), etc.
     * @param args
     */
   public static void main(String[] args) {
       Map<String, String> shortIds = ZoneId.SHORT_IDS;
       System.out.println(shortIds);
       System.out.println(ZoneId.systemDefault());
       ZoneId tokyoZona = ZoneId.of("Asia/Tokyo");
       System.out.println(tokyoZona);
       LocalDateTime now = LocalDateTime.now();
       System.out.println(now);

       ZonedDateTime zonedDateTime = now.atZone(tokyoZona);
       System.out.println(zonedDateTime);

       Instant nowInstant = Instant.now();
       System.out.println(nowInstant);
       ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZona);
       System.out.println(zonedDateTime1);

       System.out.println(ZoneOffset.MIN);
       System.out.println(ZoneOffset.MAX);

       ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
       OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
       System.out.println(offsetDateTime);
       OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffsetManaus);
       System.out.println(offsetDateTime1);

       OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffsetManaus);
       System.out.println(offsetDateTime2);

       JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
       System.out.println(japaneseDate);
       LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
       JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
       System.out.println(meijiEra);

       // Exemplo 02:

       // Obtendo o fuso horário padrão do sistema
       ZoneId zoneId = ZoneId.systemDefault();
       System.out.println("Fuso Horário Padrão: " + zoneId);

       // Obtendo o deslocamento em relação ao UTC para o fuso horário padrão
       ZoneOffset zoneOffset = zoneId.getRules().getOffset(Instant.now());
       System.out.println("Deslocamento em relação ao UTC: " + zoneOffset);

       // Obtendo informações sobre um fuso horário específico
       ZoneId newYorkZone = ZoneId.of("America/New_York");
       System.out.println("Fuso Horário de Nova Iorque: " + newYorkZone);
       ZoneOffset newYorkOffset = newYorkZone.getRules().getOffset(Instant.now());
       System.out.println("Deslocamento em relação ao UTC para Nova Iorque: " + newYorkOffset);
   }
}
