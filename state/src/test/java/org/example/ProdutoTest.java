package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto();
    }

    // Produto para embarcar

    @Test
    public void naoDeveEmbarcarProdutoParaEmbarcar() {
        produto.setEstado(EstadoParaEmbarcar.getInstance());
        assertFalse(produto.embarcar());
    }

    @Test
    public void deveIniciarViagemProdutoParaEmbarcar() {
        produto.setEstado(EstadoParaEmbarcar.getInstance());
        assertTrue(produto.iniciarViagem());
        assertEquals(EstadoEmViagem.getInstance(), produto.getEstado());
    }

    @Test
    public void naoDeveFinalizarViagemProdutoParaEmbarcar() {
        produto.setEstado(EstadoParaEmbarcar.getInstance());
        assertFalse(produto.finalizarViagem());
    }

    @Test
    public void naoDeveRetirarProdutoParaEmbarcar() {
        produto.setEstado(EstadoParaEmbarcar.getInstance());
        assertFalse(produto.retirar());
    }

    // Produto em viagem

    @Test
    public void naoDeveEmbarcarProdutoEmViagem() {
        produto.setEstado(EstadoEmViagem.getInstance());
        assertFalse(produto.embarcar());
    }

    @Test
    public void naoDeveIniciarViagemProdutoEmViagem() {
        produto.setEstado(EstadoEmViagem.getInstance());
        assertFalse(produto.iniciarViagem());
    }

    @Test
    public void deveFinalizarViagemProdutoEmViagem() {
        produto.setEstado(EstadoEmViagem.getInstance());
        assertTrue(produto.finalizarViagem());
        assertEquals(EstadoProntoParaRetirar.getInstance(), produto.getEstado());
    }

    @Test
    public void naoDeveRetirarProdutoEmViagem() {
        produto.setEstado(EstadoEmViagem.getInstance());
        assertFalse(produto.retirar());
    }

    // Produto pronto para retirar

    @Test
    public void naoDeveEmbarcarProdutoProntoParaRetirar() {
        produto.setEstado(EstadoProntoParaRetirar.getInstance());
        assertFalse(produto.embarcar());
    }

    @Test
    public void naoDeveIniciarViagemProdutoProntoParaRetirar() {
        produto.setEstado(EstadoProntoParaRetirar.getInstance());
        assertFalse(produto.iniciarViagem());
    }

    @Test
    public void naoDeveFinalizarViagemProdutoProntoParaRetirar() {
        produto.setEstado(EstadoProntoParaRetirar.getInstance());
        assertFalse(produto.finalizarViagem());
    }

    @Test
    public void deveRetirarProdutoProntoParaRetirar() {
        produto.setEstado(EstadoProntoParaRetirar.getInstance());
        assertTrue(produto.retirar());
        assertNull(produto.getEstado());
    }
}