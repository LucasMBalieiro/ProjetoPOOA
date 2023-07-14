package br.ufscar.pooa.model.deposito.estoque.itens;

import br.ufscar.pooa.model.deposito.estoque.services.IItemDeServico;

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
}
