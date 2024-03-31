package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    // Aula 143 - Classes Utilitárias - IO pt 06 - File para Diretorios

    /**
     * A classe File é utilizada para representar tanto arquivos quanto diretórios no sistema de arquivos.
     * Ela fornece métodos para realizar operações comuns de manipulação de arquivos e diretórios,
     * como criar, listar, renomear, excluir, entre outros.
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDeretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pata Criada: "+isDeretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo Criado: "+isFileCreated);

//        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
//        System.out.println("Arquivo Renomeado: "+fileArquivoDiretorio.renameTo(fileRenamed));
//
//        File diretorioReamed = new File("pasta2");
//        System.out.println("Pasta Renomeada: "+fileDiretorio.renameTo(diretorioReamed));

//        String[] files = diretorioReamed.list();
//        if (files != null) {
//            System.out.println("Conteúdo do diretório:");
//            for (String file : files) {
//                System.out.println(file);
//            }
//        } else {
//            System.out.println("O diretório está vazio ou não é um diretório.");
//        }

        // Verificando se o diretório existe
        /**
        if (!diretorioReamed.exists()) {
            System.out.println("O diretório não existe.");
            return;
        }

        // Chamando o método para deletar o diretório
        boolean deletadoComSucesso = deleteDirectory(diretorioReamed);
        if (deletadoComSucesso) {
            System.out.println("Diretório deletado com sucesso.");
        } else {
            System.out.println("Falha ao deletar o diretório.");
        }
**/

    }
    // Método para deletar um diretório recursivamente
    public static boolean deleteDirectory(File directory) {
        if (!directory.exists()) {
            return true;
        }

        // Verificando se é um diretório
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    // Deletando recursivamente os arquivos e subdiretórios
                    if (!deleteDirectory(file)) {
                        return false;
                    }
                }
            }
        }

        // Deletando o diretório após ter excluído todos os arquivos e subdiretórios
        return directory.delete();
    }
}
