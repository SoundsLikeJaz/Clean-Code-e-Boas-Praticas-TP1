package br.com.infnet.exercicio8.correcoes;

/**
 * Representa um pedido realizado pelo cliente,
 * contendo identificação, descrição e valor.
 */
public class Pedido {
    private int id;
    private String descricao;
    private double valor;

    public Pedido(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
