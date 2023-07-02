package br.ufscar.pooa.model.deposito.estoque.itens;

import java.util.List;

public class Peca extends ItemDeEstoque {
  private List<Equipamento> equipamentos;

  public Peca(String marca, String modelo, int quantidadeDeEstoque, double valor) {
    super(marca, modelo, quantidadeDeEstoque, valor);
  }
}
