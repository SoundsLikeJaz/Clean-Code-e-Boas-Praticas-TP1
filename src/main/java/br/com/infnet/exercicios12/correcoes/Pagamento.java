package br.com.infnet.exercicios12.correcoes;

public class Pagamento {
    public void processarPagamento(double valor, String metodo) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser positivo.");
        }

        switch (metodo.toLowerCase()) {
            case "cartao":
                System.out.printf("Pagamento de %.2f realizado via cartão.\n", valor);
                break;
            case "boleto":
                System.out.printf("Pagamento de %.2f realizado via boleto.\n", valor);
                break;
            default:
                throw new MetodoPagamentoInvalidoException(metodo);
        }
    }
}
