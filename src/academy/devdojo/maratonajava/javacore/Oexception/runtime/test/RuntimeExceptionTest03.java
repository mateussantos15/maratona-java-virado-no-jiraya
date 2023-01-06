package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
        } catch (Exception e) {

        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
