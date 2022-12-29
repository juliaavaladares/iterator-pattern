package main;

public class Loja {

    public static Integer contarProdutosDisponiveis(CatalogoProdutos catalogoProdutos) {
        int quantidade = 0;
        for (Produto produto : catalogoProdutos) {
            if (produto.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

}
