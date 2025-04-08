package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(100_000_000_000L); // long 100000 // Classe Obsoleta, usada apenas em sistemas legado
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
