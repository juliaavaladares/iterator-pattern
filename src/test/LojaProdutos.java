package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.*;

public class LojaProdutos {

    @Test
    public void deveContarProdutosDisponiveis() {
        CatalogoProdutos catalogo = new CatalogoProdutos(
                new Produto("Escova de dentes", false, 36.99),
                new Produto("Pasta de dente", true, 7.99),
                new Produto("Sabonete", false, 3.89),
                new Produto("Papel Higienico", true, 24.99));

        assertEquals(2, Loja.contarProdutosDisponiveis(catalogo));
    }
}
