package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private transient String passaword;
    private static final String NOME_ESCOLA = "DevDojo Viradão no Jiraya"; // Metodos de static pertence a classe
    // não ao objeto, então sempre aparecem na serialização
    private transient Turma turma;

    public Aluno(Long id, String nome, String passaword) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.passaword = passaword;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passaword='" + passaword + '\'' +
                ", NOME_ESCOLA= '" + NOME_ESCOLA + '\'' +
                ", Turma= '" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }
}
