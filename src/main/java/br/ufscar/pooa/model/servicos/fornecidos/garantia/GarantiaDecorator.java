package br.ufscar.pooa.model.servicos.fornecidos.garantia;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.Utilizavel;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;

import java.util.List;

public abstract class GarantiaDecorator extends ServicoFornecido {
  protected ServicoFornecido servicoDecorado;


  public GarantiaDecorator(String nome,
                           String descricao,
                           List<Utilizavel> itens,
                           Equipamento equipamento,
                           double valor,
                           ServicoFornecido servicoDecorado) {
    super(nome, descricao, itens, equipamento, valor);
    this.servicoDecorado = servicoDecorado;
  }
}
