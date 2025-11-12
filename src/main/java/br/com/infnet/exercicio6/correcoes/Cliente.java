package br.com.infnet.exercicio6.correcoes;

public class Cliente {
    private String nome;
    private double saldo;

    public Cliente(String nome, double saldo) {
        setNome(nome);
        setSaldo(saldo);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s - Saldo: R$ %.2f\n",
                this.getNome(), this.getSaldo());
    }
}
