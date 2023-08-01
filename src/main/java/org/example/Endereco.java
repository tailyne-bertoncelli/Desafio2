package org.example;

public class Endereco {
    private String logradouro;
    private int numero;

    public Endereco(String endereco, int num) {
        this.logradouro = endereco;
        this.numero = num;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
