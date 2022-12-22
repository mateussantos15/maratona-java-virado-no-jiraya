package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: "+computador.getNome());
//        System.out.println("Valor: "+computador.getValor());
//        System.out.println("Imposto a ser pago: "+imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("\nRelatório de imposto do Tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate: "+tomate.getNome());
//        System.out.println("Valor: "+tomate.getValor());
//        System.out.println("Imposto a ser pago: "+imposto);
//    }

    public static void calcularImposto(Produto produto){
        System.out.println("\nRelatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a Ser Pago: "+imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
//            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
