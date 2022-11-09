package academy.devdojo.maratonajava.javacore.Lclasseabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Saitama", 2000);
        Gerente gerente = new Gerente("Son Goku", 5000);
        desenvolvedor.calcularBonus();
        gerente.calcularBonus();
        System.out.println(desenvolvedor);

        System.out.println(gerente);
    }
}
