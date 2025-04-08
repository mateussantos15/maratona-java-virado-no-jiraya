package academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double Salario) {
        super(nome, Salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.02;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprime() {

    }
}
