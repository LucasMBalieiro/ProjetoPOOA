package br.ufscar.pooa.model.comercio;

public class Item implements Produto {
    private Produto produto;
    private int quantidade;
    private double valor; // valor unitário

    // Constructor
    public Item(Produto produto, int quantidade, double valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    // Setter and Getter methods
    public Produto getProduto() { return produto; }

    public void setProduto(Produto produto) { this.produto = produto; }

    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getValor() { return valor; }

    public void setValor(double valor) { this.valor = valor; }

}

