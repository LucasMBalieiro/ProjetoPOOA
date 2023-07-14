package br.ufscar.pooa.model.comercio;

public interface Produto {
  public double obterValor();

  public String obterDescricao();

  public void registrarVenda(int quantidade);
}