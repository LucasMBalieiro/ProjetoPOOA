package br.ufscar.pooa.model.servicos;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;

import java.time.LocalDate;

public class EquipamentoCliente {
  private Cliente cliente;
  private LocalDate dataChegada;
  private Equipamento equipamento;

  public EquipamentoCliente(Cliente cliente, LocalDate dataChegada, Equipamento equipamento) {
    this.cliente = cliente;
    this.dataChegada = dataChegada;
    this.equipamento = equipamento;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public LocalDate getDataChegada() {
    return dataChegada;
  }

  public void setDataChegada(LocalDate dataChegada) {
    this.dataChegada = dataChegada;
  }

  public Equipamento getEquipamento() {
    return equipamento;
  }

  public void setEquipamento(Equipamento equipamento) {
    this.equipamento = equipamento;
  }
}
