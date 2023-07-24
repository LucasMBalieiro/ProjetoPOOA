package br.ufscar.pooa.model.servicos.laudo;

import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.pessoas.Funcionario;
import br.ufscar.pooa.model.servicos.OrdemDeServico;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.util.List;

public class LaudoTecnico {
  private List<Recomendacao> recomendacoes;
  private double valorTotal;
  private EquipamentoCliente equipamento;
  private String laudo;
  private OrdemDeServico ordemDeServico;
  private Funcionario funcionario;
  private String template;

  public LaudoTecnico(List<Recomendacao> recomendacoes, OrdemDeServico ordemDeServico, double valorTotal, EquipamentoCliente equipamento, String laudo, Funcionario funcionario) {
    this.recomendacoes = recomendacoes;
    this.ordemDeServico = ordemDeServico;
    this.valorTotal = valorTotal;
    this.equipamento = equipamento;
    this.laudo = laudo;
    this.funcionario = funcionario;
  }

  public LaudoTecnico(List<Recomendacao> recomendacoes, OrdemDeServico ordemDeServico, EquipamentoCliente equipamento, String laudo, Funcionario funcionario) {
    this.recomendacoes = recomendacoes;
    this.ordemDeServico = ordemDeServico;
    this.equipamento = equipamento;
    this.laudo = laudo;
    this.funcionario = funcionario;

    this.valorTotal = this.calcularValorTotal();
    this.template = "laudo_tecnico";
  }

  private double calcularValorTotal() {
    double valorTotal = 0;
    for (Recomendacao recomendacao : recomendacoes) {
      valorTotal += recomendacao.getValor();
    }

    return valorTotal;
  }

  public Funcionario getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

  public OrdemDeServico getOrdemDeServico() {
    return ordemDeServico;
  }

  public void setOrdemDeServico(OrdemDeServico ordemDeServico) {
    this.ordemDeServico = ordemDeServico;
  }

  public List<Recomendacao> getRecomendacoes() {
    return recomendacoes;
  }

  public void setRecomendacoes(List<Recomendacao> recomendacoes) {
    this.recomendacoes = recomendacoes;
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

  public String getTemplate() {
    return this.template;
  }
  
  @Override
  public String toString() {
    return "LaudoTecnico{" +
        "recomendacoes=" + recomendacoes +
        ", valorTotal=" + valorTotal +
        ", equipamento=" + equipamento +
        ", laudo='" + laudo + '\'' +
        ", ordemDeServico=" + ordemDeServico +
        ", funcionario=" + funcionario +
        '}';
  }

}
