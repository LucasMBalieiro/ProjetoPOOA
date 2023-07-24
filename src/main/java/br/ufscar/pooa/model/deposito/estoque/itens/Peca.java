package br.ufscar.pooa.model.deposito.estoque.itens;

import br.ufscar.pooa.model.deposito.estoque.services.IItemDeServico;

import java.util.List;

public class Peca extends ItemDeEstoque implements IItemDeServico {
  private List<Equipamento> equipamentos;

  public Peca(long id, String marca, String modelo, int quantidadeDeEstoque, double valor, List<String> etiquetas, List<Equipamento> equipamentos) {
    super(id, marca, modelo, quantidadeDeEstoque, valor, etiquetas);
    this.equipamentos = equipamentos;
  }

  public List<Equipamento> getEquipamentos() {
    return equipamentos;
  }

  public void setEquipamentos(List<Equipamento> equipamentos) {
    this.equipamentos = equipamentos;
  }
  
}
