package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.Utilizavel;

import java.util.List;

public abstract class ServicoFornecido {
  protected String nome;
  protected String descricao;
  protected List<Utilizavel> itens;
  protected Equipamento equipamento;
  protected double valor;

  public ServicoFornecido(String nome, String descricao, List<Utilizavel> itens, Equipamento equipamento, double valor) {
    this.nome = nome;
    this.descricao = descricao;
    this.itens = itens;
    this.equipamento = equipamento;
    this.valor = valor;
  }

  public abstract double calcularCusto();
  public abstract String obterDescricao();

  public void adicionarItem(Utilizavel item) {
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

  public List<Utilizavel> getItens() {
    return itens;
  }

  public void setItens(List<Utilizavel> itens) {
    this.itens = itens;
  }

  public Equipamento getEquipamento() {
    return equipamento;
  }

  public void setEquipamento(Equipamento equipamento) {
    this.equipamento = equipamento;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
