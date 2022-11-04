package academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double Salario) {
        super(nome, Salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
