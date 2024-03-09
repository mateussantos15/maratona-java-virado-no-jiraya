package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Mateus Santos";
        nome.concat(" DeveDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Mateus Santos");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
