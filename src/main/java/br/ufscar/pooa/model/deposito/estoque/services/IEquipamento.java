package br.ufscar.pooa.model.deposito.estoque.services;

import br.ufscar.pooa.model.deposito.estoque.itens.Peca;

public interface IEquipamento {
  public void adidionarPeca(Peca peca);

  public void removerPeca(Peca peca);

  public void atualizarValorMaoDeObra(double valor);

  public void atualizarValorEntregaTecnica(double valor);

}
