package br.ufscar.pooa.model.armazenamento.estoque.itens;

import br.ufscar.pooa.model.armazenamento.estoque.IItemDeServico;

import java.util.List;

public class Material extends ItemDeEstoque implements IItemDeServico {
  private String quantidade;

  public Material(long id, String marca, String modelo, int quantidadeDeEstoque, double valor, List<String> etiquetas, String quantidade) {
    super(id, marca, modelo, quantidadeDeEstoque, valor, etiquetas);
    this.quantidade = quantidade;
  }

  public String getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(String quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public double getValor() {
    return this.getValorDeVenda();
  }

  @Override
  public String getDescricao() {
    return this.getModelo() + " " + this.getMarca();
  }
}
