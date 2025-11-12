package br.com.infnet.exercicio7.correcoes;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) throw new IllegalArgumentException("Titular não pode estar vazio!");

        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido");

        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor do saque deve ser positivo.");
        if (valor > this.getSaldo()) throw new IllegalArgumentException("Saldo insuficiente");

        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
