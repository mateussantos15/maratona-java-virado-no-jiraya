package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {

    PESSOA_FISICA (1, "Pessoa Fisica"), PESSOA_JURIDICA (2, "Pessoa Juridica");

    public final int VALOR;
    private String tipoPessoa;
    TipoCliente(int valor, String tipoPessoa) {
        this.VALOR = valor;
        this.tipoPessoa = tipoPessoa;
    }
//
    public String getTipoPessoa() {
        return tipoPessoa;
    }
}
