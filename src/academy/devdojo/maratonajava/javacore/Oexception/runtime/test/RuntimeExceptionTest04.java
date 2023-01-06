package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Dentro do IndexOutOfBoundsException");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Dentro do IllegalArgumentException");
//        } catch (ArithmeticException e) {
//            System.out.println("Dentro do ArithmeticException");
//        } catch (RuntimeException e) {
//            System.out.println("Dentro do RuntimeException");
//        }

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Capturando multiplos catch");
        }

        try {
            talvezLanceException();

//        }catch (IOException | SQLException e) {
//            e.printStackTrace();
//            System.out.println("Capturando multiplos catch");
//        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
