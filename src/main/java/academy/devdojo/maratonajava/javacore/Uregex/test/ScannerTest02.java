package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    // Aula 137 - Classes Utilitárias - Scanner - Tokens e Delimitadores

    /**
     * Em Java, tokens e delimitadores são frequentemente utilizados em operações de parsing de strings.
     *
     * Tokens: São partes individuais de uma string que são separadas por delimitadores. Por exemplo, se
     * tivermos a string "Olá,mundo!", os tokens seriam "Olá" e "mundo", com a vírgula sendo o delimitador.
     *
     * Delimitadores: São caracteres ou strings utilizadas para separar tokens em uma string. No exemplo
     * acima, a vírgula é o delimitador.
     * @param args
     */
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int "+i);

            }else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean "+b);

            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
