package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    // Aula 130 - Classes Utilitárias - ResourceBundle

    /**
     * ResourceBundle é uma classe em Java que fornece uma maneira conveniente de externalizar
     * strings e outros recursos específicos de um local em aplicativos. Ele permite que você
     * coloque os recursos em arquivos de propriedades externos e acesse esses recursos de
     * acordo com a localização do usuário.
     *
     * Esses arquivos de propriedades geralmente têm extensão .properties e podem conter pares
     * de chave-valor, onde a chave é um identificador único para o recurso e o valor é a
     * string ou o recurso correspondente. Isso permite que você altere facilmente os
     * recursos sem alterar o código fonte.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
    }

}
