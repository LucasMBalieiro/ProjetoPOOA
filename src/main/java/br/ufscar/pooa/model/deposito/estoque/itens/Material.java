package br.ufscar.pooa.model.deposito.estoque.itens;

import br.ufscar.pooa.model.deposito.estoque.Utilizavel;

public class Material extends ItemDeEstoque implements Utilizavel {
  private String quantidade;

  public Material(String marca, String modelo, int quantidadeDeEstoque, double valor) {
    super(marca, modelo, quantidadeDeEstoque, valor);
  }
}
