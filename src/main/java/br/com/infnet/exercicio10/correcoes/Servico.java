package br.com.infnet.exercicio10.correcoes;

public class Servico {
    public void processar(String dado) {
        if (dado.isEmpty()) throw new IllegalArgumentException("Dado não pode ser vazio");
        System.out.println("Processando: " + dado.toUpperCase());
    }
}
