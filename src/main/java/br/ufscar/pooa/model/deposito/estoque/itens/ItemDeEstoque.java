package br.ufscar.pooa.model.deposito.estoque.itens;

public abstract class ItemDeEstoque {
  private String marca;
  private String modelo;
  private int quantidadeDeEstoque;
  private double valor;

  public ItemDeEstoque(String marca, String modelo, int quantidadeDeEstoque, double valor) {
    this.marca = marca;
    this.modelo = modelo;
    this.quantidadeDeEstoque = quantidadeDeEstoque;
    this.valor = valor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getQuantidadeDeEstoque() {
    return quantidadeDeEstoque;
  }

  public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
    this.quantidadeDeEstoque = quantidadeDeEstoque;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
