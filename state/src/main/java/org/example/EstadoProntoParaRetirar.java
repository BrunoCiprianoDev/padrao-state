package org.example;

public class EstadoProntoParaRetirar extends ProdutoEstado {

    private EstadoProntoParaRetirar() {};
    private static EstadoProntoParaRetirar instance = new EstadoProntoParaRetirar();
    public static EstadoProntoParaRetirar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pronto para Retirar";
    }

    public boolean retirar(Produto produto) {
        produto.setEstado(null); // Produto retirado, sem estado atual
        return true;
    }
}