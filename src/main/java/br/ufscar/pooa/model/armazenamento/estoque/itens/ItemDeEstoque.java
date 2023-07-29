package br.ufscar.pooa.model.armazenamento.estoque.itens;

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

  public long getId() {
    return id;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getQuantidadeEmEstoque() {
    return quantidadeEmEstoque;
  }

  public double getValorDeVenda() {
    return valorDeVenda;
  }

  public List<String> getEtiquetas() {
    return etiquetas;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void reduzirEstoque(int quantidade) {
    this.quantidadeEmEstoque -= quantidade;
  }

  public void aumentarEstoque(int quantidade) {
    this.quantidadeEmEstoque += quantidade;
  }

  public void setValorDeVenda(double valorDeVenda) {
    this.valorDeVenda = valorDeVenda;
  }

  public void setEtiquetas(List<String> etiquetas) {
    this.etiquetas = etiquetas;
  }

  @Override
  public double getValor() {
    return this.valorDeVenda;
  }

  @Override
  public String getDescricao() {
    return this.modelo + " " + this.marca;
  }

  @Override
  public void registrarVenda(int quantidade) {
    this.reduzirEstoque(quantidade);
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