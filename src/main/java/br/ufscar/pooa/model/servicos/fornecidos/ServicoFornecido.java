package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.comercio.Produto;
import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.services.IItemDeServico;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;

import java.util.List;

public abstract class ServicoFornecido implements Produto {
  protected String nome;
  protected String descricao;
  protected List<IItemDeServico> itens;
  protected EquipamentoAceitoParaServico equipamento;
  protected double valor;
  private int quantidadeDeServicosVendidos;

  public ServicoFornecido(String nome, String descricao, List<IItemDeServico> itens, EquipamentoAceitoParaServico equipamento, double valor) {
    this.nome = nome;
    this.descricao = descricao;
    this.itens = itens;
    this.equipamento = equipamento;
    this.valor = valor;

    this.quantidadeDeServicosVendidos = 0;
  }

  public abstract double calcularCusto();

  public abstract String obterDescricao();

  public double obterValor() {
    return this.valor;
  }

  public void registrarVenda(int quantidade) {
    this.quantidadeDeServicosVendidos += quantidade;
  }

  public void adicionarItem(IItemDeServico item) {
    itens.add(item);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public List<IItemDeServico> getItens() {
    return itens;
  }

  public void setItens(List<IItemDeServico> itens) {
    this.itens = itens;
  }

  public EquipamentoAceitoParaServico getEquipamento() {
    return equipamento;
  }

  public void setEquipamento(EquipamentoAceitoParaServico equipamento) {
    this.equipamento = equipamento;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public int getQuantidadeDeServicosVendidos() {
    return quantidadeDeServicosVendidos;
  }

  public void setQuantidadeDeServicosVendidos(int quantidadeDeServicosVendidos) {
    this.quantidadeDeServicosVendidos = quantidadeDeServicosVendidos;
  }

  @Override
  public String toString() {
    return "ServicoFornecido{" +
        "nome='" + nome + '\'' +
        ", descricao='" + descricao + '\'' +
        ", itens=" + itens +
        ", equipamento=" + equipamento +
        ", valor=" + valor +
        ", quantidadeDeServicosVendidos=" + quantidadeDeServicosVendidos +
        '}';
  }
}
