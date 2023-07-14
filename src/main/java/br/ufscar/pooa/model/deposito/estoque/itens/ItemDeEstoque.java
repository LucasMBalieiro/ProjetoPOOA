package br.ufscar.pooa.model.deposito.estoque.itens;

import br.ufscar.pooa.model.comercio.Produto;

import java.util.List;

public abstract class ItemDeEstoque implements Produto {
  private long id;
  private String marca;
  private String modelo;
  private int quantidadeEmEstoque;
  private double valorDeVenda;
  private List<String> etiquetas;

  public ItemDeEstoque(long id, String marca, String modelo, int quantidadeEmEstoque, double valorDeVenda, List<String> etiquetas) {
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
    this.valorDeVenda = valorDeVenda;
    this.etiquetas = etiquetas;
  }

  public String obterDescricao() {
    return this.marca + " " + this.modelo;
  }

  public double obterValor() {
    return this.valorDeVenda;
  }

  @Override
  public void registrarVenda(int quantidade) {
    this.quantidadeEmEstoque -= quantidade;
  }

  public int getQuantidadeEmEstoque() {
    return quantidadeEmEstoque;
  }

  public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<String> getEtiquetas() {
    return etiquetas;
  }

  public void setEtiquetas(List<String> etiquetas) {
    this.etiquetas = etiquetas;
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

  public double getValorDeVenda() {
    return valorDeVenda;
  }

  public void setValorDeVenda(double valorDeVenda) {
    this.valorDeVenda = valorDeVenda;
  }

  @Override
  public String toString() {
    return "ItemDeEstoque{" +
        "id=" + id +
        ", marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", quantidadeEmEstoque=" + quantidadeEmEstoque +
        ", valorDeVenda=" + valorDeVenda +
        ", etiquetas=" + etiquetas +
        '}';
  }
}
