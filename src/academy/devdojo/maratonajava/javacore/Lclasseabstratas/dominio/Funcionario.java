package academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario (String nome, double Salario) {
        this.nome = nome;
        this.salario = Salario;
    }

    public abstract void calcularBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
