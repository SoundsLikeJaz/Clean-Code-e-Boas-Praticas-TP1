package br.com.infnet.exercicio3.correcoes;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(1);
    }

    public Produto(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else throw new IllegalArgumentException("O nome não pode estar vazio.");
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) this.preco = preco;
        else throw new IllegalArgumentException("O preço deve ser maior que zero.");
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) this.quantidade = quantidade;
        else throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
    }

    public double getSubtotal() {
        return preco * quantidade;
    }
}
