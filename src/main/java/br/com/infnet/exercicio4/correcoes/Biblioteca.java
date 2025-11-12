package br.com.infnet.exercicio4.correcoes;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<Livro>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        Livro livro = encontrarLivroPorTitulo(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível.");
            return;
        }

        livro.emprestar();
        System.out.println("Livro emprestado com sucesso.");
    }

    public void devolverLivro(String titulo) {
        Livro livro = encontrarLivroPorTitulo(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (livro.isDisponivel()) {
            System.out.println("Livro já está na biblioteca.");
            return;
        }

        livro.devolver();
        System.out.println("Livro devolvido com sucesso.");
    }

    private Livro encontrarLivroPorTitulo(String titulo) {
        return livros.stream()
                .filter(livro -> titulo.equalsIgnoreCase(livro.getTitulo()))
                .findFirst()
                .orElse(null);
    }
}
