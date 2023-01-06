package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo Funcionando!");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException { // throws IllegalArgumentException, ira
        // avisar aqueles que iram utilizar esse metodo, que uma possivel Exception podera ocorrer.

        // Exception do tipo unchecked não é obrigatorio tratar (tratamento é opcional), caso seja uma checked,
        // exemplo throws IllegalArgumentException, todos que chamarem o metodo seram obrigados a tratar.
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser feito divisão por zero!");
        }
        return a/b;
//        try {
//            return a/b;
//        } catch(RuntimeException e) {
//            e.printStackTrace();
//        }
//        return 0;
    }
}
