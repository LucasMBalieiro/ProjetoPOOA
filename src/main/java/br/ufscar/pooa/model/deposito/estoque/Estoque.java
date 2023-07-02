package br.ufscar.pooa.model.deposito.estoque;

import br.ufscar.pooa.model.deposito.estoque.itens.ItemDeEstoque;

import java.util.List;

public class Estoque {
  private List<ItemDeEstoque> itens;

  public Estoque(List<ItemDeEstoque> itens) {
    this.itens = itens;
  }

  public List<ItemDeEstoque> getItens() {
    return itens;
  }

  public void setItens(List<ItemDeEstoque> itens) {
    this.itens = itens;
  }
}
