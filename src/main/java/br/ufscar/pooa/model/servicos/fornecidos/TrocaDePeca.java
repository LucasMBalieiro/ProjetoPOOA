package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.Utilizavel;

import java.util.List;

public class TrocaDePeca extends ServicoFornecido {

  public TrocaDePeca(String nome, String descricao, List<Utilizavel> itens, Equipamento equipamento, double valor) {
    super(nome, descricao, itens, equipamento, valor);
  }

  public double calcularCusto() {
    double valor = 0;

    for (Utilizavel item: this.itens) {
      valor += item.getValor();
    }

    return this.equipamento.getValorMaoDeObra() + valor;
  }

  public String obterDescricao() {
    return "Troca de peça: " + this.descricao;
  }
}
