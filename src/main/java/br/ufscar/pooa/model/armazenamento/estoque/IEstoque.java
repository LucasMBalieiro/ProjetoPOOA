package br.ufscar.pooa.model.armazenamento.estoque;

import br.ufscar.pooa.model.armazenamento.estoque.itens.ItemDeEstoque;

import java.util.Set;

public interface IEstoque {
  public Set<ItemDeEstoque> getItens();

  public void aumentarEstoque(
      ItemDeEstoque item, int quantidade);

  public void reduzirEstoque(
      ItemDeEstoque item, int quantidade);

  public void atualizarItem(ItemDeEstoque item);

  public void removerItem(ItemDeEstoque item);

  public ItemDeEstoque obterItemPorId(Long id);

  public Set<ItemDeEstoque> obterItemPorMarca(String marca);

  public Set<ItemDeEstoque> obterItemPorModelo(String modelo);
}
