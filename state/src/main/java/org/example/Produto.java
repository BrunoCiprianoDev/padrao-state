package org.example;

public class Produto {

    private String nome;
    private ProdutoEstado estado;

    public Produto() {
        this.estado = EstadoParaEmbarcar.getInstance();
    }

    public void setEstado(ProdutoEstado estado) {
        this.estado = estado;
    }

    public boolean embarcar() {
        return estado.embarcar(this);
    }

    public boolean iniciarViagem() {
        return estado.iniciarViagem(this);
    }

    public boolean finalizarViagem() {
        return estado.finalizarViagem(this);
    }

    public boolean retirar() {
        return estado.retirar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoEstado getEstado() {
        return estado;
    }
}