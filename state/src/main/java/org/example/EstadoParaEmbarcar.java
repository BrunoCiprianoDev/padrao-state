package org.example;

public class EstadoParaEmbarcar extends ProdutoEstado {

    private EstadoParaEmbarcar() {};
    private static EstadoParaEmbarcar instance = new EstadoParaEmbarcar();
    public static EstadoParaEmbarcar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Para Embarcar";
    }

    public boolean iniciarViagem(Produto produto) {
        produto.setEstado(EstadoEmViagem.getInstance());
        return true;
    }
}
