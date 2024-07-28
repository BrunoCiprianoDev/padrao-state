package org.example;

public abstract class ProdutoEstado {

    public abstract String getEstado();

    public boolean embarcar(Produto produto) {
        return false;
    }

    public boolean iniciarViagem(Produto produto) {
        return false;
    }

    public boolean finalizarViagem(Produto produto) {
        return false;
    }

    public boolean retirar(Produto produto) {
        return false;
    }

}