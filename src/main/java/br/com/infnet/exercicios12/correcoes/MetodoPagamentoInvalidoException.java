package br.com.infnet.exercicios12.correcoes;

public class MetodoPagamentoInvalidoException extends RuntimeException {
    public MetodoPagamentoInvalidoException(String metodo) {
        super(String.format("Método de pagamento inválido: %s", metodo));
    }
}
