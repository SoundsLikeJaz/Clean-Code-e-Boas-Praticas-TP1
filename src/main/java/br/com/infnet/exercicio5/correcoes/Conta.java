package br.com.infnet.exercicio5.correcoes;

public class Conta {
    private final int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        setTitular(titular);
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) throw new IllegalArgumentException("Nome do titular não pode estar " +
                "vazio");
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void debitar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido");
        if (valor > this.getSaldo()) throw new IllegalArgumentException("Saldo insuficiente");
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido");

        this.saldo += valor;
    }
}
