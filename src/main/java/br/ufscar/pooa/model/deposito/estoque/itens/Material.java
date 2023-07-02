package br.ufscar.pooa.model.deposito.estoque.itens;

public class Material extends ItemDeEstoque {
  private String quantidade;

  public Material(String marca, String modelo, int quantidadeDeEstoque, double valor) {
    super(marca, modelo, quantidadeDeEstoque, valor);
  }
}
