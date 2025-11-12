package br.com.infnet.exercicio3.correcoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Produto> produtos = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        return produtos.stream()
                .map(Produto::getSubtotal)
                .reduce(0.0, Double::sum);
    }
}
