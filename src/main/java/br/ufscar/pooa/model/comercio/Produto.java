package br.ufscar.pooa.model.comercio;

public interface Produto {
  public double getValor();

  public String getDescricao();

  public void registrarVenda(int quantidade);
}