package br.ufscar.pooa.model.armazenamento.estoque;

import br.ufscar.pooa.model.armazenamento.estoque.itens.ItemDeEstoque;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Estoque implements IEstoque {
  private static Estoque instance;
  private Set<ItemDeEstoque> itens;

  private Estoque() {
    this.itens = new HashSet<>();
  }

  public static synchronized Estoque getInstancia() {
    if (Estoque.instance == null) {
      Estoque.instance = new Estoque();
    }

    return Estoque.instance;
  }


  @Override
  public Set<ItemDeEstoque> getItens() {
    return this.itens;
  }

  @Override
  public void adicionarItem(ItemDeEstoque item) {
    this.itens.add(item);
  }

  @Override
  public void aumentarEstoque(ItemDeEstoque item, int quantidade) {
    this.itens.forEach(i -> {
      if (i.equals(item)) {
        i.aumentarEstoque(quantidade);
      }
    });
  }

  @Override
  public void reduzirEstoque(ItemDeEstoque item, int quantidade) {
    this.itens.forEach(i -> {
      if (i.equals(item)) {
        i.reduzirEstoque(quantidade);
      }
    });
  }

  @Override
  public void atualizarItem(ItemDeEstoque item) {
    this.itens.forEach(i -> {
      if (i.equals(item)) {
        i = item;
      }
    });
  }

  @Override
  public void removerItem(ItemDeEstoque item) {
    this.itens.remove(item);
  }

  @Override
  public ItemDeEstoque obterItemPorId(Long id) {
    return this.itens.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
  }

  @Override
  public Set<ItemDeEstoque> obterItemPorMarca(String marca) {
    return this.itens.stream().filter(i -> i.getMarca().equals(marca)).collect(Collectors.toSet());
  }

  @Override
  public Set<ItemDeEstoque> obterItemPorModelo(String modelo) {
    return this.itens.stream().filter(i -> i.getModelo().equals(modelo)).collect(Collectors.toSet());
  }
}
