package main;

public class Produto {
    private String nome;
    private boolean disponivel;
    private double preco;

    public Produto(String nome, boolean disponivel, double preco) {
        this.nome = nome;
        this.disponivel = disponivel;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}