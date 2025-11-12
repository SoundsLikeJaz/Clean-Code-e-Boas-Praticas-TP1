package br.com.infnet.exercicio6.correcoes;

import java.util.List;

public class RelatorioFinanceiro {

    public void gerarRelatorio(List<Cliente> clientes) {
        exibirCabecalho();
        clientes.forEach(System.out::println);
        exibirRodape();
    }

    public void exibirCabecalho() {
        System.out.println("=== Relatório Financeiro ===");
    }

    public void exibirRodape() {
        System.out.println("===========================");
        System.out.println("Fim do Relatório");
    }
}
