package br.ufscar.pooa.model.deposito.estoque.services;

import br.ufscar.pooa.model.deposito.estoque.itens.ItemDeEstoque;

import java.util.List;

public interface IEstoque {
  public void adicionarItem(
      ItemDeEstoque item, int quantidade);

  public void removerItem(
      ItemDeEstoque item, int quantidade);

  public void cadastrarItem(
      ItemDeEstoque item);

  public List<ItemDeEstoque> obterItems();

  public ItemDeEstoque obterItemPorId(long id);

  public List<ItemDeEstoque> obterItemPorMarca(String marca);

  public List<ItemDeEstoque> obterItemPorModelo(String modelo);
}
