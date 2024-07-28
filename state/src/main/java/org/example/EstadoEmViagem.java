package org.example;

public class EstadoEmViagem extends ProdutoEstado {

    private EstadoEmViagem() {};
    private static EstadoEmViagem instance = new EstadoEmViagem();
    public static EstadoEmViagem getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Viagem";
    }

    public boolean finalizarViagem(Produto produto) {
        produto.setEstado(EstadoProntoParaRetirar.getInstance());
        return true;
    }
}