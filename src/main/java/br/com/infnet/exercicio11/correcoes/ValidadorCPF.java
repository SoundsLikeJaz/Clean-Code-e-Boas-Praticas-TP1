package br.com.infnet.exercicio11.correcoes;

public class ValidadorCPF {
    public boolean validar(String cpf) {
        if (cpf.length() != 11) throw new IllegalArgumentException("CPF invalido");
        return true;
    }
}
