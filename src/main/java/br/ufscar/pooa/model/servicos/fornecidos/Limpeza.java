package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.Utilizavel;

import java.util.List;

public class Limpeza extends ServicoFornecido {

  public Limpeza(String nome, String descricao, List<Utilizavel> itens, Equipamento equipamento, double valor) {
    super(nome, descricao, itens, equipamento, valor);
  }

  public double calcularCusto() {
    return this.valor;
  }

  public String obterDescricao() {
    return "Limpeza: " + this.descricao;
  }
}
