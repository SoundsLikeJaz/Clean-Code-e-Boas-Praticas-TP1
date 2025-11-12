package br.com.infnet.exercicio4.correcoes;

public class Livro {
    private final String titulo;
    private boolean disponivel;

    public Livro(String titulo, boolean disponivel) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void emprestar(){
        if(!this.disponivel) throw new IllegalStateException("Livro indisponível.");

        this.disponivel = false;
    }

    public void devolver() {
        if(this.disponivel) throw new IllegalStateException("Livro já está na biblioteca.");

        this.disponivel = true;
    }
}
