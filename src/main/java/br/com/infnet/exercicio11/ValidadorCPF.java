package br.com.infnet.exercicio11;

public class ValidadorCPF {
    public boolean validar(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        return true;
    }
}
