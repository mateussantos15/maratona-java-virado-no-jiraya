package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;


public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador1};

        jogador.setTime(time);
        jogador1.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--------------Jogador---------------");
        jogador.imprime();
        jogador1.imprime();
        System.out.println("--------------Time---------------");
        time.imprime();
    }
}
