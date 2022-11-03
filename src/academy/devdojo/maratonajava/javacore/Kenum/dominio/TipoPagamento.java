package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO (1, "Debito") {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO (2, "Credito"){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };
    public final int VALOR;
    public final String TIPO;
    TipoPagamento(int valor, String tipo){
        this.VALOR = valor;
        this.TIPO = tipo;
    }
    public abstract double calcularDesconto(double valor);


}
