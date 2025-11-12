package br.com.infnet.exercicio5.correcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SistemaBancario {
    private final List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void transferir(int origem, int destino, double valor) {
        Conta contaOrigem = buscarConta(origem);
        Conta contaDestino = buscarConta(destino);

        contaOrigem.debitar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência realizado com sucesso!");
    }

    public Conta buscarConta(int numero) {
        return contas.stream()
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Conta não encontrada: " + numero));
    }
}
