package br.ufscar.pooa.model.servicos.laudo;

import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.servicos.EquipamentoCliente;

import java.util.List;

public class LaudoTecnico {
  private List<Recomendacao> recomendacoes;
  private Cliente cliente;
  private double valorTotal;
  private EquipamentoCliente equipamento;
  private String laudo;

  public LaudoTecnico(List<Recomendacao> recomendacoes, Cliente cliente, double valorTotal, EquipamentoCliente equipamento, String laudo) {
    this.recomendacoes = recomendacoes;
    this.cliente = cliente;
    this.valorTotal = valorTotal;
    this.equipamento = equipamento;
    this.laudo = laudo;
  }

  public List<Recomendacao> getRecomendacoes() {
    return recomendacoes;
  }

  public void setRecomendacoes(List<Recomendacao> recomendacoes) {
    this.recomendacoes = recomendacoes;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public EquipamentoCliente getEquipamento() {
    return equipamento;
  }

  public void setEquipamento(EquipamentoCliente equipamento) {
    this.equipamento = equipamento;
  }

  public String getLaudo() {
    return laudo;
  }

  public void setLaudo(String laudo) {
    this.laudo = laudo;
  }
}
