package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {

    PESSOA_FISICA (1, "Pessoa Fisica"), PESSOA_JURIDICA (2, "Pessoa Juridica");

    public final int VALOR;
//    private String tipoPessoa;
    private String nomeRelatorio;
    TipoCliente(int valor, String tipoPessoa) {
        this.VALOR = valor;
        this.nomeRelatorio = tipoPessoa;
    }
    public static TipoCliente TipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }
    //
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
