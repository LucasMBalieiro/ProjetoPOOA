package br.ufscar.pooa.model.armazenamento.estoque.itens;

import br.ufscar.pooa.model.armazenamento.estoque.IItemDeServico;

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

  public void adicionarEquipamento(Equipamento equipamento) {
    this.equipamentos.add(equipamento);
  }

  public void removerEquipamento(Equipamento equipamento) {
    this.equipamentos.remove(equipamento);
  }

  @Override
  public double getValor() {
    return this.getValorDeVenda();
  }

  @Override
  public String getDescricao() {
    return this.getModelo() + " " + this.getMarca();
  }
}
